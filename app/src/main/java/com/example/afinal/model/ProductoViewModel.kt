package com.example.afinal.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.afinal.database.ProductoEntity
import com.example.afinal.database.ProductoRepository

class ProductoViewModel(application: Application): AndroidViewModel(application)  {
    private var repository = ProductoRepository(application)

    fun saveProducto(productoEntity: ProductoEntity){
        repository.insert(productoEntity)
    }
}