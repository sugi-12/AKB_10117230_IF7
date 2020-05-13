/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7
Tanggal Pengerjaan: Minggu, 10-05-2020
 */

package com.example.sugiwiranto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.sugiwiranto.ViewPager.Walkt

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handle= Handler()
        handle.postDelayed({
            val intent = Intent(this,
                Walkt::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
