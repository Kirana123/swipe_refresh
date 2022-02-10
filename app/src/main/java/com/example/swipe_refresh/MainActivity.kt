package com.example.swipe_refresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class MainActivity : AppCompatActivity() {
    var number: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Swipe_To_Refresh"
        val swipeRefreshLayout: SwipeRefreshLayout = findViewById(R.id.swipe)
        val textView: TextView = findViewById(R.id.textView)

        swipeRefreshLayout.setOnRefreshListener {
            number++
            textView.text = "Total numbers = $number.!"
            Handler().postDelayed(Runnable {
                swipeRefreshLayout.isRefreshing = false
            }, 1000)
        }
    }
}