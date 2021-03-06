package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

data class Item (
    val photo: Int,
    val name: String
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item = ArrayList<Item>()
        val array = resources.obtainTypedArray(R.array.resourceList)

        for(i in 0 until array.length())
            item.add(Item(array.getResourceId(i,0), "水果${i+1}"))
        array.recycle()

        spinner.adapter = MyAdapter(R.layout.adapter_horizintal, item)

        gridview.numColumns = 3

        gridview.adapter = MyAdapter(R.layout.adapter_vertical, item)

        listview.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayListOf("項目1", "項目2", "項目3", "項目4", "項目5", "項目6", "項目7", "項目8", "項目9" ))
    }
}