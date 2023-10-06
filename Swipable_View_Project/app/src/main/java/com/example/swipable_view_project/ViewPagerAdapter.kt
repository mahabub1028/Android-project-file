package com.example.swipable_view_project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.ivImage

class ViewPagerAdapter(
    val images: List<Int>

) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerviewHolder>(){
inner class  ViewPagerviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerviewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent,false)
        return  ViewPagerviewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewPagerviewHolder, position: Int) {
        val curImage = images[position]
        holder.itemView.ivImage.setImageResource(curImage)

    }

    override fun getItemCount(): Int {
        return images.size

    }
}