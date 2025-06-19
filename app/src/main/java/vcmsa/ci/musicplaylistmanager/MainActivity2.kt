package vcmsa.ci.musicplaylistmanager

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        enableEdgeToEdge()

        val titleInput: EditText = findViewById(R.id.editTitle)
        val artistInput: EditText = findViewById(R.id.editArtist)
        val ratingInput: EditText = findViewById(R.id.editRating)
        val commentInput: EditText = findViewById(R.id.editComment)
        val saveButton: Button = findViewById(R.id.btnSave)

        saveButton.setOnClickListener {
            val title = titleInput.text.toString()
            val artist = artistInput.text.toString()
            val rating = ratingInput.text.toString()

        Toast.makeText(this, "Song added: $title by $artist", Toast.LENGTH_SHORT).show()
            finish() //Go Back to main screen
        }
    }
}