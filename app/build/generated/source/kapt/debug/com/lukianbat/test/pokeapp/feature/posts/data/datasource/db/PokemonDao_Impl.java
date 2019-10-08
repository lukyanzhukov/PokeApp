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
        return "INSERT OR REPLACE INTO `pokemons` (`name`,`url`,`attack`,`defence`,`hp`,`types`,`abilities`,`height`,`weight`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PokemonDto value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        stmt.bindLong(3, value.getAttack());
        stmt.bindLong(4, value.getDefence());
        stmt.bindLong(5, value.getHp());
        final String _tmp;
        _tmp = DBConverter.fromStringList(value.getTypes());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = DBConverter.fromStringList(value.getAbilities());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_1);
        }
        stmt.bindLong(8, value.getHeight());
        stmt.bindLong(9, value.getWeight());
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
    final String _sql = "SELECT * FROM pokemons ORDER BY attack ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, PokemonDto>() {
      @Override
      public LimitOffsetDataSource<PokemonDto> create() {
        return new LimitOffsetDataSource<PokemonDto>(__db, _statement, false , "pokemons") {
          @Override
          protected List<PokemonDto> convertRows(Cursor cursor) {
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
            final int _cursorIndexOfAttack = CursorUtil.getColumnIndexOrThrow(cursor, "attack");
            final int _cursorIndexOfDefence = CursorUtil.getColumnIndexOrThrow(cursor, "defence");
            final int _cursorIndexOfHp = CursorUtil.getColumnIndexOrThrow(cursor, "hp");
            final int _cursorIndexOfTypes = CursorUtil.getColumnIndexOrThrow(cursor, "types");
            final int _cursorIndexOfAbilities = CursorUtil.getColumnIndexOrThrow(cursor, "abilities");
            final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(cursor, "height");
            final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(cursor, "weight");
            final List<PokemonDto> _res = new ArrayList<PokemonDto>(cursor.getCount());
            while(cursor.moveToNext()) {
              final PokemonDto _item;
              final String _tmpName;
              _tmpName = cursor.getString(_cursorIndexOfName);
              final String _tmpUrl;
              _tmpUrl = cursor.getString(_cursorIndexOfUrl);
              final int _tmpAttack;
              _tmpAttack = cursor.getInt(_cursorIndexOfAttack);
              final int _tmpDefence;
              _tmpDefence = cursor.getInt(_cursorIndexOfDefence);
              final int _tmpHp;
              _tmpHp = cursor.getInt(_cursorIndexOfHp);
              final List<String> _tmpTypes;
              final String _tmp;
              _tmp = cursor.getString(_cursorIndexOfTypes);
              _tmpTypes = DBConverter.toStringList(_tmp);
              final List<String> _tmpAbilities;
              final String _tmp_1;
              _tmp_1 = cursor.getString(_cursorIndexOfAbilities);
              _tmpAbilities = DBConverter.toStringList(_tmp_1);
              final int _tmpHeight;
              _tmpHeight = cursor.getInt(_cursorIndexOfHeight);
              final int _tmpWeight;
              _tmpWeight = cursor.getInt(_cursorIndexOfWeight);
              _item = new PokemonDto(_tmpName,_tmpUrl,_tmpAttack,_tmpDefence,_tmpHp,_tmpTypes,_tmpAbilities,_tmpHeight,_tmpWeight);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }
}
