package com.example.afinal.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities= [ProductoEntity::class], version = 1)
abstract class ProductoDB: RoomDatabase() {

    abstract fun productoDao(): ProductoDAO

    companion object {
        private const val DATABASE_NAME = "productos"
        @Volatile
        private var INSTANCE: ProductoDB?=null

        fun getInstance(context: Context): ProductoDB?{
            INSTANCE?: synchronized(this){
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    ProductoDB::class.java,
                    DATABASE_NAME
                ).build()
            }
            return INSTANCE
        }
    }

}