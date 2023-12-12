package com.example.afinal.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("producto")
class ProductoEntity(
    @ColumnInfo("Descripcion") var descripcion: String?,
    @ColumnInfo("Cantidad") var cantidad: Int?,
    @ColumnInfo("Precio") var precio: Double?
) {
    @PrimaryKey(true)
    @ColumnInfo("producto_id") var productoId: Int = 0
}