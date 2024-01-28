package com.example.moneytracker.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "words")
class WordEntity(

    @PrimaryKey(autoGenerate = true) val id:Int,
    @ColumnInfo(name = "words") val word:String


) {
}