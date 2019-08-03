package com.example.horoscopes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var burclar= arrayOf("Koç","Boğa","İkizler","Yengeç","Aslan","Başak","Terazi","Akrep","Yay","Oğlak","Kova","Balık")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var horoscopeAdapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,burclar)
        listHoroscope.adapter=horoscopeAdapter

     listHoroscope.setOnItemClickListener { parent, view, position, id ->

         var temp=view as TextView

         Toast.makeText(this,"Clicked: "+temp.text.toString()+" Pos:"+position,Toast.LENGTH_LONG).show()

     }

    }

}
