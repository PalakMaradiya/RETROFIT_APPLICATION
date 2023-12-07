package com.example.retrofitapplication.ADAPTER

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofitapplication.ACTIVITY.RetroFitActivity
import com.example.retrofitapplication.R
import com.example.retrofitapplication.RESPONSE.RetrofitResponseItem

class RetrofitAdapter(var retroFitActivity: RetroFitActivity, var result: List<RetrofitResponseItem>) :
    RecyclerView.Adapter<RetrofitAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var txtId: TextView = itemView.findViewById(R.id.txtId)
        var txtAlbumId: TextView = itemView.findViewById(R.id.txtAlbumId)
        var txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
        var imgView2: ImageView = itemView.findViewById(R.id.imgView2)
        var imgView : ImageView = itemView.findViewById(R.id.imgView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var View = LayoutInflater.from(retroFitActivity).inflate(R.layout.item_file, parent, false)
        return MyViewHolder(View)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.txtId.text = result.get(position).id.toString()
        holder.txtAlbumId.text = result.get(position).albumId.toString()
        holder.txtTitle.text = result.get(position).title.toString()


       // holder.imgView


        Glide.with(retroFitActivity).load(result[position].url).into(holder.imgView)
        Glide.with(retroFitActivity).load(result[position].thumbnailUrl).into(holder.imgView2)

    }


    override fun getItemCount(): Int {
        return result.size

    }
}

