package com.example.parkkyungsuk.youtubewithrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    // returns numberOfItems like tableView
    override fun getItemCount(): Int {
        return 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        //How to we even create a view
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
    }
}

class CustomViewHolder(v: View) : RecyclerView.ViewHolder(v) {

}