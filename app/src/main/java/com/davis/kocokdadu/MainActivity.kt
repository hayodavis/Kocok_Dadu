package com.davis.kocokdadu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    // aktifkan gambar dadu
    lateinit var gambarDadu: ImageView
    lateinit var gambarDadu2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // aktifkan button kocok
        val tombolKocok: Button = findViewById(R.id.tombol_kocok)

        tombolKocok.setOnClickListener{ kocokDadu() }
        gambarDadu = findViewById(R.id.gambar_dadu)
        gambarDadu2 = findViewById(R.id.gambar_daduke2)
    }

    // buat fungsi kocok dadu
    private fun kocokDadu(){
        // panggil fungsi gambarAcak
        gambarDadu.setImageResource(gambarAcak())
        gambarDadu2.setImageResource(gambarAcak())
    }

    private fun gambarAcak() : Int {
        // buat variabel untuk angka acak
        val angkaAcak = (1..6).random()

        // memilih dadu sesuai nomor
       return when (angkaAcak) {
            1 -> R.drawable.dadu_1
            2 -> R.drawable.dadu_2
            3 -> R.drawable.dadu_3
            4 -> R.drawable.dadu_4
            5 -> R.drawable.dadu_5
            else -> R.drawable.dadu_6
        }
    }
}
