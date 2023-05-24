//package com.example.assignment_fobinacci
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class fibonacciAdapter : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_fibonacci_adapter)
//    }
//}
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciAdapter(private val fibonacciList: List<Int>) : RecyclerView.Adapter<FibonacciAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemTextView: TextView = itemView.findViewById(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTextView.text = fibonacciList[position].toString()
    }

    override fun getItemCount(): Int {
        return fibonacciList.size
    }
}