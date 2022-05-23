package com.example.ensaame


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.ensaame.Interface.IOnBackPressed
import kotlinx.android.synthetic.main.activity_datos.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_letras.*
import kotlinx.android.synthetic.main.fragment_perfil.*


class PerfilFragment : Fragment(R.layout.fragment_perfil), IOnBackPressed {
    lateinit var opciones: Spinner
    lateinit var car: CardView
    lateinit var vista: View
    lateinit var vista2: View
    lateinit var actividad: Activity
    var provider: String? = "Que"
    var email1: String? = "Hola"

    var emaill: TextView? = null
    var mprovider: TextView? = null
    var misLetra: EditText? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_perfil, containerView, false)



        if (arguments != null) {
            email1 = arguments?.getString("email")!!
            provider = arguments?.getString("provider")
            Toast.makeText(getContext(), email1, Toast.LENGTH_SHORT).show()
        }


        //   misLetra = vista?.findViewById(R.id.txtViwEmail) as EditText
        // misLetra.text = email1

        return vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardDatos.setOnClickListener {
            val editProfileIntent = Intent(activity, Datos::class.java)
            startActivity(editProfileIntent)

        }

        AcercaDe.setOnClickListener {
            val frag= AcercaDeFragment()
            var fr = getFragmentManager()?.beginTransaction()
            fr?.replace(R.id.containerView, frag)
            fr?.addToBackStack(null)
            fr?.commit()
        }

        cerrarSesion.setOnClickListener {
          //   val prefs = getSharedPreferences(getString(R.string.prefs_file),Context.MODE_PRIVATE).edit()
           // prefs.clear
            //prefs.apply()
        }


    }

    //cerra sesion
    // val prefs = getSharedPreferences(getString(R.string.prefs_file),Context.MODE_PRIVATE).edit()
    //prefs.clear
    //prefs.apply()
    //  override fun onAttach(context: Context) {
    //    super.onAttach(context)
    //  if (arguments != null) {
    //    email1 = arguments?.getString("email")!!
    //  provider = arguments?.getString("provider")
    // Toast.makeText(getContext(), email1, Toast.LENGTH_SHORT).show()
    //setup(email1 ?:"",provider ?:"")

//        }
    //  }

    private fun setup(email:String, provider: String){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onBackPressed(): Boolean {
                TODO("Not yet implemented")

    }
}
