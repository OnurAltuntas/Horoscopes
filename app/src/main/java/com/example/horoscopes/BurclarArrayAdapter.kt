package com.example.horoscopes

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.single_line2.view.*

class BurclarArrayAdapter( var gelencontext: Context, resource: Int, textViewResourceId: Int, var txtHoroscopes:Array<String>,var txtHoroscopeDate:Array<String>,var burcImg:Array<Int>) :
    ArrayAdapter<String>(gelencontext, resource, textViewResourceId,txtHoroscopes) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var singleline_view = convertView

        if (singleline_view == null) {
            var inflater = LayoutInflater.from(gelencontext)
            singleline_view = inflater.inflate(R.layout.single_line2, parent, false)
        }

//        var inflater=LayoutInflater.from(gelencontext)
//        var singleline_view=inflater.inflate(R.layout.single_line2,parent,false)

        var burcImgview = singleline_view?.imgHoroscopes
        var burcAdi = singleline_view?.txtHoroscopes
        var burcTarih = singleline_view?.txtHoroscopeDate

        burcImgview?.setImageResource(burcImg[position])
        burcAdi?.setText(txtHoroscopes[position])
        burcTarih?.setText(txtHoroscopeDate[position])


        return singleline_view!!
    }

}