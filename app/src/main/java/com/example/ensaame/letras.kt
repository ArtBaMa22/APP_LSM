package com.example.ensaame

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class letras : Fragment(R.layout.fragment_letras) {

    var miVista : View? = null
    var miTexto1 : TextView? = null
    var miTexto2 : TextView? = null
    var imgLetra : ImageView? = null

    var Letra : String? = "Letra"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            // Inflate the layout for this fragment
            val view =  inflater.inflate(R.layout.fragment_letras, container, false)

            miVista = view
            miTexto1 = miVista?.findViewById(R.id.lblLetra)
            miTexto2 = miVista?.findViewById(R.id.lblDescLetr)
            imgLetra = miVista?.findViewById(R.id.imgLetra)


            when(Letra) {
                "A" -> {
                    miTexto1?.text = "A"
                    miTexto2?.text = "Con la mano cerrada, se muestran las uñas y se estira el dedo pulgar hacia un lado. La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.a)

                }
                "B" -> {
                    miTexto1?.text = "B"
                    miTexto2?.text = "Los dedos indice, medio, anular y meñique se estiran bien unidos y el pulgar se dobla hacia la palma, la cual mira al frente."
                    imgLetra?.setImageResource(R.drawable.b)

                }
                "C" -> {
                    miTexto1?.text = "C"
                    miTexto2?.text = "Los dedos índice, medio y anular y meñique se mantienen bien unidos y en posición cóncava, el pulgar también se pone en esa posición. La palma mira a un lado."
                    imgLetra?.setImageResource(R.drawable.c)


                }
                "D" -> {
                    miTexto1?.text = "D"
                    miTexto2?.text = "Los dedos medio, anular, meñique y pulgar se unen por las puntas y el dedo índice se estira. La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.d)

                }
                "E" -> {
                    miTexto1?.text = "E"
                    miTexto2?.text = "Se doblan los dedos completamente, y se muestran las uñas. La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.e)

                }
                "F" -> {
                    miTexto1?.text = "F"
                    miTexto2?.text = "Con la mano abierta y los dedos bien unidos, se dobla el índice hasta que su parte lateral toque la yema del pulgar. La palma mira a un lado."
                    imgLetra?.setImageResource(R.drawable.f)

                }
                "G" -> {
                    miTexto1?.text = "G"
                    miTexto2?.text = "Se cierra la mano y los dedos índice y pulgar se estiran. La palma mira hacia ti."
                    imgLetra?.setImageResource(R.drawable.g)

                }
                "H" -> {
                    miTexto1?.text = "H"
                    miTexto2?.text = "Con la mano cerrada y los dedos índice y medio bien estirados y unidos, se extiende el dedo pulgar señalando hacia arriba. La palma mira hacia ti."
                    imgLetra?.setImageResource(R.drawable.h)

                }
                "I" -> {
                    miTexto1?.text = "I"
                    miTexto2?.text = "Con la mano cerrada, el dedo meñique se estira señalando hacia arriba. La palma se pone de lado."
                    imgLetra?.setImageResource(R.drawable.i)

                }
                "J" -> {
                    miTexto1?.text = "J"
                    miTexto2?.text = "Con la mano cerrada, el dedo meñique bien estirado señalando hacia arriba y la palma a un lado dibuja una J en el aire."
                    imgLetra?.setImageResource(R.drawable.j)

                }
                "K" -> {
                    miTexto1?.text = "K"
                    miTexto2?.text = "Se cierra la mano con los dedos índice, medio y pulgar estirados. La yema del pulgar se pone entre el índice y el medio." +
                            "Se mueve la muñeca hacia arriba."
                    imgLetra?.setImageResource(R.drawable.k)
                }
                "L" -> {
                    miTexto1?.text = "L"
                    miTexto2?.text = "Con la mano cerrada y los dedos índice y pulgar estirados, se forma una L." +
                            "La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.l)

                }
                "LL" -> {
                    miTexto1?.text = "LL"
                    miTexto2?.text = "Con la mano cerrada y los dedos índice y pulgar estirados, se forma una L." +
                            "La palma mira al frente y se mueve la mano de un lado a otro."
                    imgLetra?.setImageResource(R.drawable.l)

                }
                "M" -> {
                    miTexto1?.text = "M"
                    miTexto2?.text = "Con la mano cerrada, se ponen los dedos índice y pulgar, medio y anular sobre el pulgar."
                    imgLetra?.setImageResource(R.drawable.m)
                }
                "N" -> {
                    miTexto1?.text = "N"
                    miTexto2?.text = "Con la mano cerrada, se ponen los dedos índice y medio sobre el pulgar."
                    imgLetra?.setImageResource(R.drawable.n)
                }
                "Ñ" -> {
                    miTexto1?.text = "Ñ"
                    miTexto2?.text = "Con la mano cerrada, se ponen los dedos índice y medio sobre el pulgar. Se mueve la muñeca a los lados."
                    imgLetra?.setImageResource(R.drawable.n2)
                }
                "O" -> {
                    miTexto1?.text = "O"
                    miTexto2?.text = "Con la mano se forma una letra O. Todos los dedos se tocan por las puntas."
                    imgLetra?.setImageResource(R.drawable.o)

                }
                "P" -> {
                    miTexto1?.text = "P"
                    miTexto2?.text = "Con la mano cerrada y los dedos índice, medio y pulgar estirados, se pone la yema del pulgar entre el índice y el medio."
                    imgLetra?.setImageResource(R.drawable.p)
                }
                "Q" -> {
                    miTexto1?.text = "Q"
                    miTexto2?.text = "Con la mano cerrada, se ponen los dedos índice y pulgar en posición de garra." +
                            "La Palma mira hacia abajo, y se mueve la muñeca hacia los lados."
                    imgLetra?.setImageResource(R.drawable.q)
                }
                "R" -> {
                    miTexto1?.text = "R"
                    miTexto2?.text = "Con la mano cerrada, se estiran y estrlazan los dedos índice y medio. La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.r)
                }
                "RR" -> {
                    miTexto1?.text = "RR"
                    miTexto2?.text = "Con la mano cerrada, se estiran y entrelazan los dedos índice y medio." +
                            "La palma mira al frente y se mueve la mano de un lado a otro."
                    imgLetra?.setImageResource(R.drawable.r)
                }
                "S" -> {
                    miTexto1?.text = "S"
                    miTexto2?.text = "Con la mano cerrada, se pone el pulgar sobre los otros dedos. La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.s)
                }
                "T" -> {
                    miTexto1?.text = "T"
                    miTexto2?.text = "Con la mano cerrada, el pulgar se pone entre el índice y el medio." +
                            "La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.t)
                }
                "U" -> {
                    miTexto1?.text = "U"
                    miTexto2?.text = "Con la mano cerrada, se estiran los dedos índice y medio unidos." +
                            "La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.u)
                }
                "V" -> {
                    miTexto1?.text = "V"
                    miTexto2?.text = "Con la mano cerrada, se estiran los dedos índice y medio separados." +
                            "La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.v)
                }
                "W" -> {
                    miTexto1?.text = "W"
                    miTexto2?.text = "Con la mano cerrada, se estiran los dedos índice, medio y anular separados." +
                            "La palma mira al frente."
                    imgLetra?.setImageResource(R.drawable.w)
                }
                "X" -> {
                    miTexto1?.text = "X"
                    miTexto2?.text = "Con la mano cerrada, el índice y el pulgar en posición de garra y la palma dirigida a un lado, " +
                            "se realiza un movimiento al frente y de regreso."
                    imgLetra?.setImageResource(R.drawable.x)
                }
                "Y" -> {
                    miTexto1?.text = "Y"
                    miTexto2?.text = "Con la mano cerrada, se estiran el meñique y el pulgar. La palma mira hacia ti.."
                    imgLetra?.setImageResource(R.drawable.y)
                }
                "Z" -> {
                    miTexto1?.text = "Z"
                    miTexto2?.text = "Con la mano cerrada, el dedo índice estirado y la palma al frente, se dibuja una letra Z en el aire.."
                    imgLetra?.setImageResource(R.drawable.z)
                }
                else -> {}
            }//Del when
        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }//-------------------------------------- Termina el OnViewCreated
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(arguments != null){
            Letra = arguments?.getString("carLetra")
        }

    }
} //Del fragment