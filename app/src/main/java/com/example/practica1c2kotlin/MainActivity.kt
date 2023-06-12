package com.example.practica1c2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var spnPaises: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spnPaises = findViewById(R.id.spnPaises)
        val adaptador = ArrayAdapter<String>(
            this,
            android.R.layout.simple_expandable_list_item_1,
            resources.getStringArray(R.array.paises)
        )
        spnPaises.adapter = adaptador
        spnPaises.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                Toast.makeText(
                    this@MainActivity,
                    "Selecciono el pais " + adapterView.getItemAtPosition(i).toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }



    }
}
