package com.example.parkkyungsuk.youtubewithrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.video_row.view.*

class MainAdapter(val homeFeed: HomeFeed) : RecyclerView.Adapter<CustomViewHolder>() {

    val videoTitles = listOf<String>("first title", "second title", "3rd title")

    // returns numberOfItems like tableView
    override fun getItemCount(): Int {
        return homeFeed.videos.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        //How to we even create a view
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val video = homeFeed.videos.get(position)
        holder.view.textView_video_title.text = video.name
        holder.view.textView_channel_name.text = video.channel.name

        val thumnailImageView = holder.view.imageView_thumnail
        Picasso.get().load(video.imageUrl).into(thumnailImageView)

        val channelImageView = holder.view.imageView_icon
        Picasso.get().load(video.channel.profileImageUrl).into(channelImageView)
    }
}

// RecyclerView.ViewHolderを継承したカスタムクラス
class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}