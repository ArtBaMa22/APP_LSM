package com.example.ensaame

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_glosario.*
import kotlinx.android.synthetic.main.fragment_glosario.view.*

class VideosFragment : Fragment(R.layout.fragment_glosario) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_glosario, container, false)

        return v

        //btnA.setOnClickListener(set)
    }
}


