package com.example.playlistmanager

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val song = ArrayList<String>()
    private val artist = ArrayList<String>()
    private val ratings = ArrayList<Int>()
    private val comments = ArrayList<String>()
    private lateinit var playlistBtn : Button
    private lateinit var exitBtn : Button
    private lateinit var detailBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val songInput = findViewById<EditText>(R.id.songTextText)
        val artistInput = findViewById<EditText>(R.id.artistTextText2)
        val ratingsInput = findViewById<EditText>(R.id.ratingsTextText3)
        val commentsInput = findViewById<EditText>(R.id.commentsTextText4)
        detailBtn = findViewById<Button>(R.id.detailBtn)
        exitBtn = findViewById<Button>(R.id.exitBtn)
        playlistBtn = findViewById<Button>(R.id.playlistbtn)


        //ArrayAdapter.createFromResource(this, R.array.songs_array, android.R.layout.simple_gallery_item).also {
           // it.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
           // songInput.adapter = it
       // }
       /* ArrayAdapter.createFromResource(this, R.array.ratings_array, android.R.layout.simple_spinner_item).also {
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            ratingSpinner.adapter = it
        }
        */
        playlistBtn.setOnClickListener {
            val song = songInput.text.toString()
            val artist = artistInput.text.toString()
            val ratings = ratingsInput.text.toString().toIntOrNull()
            val comments = commentsInput.text.toString()

            if (song.isBlank() || artist.isBlank() || ratings ==0) {
                Toast.makeText(this, "Please enter valid data",
                    Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            /*songs.add(song)
            artists.add(artist)
            rating.add(ratings)
            comment.add(comments)
            Toast.makeText(this, "Entry added",
                Toast.LENGTH_SHORT).show()*/

        }
    exitBtn.setOnClickListener {
        finishAffinity()
    }
    detailBtn.setOnClickListener {
        val intent = Intent(this, DetailedView::class.java).apply {

            putStringArrayListExtra("songs", song)
            putStringArrayListExtra("artists", artist)
            putIntegerArrayListExtra("ratings", ratings)
            putStringArrayListExtra("comments", comments)

        }
        startActivity(intent)
    }


    }
}