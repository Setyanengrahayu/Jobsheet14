package com.example.job14_setya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val Tpfl = findViewById<Button>(R.id.fragmentTpfl)
       val To = findViewById<Button>(R.id.fragmentTo)
       val Pplg = findViewById<Button>(R.id.fragmentPplg)
       val Busana = findViewById<Button>(R.id.fragmentBusana)
       val Kuliner = findViewById<Button>(R.id.fragmentKuliner)

       Tpfl.setOnClickListener{
           val fragmentTransaction = supportFragmentManager.beginTransaction()
           fragmentTransaction.replace(R.id.fragmentContainer, Tpfl_Fragment())
           fragmentTransaction.commit()
       }

        To.setOnClickListener{
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, To2_Fragment())
            fragmentTransaction.commit()
        }

        Pplg.setOnClickListener{
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Pplg_Fragment())
            fragmentTransaction.commit()
        }

        Busana.setOnClickListener{
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Busana_Fragment())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener{
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Kuliner_Fragment())
            fragmentTransaction.commit()
        }
    }
}