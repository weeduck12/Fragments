package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class Fragment1 : Fragment() {
    private lateinit var btnIncrement: Button
    private lateinit var txtCounter: TextView
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        btnIncrement = view.findViewById(R.id.btnIncrement)
        txtCounter = view.findViewById(R.id.txtCounter)

        txtCounter.text = counter.toString()

        btnIncrement.setOnClickListener {
            counter++
            txtCounter.text = counter.toString()
        }

        return view
    }
}