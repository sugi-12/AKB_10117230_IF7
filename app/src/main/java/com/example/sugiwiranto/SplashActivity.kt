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

        val handle=Handler()
        Handler().postDelayed({
            val intent = Intent( this,
                Walkt::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
