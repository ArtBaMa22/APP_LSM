package com.example.ensaame

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datos.*
import kotlinx.android.synthetic.main.fragment_perfil.*

enum class ProviderType{
    BASIC,
    GOOGLE
}
class Datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        val bundle: Bundle? = intent.extras
       // val bundle: Bundle? = null
        val email: String? = bundle?.getString("email")
        val provider: String? = bundle?.getString("provider")
        setup(email ?:"",provider ?:"")

        // Guardado de datos




        val prefs = getSharedPreferences(getString(R.string.prefs_file),Context.MODE_PRIVATE).edit()
        prefs.putString("email",email)
        prefs.putString("provider",provider)
        prefs.apply()

    }



    private fun setup(email:String, provider: String){
     textView4.text = email
        textView5.text = provider
    }

}