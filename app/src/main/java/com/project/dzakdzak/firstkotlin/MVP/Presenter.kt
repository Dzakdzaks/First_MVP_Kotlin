package com.project.dzakdzak.firstkotlin.MVP

/**
 * Created by Dzaky on 21/08/2017.
 */
class Presenter {
    var presenterView: PresenterView? = null

    constructor(presenterView: PresenterView?) {
        this.presenterView = presenterView
    }
    fun Hitung (nilai1 : String, nilai2 : String){
        if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            //Convert String to Double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()

            //calculate
            var hasil = (x * y) / 2

            presenterView?.Hasil(hasil.toString())
        } else {
//            //deklarasi alert
//            var alert = AlertDialog.Builder(this)
//            alert.setMessage("Belum Di Isi Gan")
//                    .setIcon(R.mipmap.ic_launcher)
//                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
//                        dialogInterface.dismiss()
//                    })
//
//                    .show()
        }


    }

}
