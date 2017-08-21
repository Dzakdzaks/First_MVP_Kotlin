package com.project.dzakdzak.firstkotlin.LATIHANMVP

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.project.dzakdzak.firstkotlin.R
import kotlinx.android.synthetic.main.activity_segitiga.*

class Segitiga : AppCompatActivity(), PresenterViewLatihan {


    var presenter : PresenterLatihan? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        btnHasilSegitiga.setOnClickListener {
            presenter?.HitungSegitiga(edtSegitiga1.text.toString(), edtSegitiga2.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        presenter = PresenterLatihan(this)
    }
    override fun Hasil(nilai: String) {
        txtHasilSegitiga.text = nilai
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
