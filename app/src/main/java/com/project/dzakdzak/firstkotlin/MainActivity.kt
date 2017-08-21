package com.project.dzakdzak.firstkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    var angka1 = 25
    var angka2 = 35
    var angka3 = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tangkap1 = intent.getStringExtra("nilai1")
        var tangkap2 = intent.getStringExtra("nilai2")
        var tangkap3 = intent.getStringExtra("hasil")

        Toast.makeText(applicationContext, "Nilai 1 = " + tangkap1 + " Nilai 2 = " + tangkap2 + " Hasilnya = " + tangkap3, Toast.LENGTH_LONG).show()

        //calculate
        var hasil = angka1 * angka2 * angka3
        println(hasil)

        Log.d("hasilnya :", hasil.toString())
    }
}
