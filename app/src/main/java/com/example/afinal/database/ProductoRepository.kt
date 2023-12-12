package com.example.afinal.database

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
class ProductoRepository(application: Application) {

    private val productoDao:
            ProductoDAO? = ProductoDB
        .getInstance(application)?.productoDao()

    fun insert(productoEntity: ProductoEntity){
        if(productoDao!=null)
            InsertAsyncTask(productoDao).execute(productoEntity)

    }

    private class InsertAsyncTask
        (private val productoDao: ProductoDAO): AsyncTask<ProductoEntity, Void, Void>(){
        override fun doInBackground(vararg productos: ProductoEntity?): Void? {
            for(product in productos){
                if(product!=null)
                    productoDao.insert(product)
            }
            return null
        }
    }
}