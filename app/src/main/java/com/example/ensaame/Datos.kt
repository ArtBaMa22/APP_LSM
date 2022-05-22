package com.example.ensaame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datos.*
import kotlinx.android.synthetic.main.fragment_perfil.*


class Datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        val bundle: Bundle? = intent.extras
        val email: String? = bundle?.getString("email")
        val provider: String? = bundle?.getString("provider")
        setup(email ?:"",provider ?:"")
    }

    private fun setup(email:String, provider: String){
        title = "Inicio"
        textView4.text = email
        textView5.text = provider
    }
}