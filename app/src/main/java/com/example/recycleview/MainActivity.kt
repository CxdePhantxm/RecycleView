package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.CountriesAdapter
import com.example.recycleview.UserDto

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        var adapter = CountriesAdapter(generateData())
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.itemAnimator = DefaultItemAnimator()

        recyclerView?.adapter = adapter
        adapter.notifyDataSetChanged()
    }

     private fun generateData(): ArrayList<UserDto> {
        var result = ArrayList<UserDto>()

        for(i in 1..5){
            var user: UserDto= UserDto("Страна $i", "Город $i")
            result.add(user)
        }
        return result
    }
}