package com.example.moneytracker.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(WordEntity::class),version = 1,exportSchema = false)
public abstract class WordDatabase:RoomDatabase()
{
abstract fun WordDao():WordDao
    companion object
    {
        @Volatile
        private var INSTANCE:WordDatabase?=null

        fun getDatabase(context:Context):WordDatabase
        {
            val tempinstance= INSTANCE
            if(tempinstance!=null)
            {
                return tempinstance
            }
            synchronized(this)
            {
                val instance= Room.databaseBuilder(context.applicationContext,WordDatabase::class.java,"words").build()
                INSTANCE= instance
                return instance
            }
        }
    }
}
