package com.example.moneytracker.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface WordDao {

    @Query("SELECT * FROM words")
    fun getAllwords():LiveData<List<WordEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWords(words:WordEntity)

    @Update
    suspend fun updateWords(words:WordEntity)

    @Delete
    suspend fun deleteWords(words: WordEntity)
}