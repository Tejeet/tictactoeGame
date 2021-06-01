package com.tejeet.tictactoegame.UI

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.util.Log
import android.widget.Toast
import com.tejeet.tictactoegame.Data.AppPreferences
import com.tejeet.tictactoegame.R
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    private val TAG = "tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        AppPreferences.init(this)

        if (AppPreferences.is_vibration) {
            swVibration.isChecked = true
            Log.d(TAG, "Vibration value is ${AppPreferences.is_vibration}")
        } else {
            swVibration.isChecked = false
            Log.d(TAG, "Vibration value is ${AppPreferences.is_vibration}")
        }

        if (AppPreferences.is_sound) {
            swSound.isChecked = true
            Log.d(TAG, "Sound value is ${AppPreferences.is_sound}")
        } else {
            swSound.isChecked = false
            Log.d(TAG, "Sound value is ${AppPreferences.is_sound}")
        }



        swVibration?.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                Log.d(TAG, "Switch ON")
                AppPreferences.is_vibration = true
                swVibration.text = "ON"

            } else {
                AppPreferences.is_vibration = false
                Log.d(TAG, "Switch OFF")
                swVibration.text = "OFF"
            }
        }



        swSound?.setOnCheckedChangeListener { _, soundCheck ->
            val message = if (soundCheck) "Sound Effect ON" else "Sound Effect OFF"

            if (soundCheck) {
                Log.d(TAG, "Sound ON")
                AppPreferences.is_sound = true
                swSound.text = "ON"

            } else {
                AppPreferences.is_sound = false
                Log.d(TAG, "Sound OFF")
                swSound.text = "Mute"
            }

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        btnBackToDshboard.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
            finish()
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()

        startActivity(Intent(this, Dashboard::class.java))
        finish()
    }

    private fun vibrateSense() {


        val v = getSystemService(VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            //deprecated in API 26
            v.vibrate(50)
        }
    }
}