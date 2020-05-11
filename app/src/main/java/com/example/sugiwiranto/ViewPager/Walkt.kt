package com.example.sugiwiranto.ViewPager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sugiwiranto.MainActivity
import com.example.sugiwiranto.R
import kotlinx.android.synthetic.main.activity_walkt.*

class Walkt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walkt)

        viewpager.adapter = MyPagerAdapter(supportFragmentManager)

        end_pager.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
