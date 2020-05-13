/*
Nama              : Sugi Wiranto
NIM               : 10117230
Kelas             : IF-7
Tanggal Pengerjaan: Minggu, 10-05-2020 Sampai Senin, 11-05-2020
 */
package com.example.sugiwiranto.ViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    private val pages = listOf(
        frag1(),
        frag2(),
        frag3()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Third Tab"
        }
    }
}