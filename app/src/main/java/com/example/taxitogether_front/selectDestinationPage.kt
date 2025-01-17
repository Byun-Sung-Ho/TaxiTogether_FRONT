package com.example.taxitogether_front

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_select_destination_page.*

class selectDestinationPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_destination_page)

        val items = resources.getStringArray(R.array.sources)
        val myAdapter1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,items)
        val destinationItems = resources.getStringArray(R.array.destination)
        val myAdapter2 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,destinationItems)

        val spinnerSource =  findViewById<Spinner>(R.id.spinner)
        spinnerSource.adapter = myAdapter1
        spinnerDestination.adapter = myAdapter2

        spinnerSource.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when(p2){
                    0 -> {}
                    1->{}
                    else -> {}
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        spinnerDestination.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when(p2){
                    0 -> {}
                    1->{}
                    2->{}
                    3->{}
                    else -> {}
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }


}