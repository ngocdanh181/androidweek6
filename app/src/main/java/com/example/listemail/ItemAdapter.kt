package com.example.listemail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class ItemAdapter( private val items: ArrayList<ItemModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView: View = convertView ?: LayoutInflater.from(parent?.context).inflate(R.layout.item, parent, false)

        val textCaption = itemView.findViewById<TextView>(R.id.text_caption)
        val textMessage = itemView.findViewById<TextView>(R.id.text_mess)
        val textTime = itemView.findViewById<TextView>(R.id.text_time)
        val imageAvatar= itemView.findViewById<ImageView>(R.id.image_avatar)
        val checkSelected = itemView.findViewById<CheckBox>(R.id.check_selected)

        val item = items[position]

        textCaption.text = item.caption
        textMessage.text = item.message
        textTime.text = item.timer
        imageAvatar.setImageResource(item.imageThumb)
        checkSelected.isChecked = item.selected

        checkSelected.setOnCheckedChangeListener { _, isChecked ->
            item.selected = isChecked
            val drawableResId = if (isChecked) R.drawable.star_on else R.drawable.star_off
            checkSelected.setBackgroundResource(drawableResId)
        }
        return itemView
    }


}
