package github.toninhobueno.contentproviderclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {


    lateinit var notesRecycler : RecyclerView
    lateinit var noteRefreshButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    noteRefreshButton = findViewById(R.id.client_buttom_refresh)
    notesRecycler = findViewById(R.id.client_list)

    noteRefreshButton.setOnClickListener{

    }
    }
}