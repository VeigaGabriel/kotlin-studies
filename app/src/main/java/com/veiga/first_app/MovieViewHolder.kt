package com.veiga.first_app

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieViewHolder(itemView: View, private val clickListener: ClickEventListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {


    fun bind(movie: Movie) {
        itemView.findViewById<TextView>(R.id.movieTitle).text = movie.title
        itemView.findViewById<TextView>(R.id.movieDirector).text = movie.director
    }
    init {
        itemView.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        //verificando qual é a posição do item na lista
        val position = adapterPosition

        //caso a posição exista, chame o método onItemClick
        if(position != RecyclerView.NO_POSITION){
            clickListener.onItemClick(position)
        }
    }
}