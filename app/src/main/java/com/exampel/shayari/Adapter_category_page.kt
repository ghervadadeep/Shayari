package com.exampel.shayari

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Adapter_category_page(
    var categoryPage: Category_page,
    var mylistdata: ArrayList<Any>
) :
    BaseAdapter() {
    override fun getCount(): Int = mylistdata.size

    override fun getItem(p0: Int): Any = p0

    override fun getItemId(p0: Int): Long = p0.toLong()

    @SuppressLint("MissingInflatedId", "ViewHolder")
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {

        var myid1: TextView

        var view = LayoutInflater.from(categoryPage).inflate(R.layout.layout_1, p2, false)
        myid1 = view.findViewById(R.id.myid1)

        myid1.setText("${mylistdata[position]}")
        return view
    }
}
