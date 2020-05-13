/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7
Tanggal Pengerjaan: Selasa, 12-05-2020
 */

package com.example.sugiwiranto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_social.*
import kotlinx.android.synthetic.main.friend_list.*

class Social : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social)

        backmenu.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ighint.setOnClickListener(){
            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/soegi_12/"))
            startActivity(i)
        }

        fbhint.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/profile.php?id=100002282952600"))
            startActivity(i)
        }

        wahint.setOnClickListener() {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=6285774444240&text=Hai%20Sugi,%20Apa%20Kabar?"))
            startActivity(i)
        }
    }
}
