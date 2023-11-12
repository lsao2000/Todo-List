package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.ListView
import android.view.View
import android.widget.Toast
import android.widget.ArrayAdapter
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var text:EditText
    private lateinit var listview :ListView
    private lateinit var btn:Button
    private var list = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.name)
        listview = findViewById(R.id.listUser)
        btn = findViewById(R.id.btn)
	    var arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,list)
        btn.setOnClickListener {
	        var textValue :String = text.getText().toString()
		    list.add(textValue)
            listview.adapter = arrayAdapter
       }
    }

}
