package com.project.dzakdzak.firstkotlin.MVP

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.project.dzakdzak.firstkotlin.R
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*

class MainMVPActivity : AppCompatActivity(), PresenterView {


    var presenter : Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bangun_datar)

        btnHasil.setOnClickListener {

            presenter?.Hitung(edtNilai1.text.toString(),edtNilai2.text.toString())

        }
    }

    override fun onStart() {
        super.onStart()
        presenter = Presenter(this)
    }
    override fun Hasil(nilai: String) {
        txtHasil.text = nilai
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
