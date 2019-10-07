package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PokemonDao_Impl implements PokemonDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PokemonDto> __insertionAdapterOfPokemonDto;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public PokemonDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokemonDto = new EntityInsertionAdapter<PokemonDto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `pokemons` (`indexInResponse`,`name`,`url`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PokemonDto value) {
        stmt.bindLong(1, value.getIndexInResponse());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM pokemons";
        return _query;
      }
    };
  }

  @Override
  public void insert(final List<PokemonDto> posts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPokemonDto.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public DataSource.Factory<Integer, PokemonDto> posts() {
    final String _sql = "SELECT * FROM pokemons ORDER BY indexInResponse ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, PokemonDto>() {
      @Override
      public LimitOffsetDataSource<PokemonDto> create() {
        return new LimitOffsetDataSource<PokemonDto>(__db, _statement, false , "pokemons") {
          @Override
          protected List<PokemonDto> convertRows(Cursor cursor) {
            final int _cursorIndexOfIndexInResponse = CursorUtil.getColumnIndexOrThrow(cursor, "indexInResponse");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
            final List<PokemonDto> _res = new ArrayList<PokemonDto>(cursor.getCount());
            while(cursor.moveToNext()) {
              final PokemonDto _item;
              final String _tmpName;
              _tmpName = cursor.getString(_cursorIndexOfName);
              final String _tmpUrl;
              _tmpUrl = cursor.getString(_cursorIndexOfUrl);
              _item = new PokemonDto(_tmpName,_tmpUrl);
              final int _tmpIndexInResponse;
              _tmpIndexInResponse = cursor.getInt(_cursorIndexOfIndexInResponse);
              _item.setIndexInResponse(_tmpIndexInResponse);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public int getNextIndex() {
    final String _sql = "SELECT MAX(indexInResponse) + 1 FROM pokemons";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
