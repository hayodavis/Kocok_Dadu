package com.davis.kocokdadu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // aktifkan button kocok
        val tombolKocok: Button = findViewById(R.id.tombol_kocok)

        tombolKocok.setOnClickListener{ kocokDadu() }
    }

    // buat fungsi kocok dadu
    private fun kocokDadu(){
        // buat variabel untuk nilai acak
        val randomInt = (1..6).random()

        // tampilkan pesan mengambang di layar
        Toast.makeText(this, "Tombol ditekan",
        Toast.LENGTH_SHORT).show()

        // aktifkan tekview hasil
        val textHasil: TextView = findViewById(R.id.text_hasil)
        // mengganti textview
        textHasil.text = randomInt.toString()
    }
}
