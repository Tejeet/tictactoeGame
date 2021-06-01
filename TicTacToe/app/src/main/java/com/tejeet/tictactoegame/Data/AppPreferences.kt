package com.tejeet.tictactoegame.Data

import android.content.Context
import android.content.SharedPreferences

object AppPreferences {

    private const val NAME = "TicTacToePREF"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences


    private val IS_VIBRATION : Boolean = true
    private val IS_SOUND : Boolean = true

    private val USER_NAME = "NAME_KEY"

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }


    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }


    var is_vibration :Boolean
        get() = preferences.getBoolean(IS_VIBRATION.toString(), false)
        set(value) = preferences.edit {
            it.putBoolean(IS_VIBRATION.toString(), value)

        }


    var is_sound :Boolean
        get() = preferences.getBoolean(IS_SOUND.toString(), false)
        set(value) = preferences.edit {
            it.putBoolean(IS_SOUND.toString(), value)

        }

}