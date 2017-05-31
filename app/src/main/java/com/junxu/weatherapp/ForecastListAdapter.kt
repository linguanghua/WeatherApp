package com.junxu.weatherapp

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by linxu on 2017/5/30.
 */

class ForecastListAdapter(val items:List<String>):RecyclerView.Adapter<ForecastListAdapter.ViewHodler>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHodler {
        return ViewHodler(TextView(parent?.context))
    }
    override fun onBindViewHolder(holder: ViewHodler?, position: Int) {
        holder?.textView?.text = items[position]
    }
    override fun getItemCount(): Int = items.size
    class ViewHodler(val textView:TextView):RecyclerView.ViewHolder(textView)
}

