package com.basthanawat.myanimeapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.basthanawat.myanimeapplication.network.newmodel.Data
import com.bumptech.glide.Glide

class AnimeListAdapter(val response: List<Data>?, private val onItemClick: (Data) -> Unit) : RecyclerView.Adapter<AnimeListAdapter.AnimeListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animelist, parent, false)
        return AnimeListViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeListViewHolder, position: Int) {
        return holder.bind(response!![position],onItemClick)
    }

    override fun getItemCount(): Int = response!!.size

    class AnimeListViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val title : TextView = view.findViewById(R.id.animeText)
        val image : ImageView = view.findViewById(R.id.animeImage)
        fun bind(data: Data,onItemClick: (Data) -> Unit) {
            title.text = data.title
            Glide.with(image)
                .load(data.images?.jpg?.image_url)
                .into(image)

            itemView.setOnClickListener{
                onItemClick(data)

            }
        }


    }
}
