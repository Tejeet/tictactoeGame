package com.tejeet.tictactoegame.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.tejeet.tictactoegame.R
import kotlinx.android.synthetic.main.activity_winner_show.*

class WinnerShow : AppCompatActivity() {

    private val DATA_WINNER_NAME : String = "WINNER_NAME"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winner_show)


        if (intent.hasExtra(DATA_WINNER_NAME)){

            tvWinnerName.text = intent.getStringExtra(DATA_WINNER_NAME)

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



}