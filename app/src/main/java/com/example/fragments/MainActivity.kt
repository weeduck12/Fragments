package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boutonpage1 : Button = findViewById(R.id.button)
        val boutonpage2 : Button = findViewById(R.id.button2)

        val fragment1 : Fragment1 = Fragment1()
        val fragment2 : Fragment2 = Fragment2()

        boutonpage1.setOnClickListener {
            remplaceFragment(fragment1)
        }
        boutonpage2.setOnClickListener{
            remplaceFragment(fragment2)
        }
    }

    private fun remplaceFragment(fragment : Fragment)
    {
        val fragMan : FragmentManager = supportFragmentManager
        val fragTran = fragMan.beginTransaction()
        fragTran.replace(R.id.fragmentContainerView, fragment)
        fragTran.commit()
    }
}