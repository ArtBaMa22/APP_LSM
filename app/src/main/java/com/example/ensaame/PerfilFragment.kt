package com.example.ensaame

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Spinner
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.ensaame.Interface.IOnBackPressed
import com.google.firebase.auth.FirebaseAuth


import kotlinx.android.synthetic.main.fragment_perfil.*
import kotlinx.coroutines.newSingleThreadContext


class PerfilFragment : Fragment(R.layout.fragment_perfil), IOnBackPressed {
    lateinit var opciones: Spinner
    lateinit var car: CardView
    lateinit var vista: View
    lateinit var vista2: View
    lateinit var actividad: Activity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_perfil, container, false)
        car = vista.findViewById(R.id.cardDatos)
        car.setOnClickListener({
            val editProfileIntent = Intent(activity, Datos::class.java)
            activity?.startActivity(editProfileIntent)
    })



            return vista
    }

    //private fun setup(email:String, provider: String){
      //  txtViwEmail.text = email
       // textViewProvedor.text = provider


    //}

    override fun onBackPressed(): Boolean {
                TODO("Not yet implemented")

    }
}
