package com.example.ensaame

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_datos.*
import java.io.IOException


enum class ProviderType{
    BASIC,
    GOOGLE
}

class Datos : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

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
     txtCorreo.text = email
        txtProvedor.text = provider
        btnGuardar.setOnClickListener {
          try {
              db.collection("users").document(email).set(
                  hashMapOf(
                      "provider" to provider,
                      "Nombre" to txtNombre.text.toString(),
                      "ApellidoPaterno" to txtApellidoP.text.toString(),
                      "ApellidoMaterno" to txtApellidoM.text.toString(),
                      "Edad" to edad.text.toString(),
                      "Telefono" to Tel.text.toString(),
                      "Correo" to txtCorreo.text.toString(),
                      "Sexo" to txtSexo.text.toString(),
                  )
              )
              val toast = Toast.makeText(this, "Se Guardo Correctamente", Toast.LENGTH_SHORT)

          } catch (e: IOException){



          //  val toast = Toast.makeText(this, "Algo Salió Mal", Toast.LENGTH_SHORT)
          }
        }
    }
}