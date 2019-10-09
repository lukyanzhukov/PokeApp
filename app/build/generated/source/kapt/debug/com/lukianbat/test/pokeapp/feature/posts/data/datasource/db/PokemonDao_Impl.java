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
        return "INSERT OR REPLACE INTO `pokemons` (`indexInResponse`,`name`,`url`,`attack`,`defence`,`hp`,`types`,`abilities`,`height`,`weight`) VALUES (?,?,?,?,?,?,?,?,?,?)";
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
        stmt.bindLong(4, value.getAttack());
        stmt.bindLong(5, value.getDefence());
        stmt.bindLong(6, value.getHp());
        if (value.getTypes() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTypes());
        }
        if (value.getAbilities() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getAbilities());
        }
        stmt.bindLong(9, value.getHeight());
        stmt.bindLong(10, value.getWeight());
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

  @Override
  public DataSource.Factory<Integer, PokemonDto> pokemonsByAttack() {
    final String _sql = "SELECT * FROM pokemons ORDER BY attack ASC";
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
              final String _tmpTypes;
              _tmpTypes = cursor.getString(_cursorIndexOfTypes);
              final String _tmpAbilities;
              _tmpAbilities = cursor.getString(_cursorIndexOfAbilities);
              final int _tmpHeight;
              _tmpHeight = cursor.getInt(_cursorIndexOfHeight);
              final int _tmpWeight;
              _tmpWeight = cursor.getInt(_cursorIndexOfWeight);
              _item = new PokemonDto(_tmpName,_tmpUrl,_tmpAttack,_tmpDefence,_tmpHp,_tmpTypes,_tmpAbilities,_tmpHeight,_tmpWeight);
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
  public DataSource.Factory<Integer, PokemonDto> pokemonsByDefence() {
    final String _sql = "SELECT * FROM pokemons ORDER BY defence ASC";
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
              final String _tmpTypes;
              _tmpTypes = cursor.getString(_cursorIndexOfTypes);
              final String _tmpAbilities;
              _tmpAbilities = cursor.getString(_cursorIndexOfAbilities);
              final int _tmpHeight;
              _tmpHeight = cursor.getInt(_cursorIndexOfHeight);
              final int _tmpWeight;
              _tmpWeight = cursor.getInt(_cursorIndexOfWeight);
              _item = new PokemonDto(_tmpName,_tmpUrl,_tmpAttack,_tmpDefence,_tmpHp,_tmpTypes,_tmpAbilities,_tmpHeight,_tmpWeight);
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
  public DataSource.Factory<Integer, PokemonDto> pokemonsByHp() {
    final String _sql = "SELECT * FROM pokemons ORDER BY hp ASC";
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
              final String _tmpTypes;
              _tmpTypes = cursor.getString(_cursorIndexOfTypes);
              final String _tmpAbilities;
              _tmpAbilities = cursor.getString(_cursorIndexOfAbilities);
              final int _tmpHeight;
              _tmpHeight = cursor.getInt(_cursorIndexOfHeight);
              final int _tmpWeight;
              _tmpWeight = cursor.getInt(_cursorIndexOfWeight);
              _item = new PokemonDto(_tmpName,_tmpUrl,_tmpAttack,_tmpDefence,_tmpHp,_tmpTypes,_tmpAbilities,_tmpHeight,_tmpWeight);
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
  public DataSource.Factory<Integer, PokemonDto> pokemons() {
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
              final String _tmpTypes;
              _tmpTypes = cursor.getString(_cursorIndexOfTypes);
              final String _tmpAbilities;
              _tmpAbilities = cursor.getString(_cursorIndexOfAbilities);
              final int _tmpHeight;
              _tmpHeight = cursor.getInt(_cursorIndexOfHeight);
              final int _tmpWeight;
              _tmpWeight = cursor.getInt(_cursorIndexOfWeight);
              _item = new PokemonDto(_tmpName,_tmpUrl,_tmpAttack,_tmpDefence,_tmpHp,_tmpTypes,_tmpAbilities,_tmpHeight,_tmpWeight);
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
}
