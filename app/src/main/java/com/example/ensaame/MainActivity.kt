package com.example.ensaame

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*

enum class ProviderType{
    BASIC,
    GOOGLE
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val perfilFragment = PerfilFragment()
        val leccionesFragment =LeccionesFragment()
        val videosFragment =VideosFragment()
        val avanceFragment =  SenasFragment()
        val letrasFragment = letras()

        bottomNavigationView.setOnNavigationItemSelectedListener {
             when(it.itemId){
                 R.id.perfil ->{

                     setCurrentFragment(perfilFragment)
                     true
                 }
                 R.id.lecciones ->{
                     setCurrentFragment(leccionesFragment)
                     true
                 }
                 R.id.senas ->{
                     setCurrentFragment(avanceFragment)
                     true
                 }
                 R.id.glosario ->{
                     setCurrentFragment(videosFragment)
                     true
                 }
                 R.id.contenedorLetras ->{
                     setCurrentFragment(letrasFragment)
                     true
                 }
               else->false
             }
        }
    }


    private fun setCurrentFragment(fragment: Fragment){
       supportFragmentManager.beginTransaction().apply {
           replace(R.id.containerView, fragment)
           commit()
       }

    }

}