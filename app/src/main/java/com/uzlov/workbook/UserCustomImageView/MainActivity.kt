package com.uzlov.workbook.UserCustomImageView

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val arrayColors = arrayOf(
        Color.parseColor("#6200EE"),
        Color.parseColor("#3700B3"),
        Color.parseColor("#03DAC5"),
        Color.parseColor("#ff8a50"),
        Color.parseColor("#ffc947"),
        Color.parseColor("#ffff6e"),
        Color.parseColor("#52c7b8"),
        Color.parseColor("#62efff"),
        Color.parseColor("#AAAAAA")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                customViewAvatar.setBorderWidth(progress.toFloat())
                Log.e("123", "$progress")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        button.setOnClickListener {
            customViewAvatar.setBorderColor(arrayColors.random())
        }
    }
}
