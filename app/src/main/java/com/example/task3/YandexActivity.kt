package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper

class YandexActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yandex)
        setContentView(R.layout.activity_yandex)
        val images = ArrayList<Int>()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        images.add(R.drawable.ic_launcher_background)
        images.add(R.drawable.ic_launcher_background)
        images.add(R.drawable.ic_launcher_background)
        val helper: SnapHelper = PagerSnapHelper()
        helper.attachToRecyclerView(recyclerView)
        recyclerView.adapter = Adapter(images)
    }
}