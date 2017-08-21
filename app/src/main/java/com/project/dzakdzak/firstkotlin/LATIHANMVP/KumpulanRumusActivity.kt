package com.project.dzakdzak.firstkotlin.LATIHANMVP

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.project.dzakdzak.firstkotlin.R
import kotlinx.android.synthetic.main.activity_kumpulan_rumus.*

class KumpulanRumusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kumpulan_rumus)

        btnSegitiga.setOnClickListener {
            var intent = Intent(this, Segitiga::class.java)
            startActivity(intent)
        }
        btnPersegi.setOnClickListener {
            var intent = Intent(this, Persegi::class.java)
            startActivity(intent)        }
        btnPersegiPanjang.setOnClickListener {
            var intent = Intent(this, PersegiPanjang::class.java)
            startActivity(intent)        }
    }
}
