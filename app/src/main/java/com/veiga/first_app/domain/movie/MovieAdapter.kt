package com.veiga.first_app.domain.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.veiga.first_app.ClickEventListener
import com.veiga.first_app.R

class MovieAdapter(private val movies: List<Movie>, private val clickListener: ClickEventListener) : Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(itemView: View, private val clickListener: ClickEventListener) : ViewHolder(itemView), View.OnClickListener {
        fun bind(movie: Movie) {
            itemView.findViewById<TextView>(R.id.movie_image)
            itemView.findViewById<TextView>(R.id.movie_title).text = movie.title
            itemView.findViewById<TextView>(R.id.movie_director).text = movie.director
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view,  clickListener)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }
}