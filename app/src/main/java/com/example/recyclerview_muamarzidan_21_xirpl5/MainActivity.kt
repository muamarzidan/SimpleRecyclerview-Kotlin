package com.example.recyclerview_muamarzidan_21_xirpl5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bahasaWebList = listOf<BahasaWeb>(
            BahasaWeb(
                R.drawable.gambar2,
                 "HTML",
                 "HTML adalah kepanjangan HyperText Markup Language"
            ),
            BahasaWeb(
                R.drawable.gambar1,
                 "CSS",
                 "CSS adalah kepanjangan dari Cascading Style Sheets yang digunakan agar web kita terlihat berwana"
            ),
            BahasaWeb(
                R.drawable.gambar3,
                "JAVASCRIPTH",
                 "Javascripth adalah teramasuk bahasa pemrograman tingkat tinggi dan dinamis"
            ),
            BahasaWeb(
                R.drawable.gambar4,
                 "PHP",
                 "PHP adalah kepanjangan dari Hypertext Procecor yang dspat membuat web situs menjadi dinamis "
            ),
            BahasaWeb(
                R.drawable.gambar5,
                "PYTHON",
                "Bahasa Python adalah bahasa yang tergolong mudah untuk dipelajari"
            ),
            BahasaWeb(
                R.drawable.gambar6,
                 "RUBY",
                 "Ruby adalah bahasa pemrograman dunamis berbasis skrip yang beriorientasi objek"
            ),
            BahasaWeb(
                R.drawable.gambar8,
                 "MY SQL",
                 "MY SQL adalah bahasa pemrograman yang gunakan pada bagian database dalam sebuah web"
            ),

            BahasaWeb(
                R.drawable.gambar9,
                "MONGGO DB",
                "MONGGO DB termasuk bahasa pemrograman yang digunakan pada databse juga"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_bahasa)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = bahasawebAdapter(this,bahasaWebList){
            val intent = Intent (this, DetailBahasaWeb::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
