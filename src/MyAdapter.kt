package com.gnirt69.recyclerviewoptionmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var adapter: MyAdapter? = null
    private var listItems: MutableList<RecyclerItem>? = null
    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.setLayoutManager(LinearLayoutManager(this))

        listItems = ArrayList<E>()
        //Generate sample data

        for (i in 0..9) {
            listItems!!.add(RecyclerItem("Item " + (i + 1), "Welcome to Torisan channel, this is description of item " + (i + 1)))
        }

        //Set adapter
        adapter = MyAdapter(listItems, this)
        recyclerView!!.setAdapter(adapter)
    }
}
