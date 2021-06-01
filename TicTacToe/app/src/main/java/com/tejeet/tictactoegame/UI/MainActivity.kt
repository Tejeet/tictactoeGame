package com.tejeet.tictactoegame.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tejeet.tictactoegame.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSinglePlayer.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
            finish()
        }

        btntwoPlayer.setOnClickListener {
            startActivity(Intent(this, WinnerShow::class.java))
            finish()
        }

        btnStartGame.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
            finish()
        }


    }


}