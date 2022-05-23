package com.example.ensaame

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


class letras : Fragment(R.layout.fragment_letras) {

    var miVista : View? = null
    var miTexto1 : TextView? = null
    var miTexto2 : TextView? = null

    var Letra : String? = "Letra"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            // Inflate the layout for this fragment
            val view =  inflater.inflate(R.layout.fragment_letras, container, false)

            miVista = view
            miTexto1 = miVista?.findViewById(R.id.textView)
            miTexto2 = miVista?.findViewById(R.id.textView2)

        Toast.makeText(context , "El valor de letra es "+Letra, Toast.LENGTH_SHORT).show()

            when(Letra) {
                "A" -> {
                    miTexto1?.text = "Se eligió A"
                    miTexto2?.text = "Se eligió A"

                }
                "B" -> {
                    miTexto1?.text = "Se eligió B"
                    miTexto2?.text = "Se eligió B"

                }
                else -> {}
            }//Del when
        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            Toast.makeText(context , "+++++++++ Fragmento letras ++++++++", Toast.LENGTH_SHORT).show()


    }//-------------------------------------- Termina el OnViewCreated
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(arguments != null){
            Letra = arguments?.getString("carLetra")
        }

    }
} //Del fragment