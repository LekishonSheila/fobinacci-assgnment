package com.example.assignment_fobinacci

import FibonacciAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

     lateinit var fibonacciList: List<Int>
     lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvfibonacci)

        fibonacciList = FibonacciGenerator.generateFibonacciNumbers()
        recyclerView.adapter= FibonacciAdapter(fibonacciList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
    }






