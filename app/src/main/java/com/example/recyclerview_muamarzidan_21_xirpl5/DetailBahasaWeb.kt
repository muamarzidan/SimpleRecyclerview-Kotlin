package com.example.recyclerview_muamarzidan_21_xirpl5

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailBahasaWeb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bahasa_web)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bahasaWeb = intent.getParcelableExtra<BahasaWeb>(MainActivity.INTENT_PARCELABLE)

        val imgbahasaweb = findViewById<ImageView>(R.id.img_item_photo)
        val namebahasaweb = findViewById<TextView>(R.id.tv_item_name)
        val decsbahasaweb = findViewById<TextView>(R.id.tv_item_description)

        imgbahasaweb.setImageResource(bahasaWeb?.imgbahasaweb!!)
        namebahasaweb.text = bahasaWeb.namebahasaweb
        decsbahasaweb.text = bahasaWeb.descbahasaweb
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}







