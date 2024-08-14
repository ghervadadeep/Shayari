package com.exampel.shayari

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Category_page : AppCompatActivity() {

    lateinit var mylist1: ListView

//    lateinit var btn1 : ImageView

    var mylistdata = ArrayList<Any>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_category_page)

        mylistdata.add("Attitude Shayari")
        mylistdata.add("Best Hindi Shayari")
        mylistdata.add("Bewafa Shayari")
        mylistdata.add("Birthday Shayari")
        mylistdata.add("Dekh Pagli Shayari")
        mylistdata.add("Dhokha Shayari")
        mylistdata.add("Dosti Shayari")
        mylistdata.add("Facebook Shayari")
        mylistdata.add("Funny Shayari")
        mylistdata.add("Love Shayari")
        mylistdata.add("Mohabbat Shayari")
        mylistdata.add("Prem Shayari")
        mylistdata.add("Dard Shayari")
        mylistdata.add("Pyar Shayari")
        mylistdata.add("Romantic Shayari")
        mylistdata.add("Royal Shayari")
        mylistdata.add("Whatsapp Shayari")
        mylistdata.add("Udasi Shayari")
        mylistdata.add("Good Morning Shayari")
        mylistdata.add("Good Night Shayari")
        mylistdata.add("Intjar Shayari")
        mylistdata.add("Judaay Shayari")
        mylistdata.add("Painful Shayari")
        mylistdata.add("Gazal Shayari")

//            mylistdata.add("Creative$i")

        mylist1 = findViewById(R.id.mylist1)

//        btn1 = findViewById(R.id.btn1)

//
//        btn1.setOnClickListener {
//            var intent = Intent(this@category_page_activity,start_page_activity::class.java)
//            startActivity(intent)
//        }

        var myadapter = Adapter_category_page(this@Category_page,mylistdata)

        mylist1.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this@Category_page,Page_3::class.java)
            intent.putExtra("index",i)
            startActivity(intent)
        }

        mylist1.adapter = myadapter

//        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,mylistdata)

//        var myadapter = ArrayAdapter(
//            this@category_page_activity,
//            R.layout.item_new,
//            mylistdata
//        )

//        alllist.setOnItemClickListener { adapterView, view, i, l ->
//
//            Toast.makeText(this, "$i", Toast.LENGTH_LONG).show()
//
//        }

//        alllist.setOnItemClickListener { adapterView, view, i, l ->
//            var intent = Intent(this@category_page_activity,c1::class.java)
//            intent.putExtra("index",i)
//            startActivity(intent)
//        }

//        alllist.adapter = myadapter()

    }
}