package com.example.playlistmanager

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedView : AppCompatActivity() {
    private lateinit var textViewSummary: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)

        val textView = findViewById<TextView>(R.id.textViewSummary)

        val song = intent.getStringArrayListExtra("songs") ?: arrayListOf()
        val artist = intent.getStringArrayListExtra("artists") ?: arrayListOf()
        val ratings = intent.getIntegerArrayListExtra("ratings") ?: arrayListOf()
        val comments = intent.getStringArrayListExtra("comments") ?: arrayListOf()

        //val averageRating = if(ratings.isNotEmpty())
    }
}