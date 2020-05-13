/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7
Tanggal Pengerjaan: Selasa, 12-05-2020
 */
package com.example.sugiwiranto

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_walkt.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.friend_list.*

class FriendList :AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.friend_list)

        add.setOnClickListener() {
            val intent = Intent(this, AddFriend::class.java)
            startActivity(intent)
        }
        backfriend.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}