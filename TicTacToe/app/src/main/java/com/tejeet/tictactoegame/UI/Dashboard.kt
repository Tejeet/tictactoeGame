package com.tejeet.tictactoegame.UI

import android.content.Intent
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.tejeet.tictactoegame.Data.AppPreferences
import com.tejeet.tictactoegame.R
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {

    private val TAG = "tag"
    private val DATA_WINNER_NAME : String = "WINNER_NAME"

    private var playerChance = false;

    private var gameMat = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0)
    )

    private var scoreMat = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0)
    )

    private var boxCount = 0

    var VIBRATION_SETTING : Boolean =  false
    var MEDIA_SOUND : Boolean =  false

    var mMediaPlayer: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        AppPreferences.init(this)

        VIBRATION_SETTING = AppPreferences.is_vibration
        MEDIA_SOUND = AppPreferences.is_sound

        changeChance()


        boxr1c1.setOnClickListener {

            if (gameMat[0][0] == 0) {

                gameMat[0][0] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr1c1.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[0][0] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr1c1.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[0][0] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }


        boxr1c2.setOnClickListener {

            if (gameMat[0][1] == 0) {

                gameMat[0][1] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr1c2.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[0][1] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr1c2.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[0][1] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }

        boxr1c3.setOnClickListener {

            if (gameMat[0][2] == 0) {

                gameMat[0][2] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr1c3.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[0][2] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr1c3.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[0][2] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }


        boxr2c1.setOnClickListener {

            if (gameMat[1][0] == 0) {

                gameMat[1][0] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr2c1.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[1][0] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr2c1.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[1][0] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }

        boxr2c2.setOnClickListener {

            if (gameMat[1][1] == 0) {

                gameMat[1][1] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr2c2.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[1][1] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr2c2.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[1][1] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }

        boxr2c3.setOnClickListener {

            if (gameMat[1][2] == 0) {

                gameMat[1][2] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr2c3.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[1][2] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr2c3.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[1][2] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }


        boxr3c1.setOnClickListener {

            if (gameMat[2][0] == 0) {

                gameMat[2][0] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr3c1.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[2][0] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr3c1.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[2][0] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }


        boxr3c2.setOnClickListener {

            if (gameMat[2][1] == 0) {

                gameMat[2][1] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr3c2.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[2][1] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr3c2.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[2][1] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }


        boxr3c3.setOnClickListener {

            if (gameMat[2][2] == 0) {

                gameMat[2][2] = 1;

                if (playerChance) {
                    println("Croxx putting at 1 1")
                    boxr3c3.setImageResource(R.drawable.ic_baseline_circle_24)
                    scoreMat[2][2] = 1;
                } else {
                    println(" Circle putting at 1 1")
                    boxr3c3.setImageResource(R.drawable.ic_baseline_close_24)
                    scoreMat[2][2] = 2;
                }

                changeChance()
                boxCount++
            } else {
                vibrateSense()
                Toast.makeText(this, "Please Check Other position", Toast.LENGTH_SHORT).show();
            }

        }



        btnRefresh.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("Restrt Again")

            builder.setMessage("Do You Wants to Restart the Game?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)


            builder.setPositiveButton("Yes"){dialogInterface, which ->
                finish();
                startActivity(getIntent());
            }

            builder.setNegativeButton("NO"){dialogInterface, which ->
                dialogInterface.dismiss()
            }

            val alertDialog: AlertDialog = builder.create()

            alertDialog.setCancelable(false)
            alertDialog.show()
        }

        btnExitGame.setOnClickListener {

            val builder = AlertDialog.Builder(this)

            builder.setTitle("Exit App ?")

            builder.setMessage("Do You Want to Close the App")
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

        btnSetting.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }




    }


    override fun onBackPressed() {
        super.onBackPressed()


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


    public fun changeChance() {

        playSound()

        if (playerChance) {
            playerChance = false;
            llPlayer1.setBackgroundResource(R.drawable.design_player_nochance)
            llPlayer2.setBackgroundResource(R.drawable.design_player_chance)
        } else {
            playerChance = true;
            llPlayer1.setBackgroundResource(R.drawable.design_player_chance)
            llPlayer2.setBackgroundResource(R.drawable.design_player_nochance)
        }

        for (row in gameMat) {
            println(" Mat is " + row.contentToString())
        }

        for (scoreRow in scoreMat) {
            println(" Score is " + scoreRow.contentToString())
        }

        checkWinner()
    }

    public fun checkWinner() {


        for (i in 1..8) {

            println(" F : \"$scoreMat[0][0] $scoreMat[0][1] $scoreMat[0][2]\" ")
            var ss =
                scoreMat[1][0].toString() + scoreMat[1][1].toString() + scoreMat[1][2].toString()
            println(" S :$ss ")

            var line: String = ""

            when (i) {

                1 -> line =
                    scoreMat[0][0].toString() + scoreMat[0][1].toString() + scoreMat[0][2].toString()
                2 -> line =
                    scoreMat[1][0].toString() + scoreMat[1][1].toString() + scoreMat[1][2].toString()
                3 -> line =
                    scoreMat[2][0].toString() + scoreMat[2][1].toString() + scoreMat[2][2].toString()

                4 -> line =
                    scoreMat[0][0].toString() + scoreMat[1][0].toString() + scoreMat[2][0].toString()
                5 -> line =
                    scoreMat[0][1].toString() + scoreMat[1][1].toString() + scoreMat[2][1].toString()
                6 -> line =
                    scoreMat[0][2].toString() + scoreMat[1][2].toString() + scoreMat[2][2].toString()

                7 -> line =
                    scoreMat[0][0].toString() + scoreMat[1][1].toString() + scoreMat[2][2].toString()
                8 -> line =
                    scoreMat[2][0].toString() + scoreMat[1][1].toString() + scoreMat[0][2].toString()

                else -> {
                    print(" No Match")
                }
            }

            println(" Line is $line")

            if (line.equals("222")) {
                tvwinner.text = "Player 2 Win"

                val intent = Intent(this, WinnerShow::class.java)
                intent.putExtra(DATA_WINNER_NAME, "Play 2 Win")
                startActivity(intent)
                finish()

                break
            }
            else if (line.equals("111")) {
                tvwinner.text = "Player 1 Win"

                val intent = Intent(this, WinnerShow::class.java)
                intent.putExtra(DATA_WINNER_NAME, "Play 1 Win")
                startActivity(intent)
                finish()

                break
            } else {

                if (boxCount == 8){

                    val builder = AlertDialog.Builder(this)

                    builder.setTitle("Game Over")

                    builder.setMessage("No Winner Game Tie\nDo you Wants to Play Again ?")
                    builder.setIcon(android.R.drawable.ic_dialog_alert)


                    builder.setPositiveButton("Yes"){dialogInterface, which ->
                        finish();
                        startActivity(getIntent());
                    }

                    builder.setNegativeButton("Exit App"){dialogInterface, which ->
                        finishAffinity()
                    }

                    val alertDialog: AlertDialog = builder.create()

                    alertDialog.setCancelable(false)
                    alertDialog.show()

                }
                else{
                    tvwinner.text = "No Winner Yet"
                }

            }


        }
    }

    private fun vibrateSense() {

        if (VIBRATION_SETTING){

            Log.d(TAG, "VIBRATING")

            val v = getSystemService(VIBRATOR_SERVICE) as Vibrator
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                v.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                //deprecated in API 26
                v.vibrate(100)
            }
        }
    }

    fun playSound() {

        if (MEDIA_SOUND){
            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.changeside)
                mMediaPlayer!!.isLooping = false
                mMediaPlayer!!.start()
            }
            else {
                mMediaPlayer!!.start()
            }
        }

    }
}