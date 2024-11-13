package com.exampel.shayari

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

class Page_4 : AppCompatActivity() {

    lateinit var pageview: ViewPager
//    lateinit var alllist : ListView

    lateinit var left: ImageView
    lateinit var right: ImageView
    lateinit var txtid: TextView
    lateinit var copy_btn: ImageView
    lateinit var share_btn: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_page_4)

        left = findViewById(R.id.left)

        pageview = findViewById(R.id.pageview)
        right = findViewById(R.id.right)
        txtid = findViewById(R.id.txtid)
        copy_btn = findViewById(R.id.copy_btn)
        share_btn = findViewById(R.id.share_btn)

        var shayrilist = intent.getStringArrayExtra("list")
        var position1 = intent.getIntExtra("pos", 0)
        var getindex1 = intent.getIntExtra("index123", 0)

//        Log.e("jhsdfn","$shayrilist")

        var mypageradapter = Mypageradapter(this, shayrilist)
        pageview.adapter = mypageradapter
        pageview.setCurrentItem(position1)

        var currentosition = pageview.currentItem

        copy_btn.setOnClickListener {
            currentosition = pageview.currentItem
            Toast.makeText(this@Page_4, "copied", Toast.LENGTH_LONG).show()
            val clipboard: ClipboardManager =
                getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText(shayrilist!![currentosition], shayrilist!![currentosition])
            clipboard.setPrimaryClip(clip)
        }

        share_btn.setOnClickListener {
            currentosition = pageview.currentItem
            val intent = Intent(Intent.ACTION_SEND)
            val shareBody = shayrilist!![currentosition]
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, shareBody)
            startActivity(Intent.createChooser(intent, "hgjhgh"))
        }

        if (getindex1 == 0) {
            txtid.setText("Attitude Shayari")
        } else if (getindex1 == 1) {
            txtid.setText("Best Hindi Shayari")
        } else if (getindex1 == 2) {
            txtid.setText("Bewafa Shayari")
        } else if (getindex1 == 3) {
            txtid.setText("Birthday Shayari")
        } else if (getindex1 == 4) {
            txtid.setText("Dekh Pagli Shayari")
        } else if (getindex1 == 5) {
            txtid.setText("Dhokha Shayari")
        } else if (getindex1 == 6) {
            txtid.setText("Dosti Shayari")
        } else if (getindex1 == 7) {
            txtid.setText("Facebook Shayari")
        } else if (getindex1 == 8) {
            txtid.setText("Funny Shayari")
        } else if (getindex1 == 9) {
            txtid.setText("Love Shayari")
        } else if (getindex1 == 10) {
            txtid.setText("Mohabbat Shayari")
        } else if (getindex1 == 11) {
            txtid.setText("Prem Shayari")
        } else if (getindex1 == 12) {
            txtid.setText("Dard Shayari")
        } else if (getindex1 == 13) {
            txtid.setText("Pyar Shayari")
        } else if (getindex1 == 14) {
            txtid.setText("Romantic Shayari")
        } else if (getindex1 == 15) {
            txtid.setText("Royal Shayari")
        } else if (getindex1 == 16) {
            txtid.setText("Whatsapp Shayari")
        } else if (getindex1 == 17) {
            txtid.setText("Udasi Shayari")
        } else if (getindex1 == 18) {
            txtid.setText("Good Morning Shayari")
        } else if (getindex1 == 19) {
            txtid.setText("Good Night Shayari")
        } else if (getindex1 == 20) {
            txtid.setText("Intjar Shayari")
        } else if (getindex1 == 21) {
            txtid.setText("Judaay Shayari")
        } else if (getindex1 == 22) {
            txtid.setText("Painful Shayari")
        } else if (getindex1 == 23) {
            txtid.setText("Gazal Shayari")
        }

        left.setOnClickListener {

            currentosition = pageview.currentItem
            if (currentosition > 0) {
//                position1--;
                currentosition--
                pageview.setCurrentItem(currentosition)
//                text23.setText(shayrilist!![position1])
            } else {
                Toast.makeText(this@Page_4, "No previous data", Toast.LENGTH_LONG).show()
            }
        }
        right.setOnClickListener {

            currentosition = pageview.currentItem
            if (currentosition < (shayrilist!!.size) - 1) {
//                position1++
                currentosition++
                pageview.setCurrentItem(currentosition)
//                text23.setText(shayrilist!![position1])
            } else {
                Toast.makeText(this@Page_4, "No next data", Toast.LENGTH_LONG).show()
            }
        }
    }
}