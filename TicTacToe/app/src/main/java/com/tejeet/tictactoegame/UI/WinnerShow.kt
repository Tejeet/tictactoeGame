package com.tejeet.tictactoegame.UI

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.tejeet.tictactoegame.Data.AppPreferences
import com.tejeet.tictactoegame.R
import kotlinx.android.synthetic.main.activity_winner_show.*

class WinnerShow : AppCompatActivity() {

    private val DATA_WINNER_NAME : String = "WINNER_NAME"

    var MEDIA_SOUND : Boolean =  false

    var mMediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winner_show)

        AppPreferences.init(this)
        MEDIA_SOUND = AppPreferences.is_sound

        if (intent.hasExtra(DATA_WINNER_NAME)){

            tvWinnerName.text = intent.getStringExtra(DATA_WINNER_NAME)
            playSound()

        }


        btnPlayAgain.setOnClickListener {

            startActivity(Intent(this, Dashboard::class.java))
            finish()

        }

        btnExitGameFromWinner.setOnClickListener {

            val builder = AlertDialog.Builder(this)

            builder.setTitle("Do You Wants to Exit")

            builder.setMessage("Are you Sure")
            builder.setIcon(android.R.drawable.ic_dialog_alert)


            builder.setPositiveButton("Yes"){dialogInterface, which ->
                finishAffinity()
            }

            builder.setNegativeButton("No"){dialogInterface, which ->
                dialogInterface.dismiss()
            }

            val alertDialog: AlertDialog = builder.create()

            alertDialog.setCancelable(false)
            alertDialog.show()

        }
    }

    fun playSound() {

        if (MEDIA_SOUND) {

            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.winningsound)
                mMediaPlayer!!.isLooping = false
                mMediaPlayer!!.start()
            } else {
                mMediaPlayer!!.start()
            }
        }
    }



}