package vcmsa.ci.musicplaylistmanager

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    //song data arrays
    private val songTitles = arrayOf("Song A", "Song B", "Song C", "Song D")
    private val artistNames = arrayOf("Artist A", "Artist B", "Artist C", "Artist D")
    private val ratings = arrayOf(4, 1, 2, 3)
    private val comments = arrayOf("Rap", "Dance Song", "Best love song", "Memories")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.songListView)
        val songList = mutableListOf(String)

        for (i in songTitles.indices) {
            val info = "${songTitles[i]} by ${artistNames[i]}\nRating: ${ratings[i]}\nComment: ${comments[i]}"

        }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, songList)
        listView.adapter = adapter

        val btnNext: Button = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent = Intent(this, AppCompatActivity::class.java)
            startActivity(intent)
        }
    }
}


