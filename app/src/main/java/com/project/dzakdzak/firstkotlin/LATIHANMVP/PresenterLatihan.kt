package com.project.dzakdzak.firstkotlin.LATIHANMVP

/**
 * Created by Dzaky on 21/08/2017.
 */
class PresenterLatihan  {

    var presenterViewLatihan: PresenterViewLatihan? = null

    constructor(presenterViewLatihan: PresenterViewLatihan?) {
        this.presenterViewLatihan = presenterViewLatihan
    }

    fun HitungSegitiga(nilai1: String, nilai2: String) {
        if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            //Convert String to Double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()

            //calculate
            var hasil = (x * y) / 2

            presenterViewLatihan?.Hasil(hasil.toString())
        } else {

        }
    }
    fun HitungPersegi(nilaipersegi1: String, nilaipersegi2: String) {
        if (nilaipersegi1.isNotEmpty() && nilaipersegi2.isNotEmpty()) {
            //Convert String to Double
            var x = nilaipersegi1.toDouble()
            var y = nilaipersegi2.toDouble()

            //calculate
            var hasil = (x * y)

            presenterViewLatihan?.Hasil(hasil.toString())
        } else {

        }
    }
    fun HitungPp(nilaipersegi1: String, nilaipersegi2: String) {
        if (nilaipersegi1.isNotEmpty() && nilaipersegi2.isNotEmpty()) {
            //Convert String to Double
            var x = nilaipersegi1.toDouble()
            var y = nilaipersegi2.toDouble()

            //calculate
            var hasil = (x * y)

            presenterViewLatihan?.Hasil(hasil.toString())
        } else {

        }
    }


}
