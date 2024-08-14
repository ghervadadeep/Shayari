package com.exampel.shayari

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class Mypageradapter(var page4: Page_4, var shayrilist: Array<String>?) : PagerAdapter() {
    override fun getCount(): Int = shayrilist!!.size
    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var shayri: TextView
        var view = LayoutInflater.from(page4).inflate(R.layout.mypageview, container, false)

        shayri = view.findViewById(R.id.shayri)

        shayri.setText(shayrilist!!.get(position))

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
