package com.example.horoscopes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.single_line2.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var burclar= resources.getStringArray(R.array.burclar)
        var burcTarihler=resources.getStringArray(R.array.burcTarih)
        var burcImg= arrayOf(R.drawable.koc1,R.drawable.koc1,R.drawable.boga2,R.drawable.ikizler3,R.drawable.yengec4,
            R.drawable.aslan5,R.drawable.basak6,R.drawable.terazi7,R.drawable.akrep8,R.drawable.yay9,R.drawable.oglak10,R.drawable.kova11,R.drawable.balik12)

        var burclarArrayAdapter=BurclarArrayAdapter(this,R.layout.single_line2,R.id.txtHoroscopes,burclar,burcTarihler,burcImg)
        listHoroscope.adapter=burclarArrayAdapter

     listHoroscope.setOnItemClickListener { parent, view, position, id ->

//         var temp=view as TextView
//
//         Toast.makeText(this@MainActivity,"Clicked: "+temp.text.toString()+" Pos:"+position,Toast.LENGTH_LONG).show()

     }

    }

}
