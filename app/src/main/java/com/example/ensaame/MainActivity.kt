package com.example.ensaame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_perfil.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



     //   val bundle: Bundle? = intent.extras
        // val bundle: Bundle? = null
       // val email: String? = bundle?.getString("email")
        //val provider: String? = bundle?.getString("provider")
        //setup(email ?:"",provider ?:"")

        // Guardado de datos




       // val prefs = getSharedPreferences(getString(R.string.prefs_file),Context.MODE_PRIVATE).edit()
       // prefs.putString("email",email)
        //prefs.putString("provider",provider)
        //prefs.apply()




        val perfilFragment = PerfilFragment()
        val leccionesFragment =LeccionesFragment()
        val glosarioFragment =GlosarioFragment()
        val avanceFragment =  SenasFragment()
        val letrasFragment = letras()
recibe()

        // Guardado de datos
      // val prefs = getSharedPreferences(getString(R.string.prefs_file),Context.MODE_PRIVATE).edit()
        //prefs.putString("email",email)
        //prefs.putString("provider",provider)
       //prefs.apply()



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
                     setCurrentFragment(glosarioFragment)
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
    private fun setup(email:String, provider: String){
        txtViwEmail.text = email
        textViewProvedor.text = provider
    }

    private fun recibe(){

        val bundle: Bundle? = intent.extras
        val email: String? = bundle?.getString("email")
        val provider: String? = bundle?.getString("provider")
        valores(email ?:"",provider ?:"")
    }


    private fun valores(email:String,provider: String){
        val bundle = Bundle()
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        bundle.putString("email", email.toString())
        bundle.putString("provider", email)
        var frag = PerfilFragment()
        frag.arguments = bundle
        mFragmentTransaction.add(R.id.containerView, frag).commit()


//        val mEditText = findViewById<EditText>(R.id.editText)
  //      val mButton = findViewById<Button>(R.id.button)

    }



    private fun setCurrentFragment(fragment: Fragment){
       supportFragmentManager.beginTransaction().apply {
           replace(R.id.containerView, fragment)
           commit()
       }

    }



}