package com.sangyan.cricketerinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player_details.*

class PlayerDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_details)
        val cricketer = intent.getParcelableExtra<Cricketer>(MainActivity.PLAYER)
        pimage.setImageResource(cricketer?.player_image!!)
        pnmae.text = cricketer.player_name
    }
}