package com.project.dzakdzak.firstkotlin.LATIHANMVP

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.project.dzakdzak.firstkotlin.R
import kotlinx.android.synthetic.main.activity_persegi_panjang.*

class PersegiPanjang : AppCompatActivity(), PresenterViewLatihan {


    var presenter : PresenterLatihan? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)

        btnHasilPP.setOnClickListener {
            presenter?.HitungPp(edtPP1.text.toString(), edtPP2.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        presenter = PresenterLatihan(this)
    }
    override fun Hasil(nilai: String) {
        txtHasilPP.text = nilai
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
