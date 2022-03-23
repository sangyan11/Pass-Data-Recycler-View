package com.sangyan.cricketerinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity()  {
    private lateinit var  recyclerView : RecyclerView
    companion object {
        const val  PLAYER = "PLAYER"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val item = ArrayList<Cricketer>()
        addMembers(item)
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        val adapter = CricketerAdapter(item,this){
        val intent = Intent(this,PlayerDetails::class.java)
            intent.putExtra(PLAYER,it)
           startActivity(intent)
        }
        recyclerView.adapter = adapter

    }
    fun addMembers( item : ArrayList<Cricketer>) {
        item.add(Cricketer(R.drawable.klrahul,"KL Rahul"))
        item.add(Cricketer(R.drawable.sachin,"Sachin Tendulkar"))
        item.add(Cricketer(R.drawable.msdhoni,"MS Dhoni"))
        item.add(Cricketer(R.drawable.virat,"Virat Kohli"))
        item.add(Cricketer(R.drawable.jbumrah,"Bumrah"))
        item.add(Cricketer(R.drawable.sachin,"Sachin Tendulkar"))
        item.add(Cricketer(R.drawable.sachin,"Sachin Tendulkar"))
        item.add(Cricketer(R.drawable.sachin,"Sachin Tendulkar"))
    }
}