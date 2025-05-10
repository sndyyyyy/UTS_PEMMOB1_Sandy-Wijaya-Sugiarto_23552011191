package com.example.uts_sandyws
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

data class Item(val judul: String,val desk: String, val imageResId: Int)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val items = listOf(
            Item("Sumanto", "Mantan Napi Kanibalisme Sumanto kini menjadi content creator",R.drawable.berita1),
            Item("Kecelakaan", "Kronologi kecelakaan KA Brantas dengan truk",R.drawable.berita2),
            Item("Keadilan?", "Di mana sebenarnya keadilan berada?",R.drawable.berita3),
            Item("Aneh-aneh", "Pengantin Foto di Kuburan Check",R.drawable.berita4),
            Item("Arisan", "Arisan sultan bikin terheran-heran",R.drawable.berita5)
        )
        val adapter = ItemAdapter(this, items)
        listView.adapter = adapter

    }
}
