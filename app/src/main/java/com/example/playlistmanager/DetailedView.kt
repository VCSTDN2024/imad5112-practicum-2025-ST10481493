package com.example.playlistmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedView : AppCompatActivity() {
    private lateinit var textViewSummary: TextView
    private lateinit var displayBtn: Button
    private lateinit var returnBtn: Button
    private lateinit var averageBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)

        val textView = findViewById<TextView>(R.id.textViewSummary)
        displayBtn = findViewById<Button>(R.id.displayBtn)
        returnBtn = findViewById<Button>(R.id.returnBtn)
        averageBtn = findViewById<Button>(R.id.averageBtn)

        val song = intent.getStringArrayListExtra("songs") ?: arrayListOf()
        val artist = intent.getStringArrayListExtra("artists") ?: arrayListOf()
        val ratings = intent.getIntegerArrayListExtra("ratings") ?: arrayListOf()
        val comments = intent.getStringArrayListExtra("comments") ?: arrayListOf()

        val averageRating = if (ratings.isNotEmpty()) ratings.sum() / ratings.size else 0

        displayBtn.setOnClickListener {
        val summary = StringBuilder()
        for (i in song.indices) {
            summary.append("Song: $song, Artist: $artist, Ratings: $ratings, Comments: $comments")
        }

        textView.text = summary.toString()
    }
        averageBtn.setOnClickListener {
    val summary = StringBuilder()
    summary.append("\nAverage Ratings: $averageRating")
            textView.text = summary.toString()
}
        returnBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }}