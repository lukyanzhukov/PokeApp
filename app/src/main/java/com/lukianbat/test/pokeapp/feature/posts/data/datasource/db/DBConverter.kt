package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class DBConverter {
    companion object {
        @TypeConverter
        @JvmStatic
        fun toStringList(str: String): List<String> {
            val gson = Gson()
            val type = object : TypeToken<List<String>>() {}.type
            return gson.fromJson(str, type)
        }

        @TypeConverter
        @JvmStatic
        fun fromStringList(list: List<String>): String {
            val gson = Gson()
            val type = object : TypeToken<List<String>>() {}.type
            return gson.toJson(list, type)
        }
    }
}