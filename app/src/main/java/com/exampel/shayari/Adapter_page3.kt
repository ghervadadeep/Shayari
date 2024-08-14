package com.exampel.shayari

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Adapter_page3(var page3: Page_3 , var blanklist: Array<String>) : BaseAdapter() {
    override fun getCount(): Int = blanklist.size

    override fun getItem(p0: Int): Any = p0

    override fun getItemId(p0: Int): Long = p0.toLong()

    @SuppressLint("MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
//        var mylist2 : TextView
//
//        var view = LayoutInflater.from(c1).inflate(R.layout.layout_2,p2,false)
//        mylist2 = view.findViewById(R.id.myid2)
//
//        mylist2.setText("${blanklist[p0]}")

        var myid2 : TextView

        var view = LayoutInflater.from(page3).inflate(R.layout.layout_2,p2,false)
        myid2 = view.findViewById(R.id.myid2)

        myid2.setText("${blanklist[p0]}")

        return view
    }

}
