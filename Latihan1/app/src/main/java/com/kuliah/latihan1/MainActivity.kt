package com.kuliah.latihan1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnMoveActivity: Button =
            findViewById(R.id.btn_move_activity)
        val btnMoveBrowser: Button =
            findViewById(R.id.btn_move_browser)
        btnMoveActivity.setOnClickListener{
            val intent = Intent(this, AnotherActivity::class.java)
            startActivity(intent)
        }
        btnMoveBrowser.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://developer.android.com"));
            startActivity(intent)
        }
    }
}