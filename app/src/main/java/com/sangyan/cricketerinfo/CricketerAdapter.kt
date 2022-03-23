package com.sangyan.cricketerinfo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sangyan.cricketerinfo.CricketerAdapter.*

class CricketerAdapter(val list_of_players : ArrayList<Cricketer>, val context: Context ,val listener : (Cricketer)-> Unit)  : RecyclerView.Adapter<ViewHolder>(){
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
       var player_image : ImageView
      var player_name : TextView
      init {
          player_name = view.findViewById<TextView>(R.id.player_name)
          player_image = view.findViewById<ImageView>(R.id.player_image)
      }
        fun bindView(cricketer: Cricketer , listener: (Cricketer) -> Unit){
            player_name.text = cricketer.player_name
            player_image.setImageResource(cricketer.player_image)
           itemView.setOnClickListener{listener(cricketer)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view = LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindView(list_of_players[position],listener)
    }

    override fun getItemCount(): Int {
       return list_of_players.size

    }

}