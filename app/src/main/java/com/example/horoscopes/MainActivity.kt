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

        var horoscopeAdapter=ArrayAdapter<String>(this,R.layout.sinle_line,R.id.txtHoroscope,burclar)
        listHoroscope.adapter=horoscopeAdapter

     listHoroscope.setOnItemClickListener { parent, view, position, id ->

         var temp=view as TextView

         Toast.makeText(this@MainActivity,"Clicked: "+temp.text.toString()+" Pos:"+position,Toast.LENGTH_LONG).show()

     }

    }

}
