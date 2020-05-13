/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7
Tanggal Pengerjaan: Selasa, 12-05-2020 sampai Rabu, 13-05-2020
 */
package com.example.sugiwiranto

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_friend.*
import kotlinx.android.synthetic.main.friend_list.*

class AddFriend: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_friend)
        backfriendAdd.setOnClickListener() {
            val intent = Intent(this, FriendList::class.java)
            startActivity(intent)
        }
    }
}