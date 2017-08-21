package com.project.dzakdzak.firstkotlin

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*

class HitungBangunDatar : AppCompatActivity() {

    //Deklarasi Variabel
//    var edt1: EditText? = null
//    var edt2: EditText? = null
//    var tvHasil: TextView? = null
//    var btnHasil: Button? = null
//    var btnPindah: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bangun_datar)

//        edt1 = findViewById(R.id.edtNilai1) as EditText?
//        edt2 = findViewById(R.id.edtNilai2) as EditText?
//        tvHasil = findViewById(R.id.txtHasil) as TextView?
//        btnHasil = findViewById(R.id.btnHasil) as Button?
//        btnPindah = findViewById(R.id.btnPindah) as Button?

        btnPindah?.setOnClickListener {
            var intent = Intent(applicationContext, MainActivity::class.java)
            intent.putExtra("nilai1", edtNilai1?.text.toString())
            intent.putExtra("nilai2", edtNilai2?.text.toString())
            intent.putExtra("hasil", txtHasil?.text.toString())
            startActivity(intent)
        }

        btnHasil?.setOnClickListener {

            //get inputan user
            var nilai1 = edtNilai1?.text.toString()
            var nilai2 = edtNilai2?.text.toString()

            if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
                //Convert String to Double
                var x = nilai1.toDouble()
                var y = nilai2.toDouble()

                //calculate
                var hasil = (x * y) / 2

                //pindah ke textview ada 2 cara
                //1
                txtHasil?.setText("Hasilnya Adalah :" + hasil.toString())
                //2
                txtHasil?.text = hasil.toString()
            } else {
                //deklarasi alert
                var alert = AlertDialog.Builder(this)
                alert.setMessage("Belum Di Isi Gan")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                            dialogInterface.dismiss()
                        })

                        .show()
            }


        }

    }
}
