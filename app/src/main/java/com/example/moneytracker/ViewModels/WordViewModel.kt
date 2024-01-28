package com.example.moneytracker.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.moneytracker.Repositories.WordRepositories
import com.example.moneytracker.room.WordDao
import com.example.moneytracker.room.WordDatabase
import com.example.moneytracker.room.WordEntity
import kotlinx.coroutines.launch

class WordViewModel(application: Application) : AndroidViewModel(application) {

    lateinit var wordDao:WordDao
    lateinit var repositories:WordRepositories
    lateinit var allwords:LiveData<List<WordEntity>>

    init {
            wordDao=WordDatabase.getDatabase(application).WordDao()
        repositories= WordRepositories(wordDao)

        allwords=repositories.allwords
    }

    fun insert(word:WordEntity)=viewModelScope.launch {
        repositories.insertwords(word)
    }
}