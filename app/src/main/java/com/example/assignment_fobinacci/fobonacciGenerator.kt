package com.example.assignment_fobinacci
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class fobonacciGenerator : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_fobonacci_generator)
//    }
//}
object FibonacciGenerator {

    fun generateFibonacciNumbers(): List<Int> {
        val fibonacciList = mutableListOf<Int>()

        var first = 0
        var second = 1

        while (second < 1000) {
            fibonacciList.add(second)
            val temp = first
            first = second
            second += temp
        }

        return fibonacciList
    }
}
