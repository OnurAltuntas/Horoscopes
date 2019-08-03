package com.example.horoscopes

import android.content.Context
import android.widget.ArrayAdapter

class BurclarArrayAdapter(context: Context, resource: Int, textViewResourceId: Int,txtHoroscopes:Array<String>,txtHoroscopeDate:Array<String>,burcImg:Array<Int>) :
    ArrayAdapter<String>(context, resource, textViewResourceId,txtHoroscopes) {
}