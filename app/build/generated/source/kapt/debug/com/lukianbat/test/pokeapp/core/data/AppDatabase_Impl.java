package com.lukianbat.test.pokeapp.core.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonDao;
import com.lukianbat.test.pokeapp.feature.posts.data.datasource.db.PokemonDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile PokemonDao _pokemonDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `pokemons` (`name` TEXT NOT NULL, `url` TEXT NOT NULL, `attack` INTEGER NOT NULL, `defence` INTEGER NOT NULL, `hp` INTEGER NOT NULL, `types` TEXT NOT NULL, `abilities` TEXT NOT NULL, `height` INTEGER NOT NULL, `weight` INTEGER NOT NULL, PRIMARY KEY(`name`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0a77e197591305f90ddbb8bc57256527')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `pokemons`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPokemons = new HashMap<String, TableInfo.Column>(9);
        _columnsPokemons.put("name", new TableInfo.Column("name", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemons.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemons.put("attack", new TableInfo.Column("attack", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemons.put("defence", new TableInfo.Column("defence", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemons.put("hp", new TableInfo.Column("hp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemons.put("types", new TableInfo.Column("types", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemons.put("abilities", new TableInfo.Column("abilities", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemons.put("height", new TableInfo.Column("height", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemons.put("weight", new TableInfo.Column("weight", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPokemons = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPokemons = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPokemons = new TableInfo("pokemons", _columnsPokemons, _foreignKeysPokemons, _indicesPokemons);
        final TableInfo _existingPokemons = TableInfo.read(_db, "pokemons");
        if (! _infoPokemons.equals(_existingPokemons)) {
          return new RoomOpenHelper.ValidationResult(false, "pokemons(com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto).\n"
                  + " Expected:\n" + _infoPokemons + "\n"
                  + " Found:\n" + _existingPokemons);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "0a77e197591305f90ddbb8bc57256527", "da0a99054639e0fb79504e5dcbddc4cf");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "pokemons");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `pokemons`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PokemonDao redditEntryDao() {
    if (_pokemonDao != null) {
      return _pokemonDao;
    } else {
      synchronized(this) {
        if(_pokemonDao == null) {
          _pokemonDao = new PokemonDao_Impl(this);
        }
        return _pokemonDao;
      }
    }
  }
}
