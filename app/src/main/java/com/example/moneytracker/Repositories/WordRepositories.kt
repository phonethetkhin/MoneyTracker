package com.example.moneytracker.Repositories

import androidx.lifecycle.LiveData
import com.example.moneytracker.room.WordDao
import com.example.moneytracker.room.WordDatabase
import com.example.moneytracker.room.WordEntity

class WordRepositories(private val worddao:WordDao) {
    val allwords:LiveData<List<WordEntity>> = worddao.getAllwords()


    suspend fun insertwords(words:WordEntity)
    {
        worddao.insertWords(words)

    }


}