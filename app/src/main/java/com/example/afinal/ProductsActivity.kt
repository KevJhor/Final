package com.example.afinal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.afinal.database.ProductoEntity
import com.example.afinal.model.ProductoViewModel

class ProductsActivity : AppCompatActivity() {
    private lateinit var viewModel: ProductoViewModel
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val btnRegister:Button = findViewById(R.id.btnRegister)
        val descripcion: EditText = findViewById(R.id.txtDescripcion)
        val cantidad: EditText = findViewById(R.id.txtCantidad)
        val precio: EditText = findViewById(R.id.txtPrecio)

        viewModel = ViewModelProvider(this).get(ProductoViewModel::class.java)

        btnRegister.setOnClickListener{
            val productoEntity =
                ProductoEntity(descripcion.text.toString()
                    , cantidad.text.toString().toInt()
                    , precio.text.toString().toDouble())
            viewModel.saveProducto(productoEntity)

        }
    }



}