package com.example.listemail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val items = arrayListOf<ItemModel>()

        items.add(ItemModel("Lam ", "Xin chao!","12:25", R.drawable.thumb1, false))
        items.add(ItemModel(" hop"," nay hop nhe","12:23",R.drawable.ava_d,false))
        items.add(ItemModel("Thong bao hoc phi","Vui long dong hoc phi dung han","11:10",R.drawable.ava_d,false))
        items.add(ItemModel("Thong bao  hoc", "nay ca lop hoc nhe","10:00", R.drawable.thumb1,false))
        items.add(ItemModel("Lam ", "Xin chao!","08:00", R.drawable.ava_d,false))
        items.add(ItemModel("Lam ", "Xin chao!","12:25", R.drawable.thumb1,false))
        items.add(ItemModel("Lam ", "Xin chao!","12:25", R.drawable.ava_d,false))
        items.add(ItemModel("Thong bao  hoc", " nay hoc ca lop  nhe","10:00", R.drawable.thumb1,false))
        items.add(ItemModel(" hop"," nay hop nhe","12:23",R.drawable.ava_d,false))
        items.add(ItemModel("Lam ", "Xin chao!","12:25", R.drawable.thumb1,false))
        val listView = findViewById<ListView>(R.id.list_view)
        val adapter = ItemAdapter (items)
        listView.adapter = adapter
    }
}
