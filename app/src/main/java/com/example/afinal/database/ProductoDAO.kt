package com.example.afinal.database

import androidx.room.Dao
import androidx.room.Insert
import com.example.afinal.model.Producto
@Dao
interface ProductoDAO {
    @Insert
    fun insert(productoEntity: ProductoEntity)
}