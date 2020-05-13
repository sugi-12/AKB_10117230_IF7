/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7
Tanggal Pengerjaan: Minggu, 10-05-2020 Sampai Rabu, 13-05-2020
 */
package com.example.sugiwiranto


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tulbars)

        drawerLayout = findViewById(R.id.drawer)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, tulbars,0,0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.homee -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent);
                Toast.makeText(this,"Home clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
            R.id.friend -> {
                val intent = Intent(this, FriendList::class.java)
                startActivity(intent);
                Toast.makeText(this,"Friend List clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
            R.id.medsos -> {
                val intent = Intent(this, Social::class.java)
                startActivity(intent);
                Toast.makeText(this,"Friend List clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
