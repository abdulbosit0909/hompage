package com.example.kourse4

import android.content.Context
import android.content.SharedPreferences

const val CACHE = "app"

class Korlinfilw {
    companion object{
        private fun getInstance(context: Context): SharedPreferences {
            return context.getSharedPreferences(CACHE, Context.MODE_PRIVATE)
        }
        fun getData(context: Context, key: String): String{
            return getInstance(context).getString(key, "default").toString()
        }
        fun setData(context: Context, key: String, value: String) {
            getInstance(context).edit().putString(key, value).apply()
        }
    }
}