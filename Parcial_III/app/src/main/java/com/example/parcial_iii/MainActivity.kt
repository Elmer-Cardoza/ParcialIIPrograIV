package com.example.parcial_iii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.*



class MainActivity : AppCompatActivity() {
    private lateinit var tv_Mostrar: TextView
    private lateinit var lv_Lista: ListView

    private val Mascota = arrayOf("Firulais", "Chanito", "Pana Rabbit", "Lucas", "Paco")

    private val Especie = arrayOf("Perro", "Gato", "Conejo", "Hamster", "Pollo")

    private val color = arrayOf("Blanco y negro", "Barsino", "Blanco", "Cafe", "Colorado")

    private val sexo = arrayOf("Masculino", "Masculino", "Fenemenino", "Masculino", "Masculino")

    private val peso = arrayOf("15 Kg", "2 Kg", "3 Kg", "0.5 Kg", "200 Kg",)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_Mostrar = findViewById(R.id.tv_Mostrar)
        lv_Lista = findViewById(R.id.lv_View)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, Mascota)
        lv_Lista.adapter = adaptador

        lv_Lista.setOnItemClickListener { AdapterView, view, i, l ->
            tv_Mostrar.setText(
                "Los datos del " + lv_Lista.getItemAtPosition(i) + " son: "+" Especie: "+ Especie[i] + ", Color: " + color[i] + ", sexo: " +
                        sexo[i] + ", y pesa: " + peso[i]
            )

        }
    }

}