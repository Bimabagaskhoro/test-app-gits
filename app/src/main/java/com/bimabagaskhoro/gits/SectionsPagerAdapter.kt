package com.bimabagaskhoro.gits

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.soal1, R.string.soal2,R.string.soal3, R.string.soal4,R.string.soal5)
    }

    override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> Soal1Fragment()
                1 -> Soal2Fragment()
                2 -> Soal3Fragment()
                3 -> Soal4Fragment()
                4 -> Soal5Fragment()
                else -> Fragment()
            }

    override fun getPageTitle(position: Int): CharSequence? = mContext.resources.getString(
        TAB_TITLES[position])

    override fun getCount(): Int = 5

}