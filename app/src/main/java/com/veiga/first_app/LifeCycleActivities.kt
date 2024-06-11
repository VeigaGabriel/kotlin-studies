package com.veiga.first_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.veiga.first_app.common.MoviesDatabase
import com.veiga.first_app.domain.movie.MovieAdapter
import com.veiga.first_app.domain.movie.MovieItemListener

class LifeCycleActivities : AppCompatActivity(), MovieItemListener {
    private val recyclerView:RecyclerView by lazy { findViewById(R.id.recycler_view) }
    private val itemSelectedText:TextView by lazy { findViewById(R.id.item_selected) }

    private val movieList = MoviesDatabase.getMovies()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_life_cycle_activities)

        recyclerView.layoutManager = LinearLayoutManager(this)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val adapter = MovieAdapter(movieList, this)

        // adapter.setPlanetListener

        recyclerView.layoutManager = LinearLayoutManager(baseContext)
        recyclerView.adapter = adapter

    }

    @SuppressLint("SetTextI18n")
    override fun onItemClick(position: Int) {
        val movie = movieList[position]
//        Toast.makeText(this, movie.title, Toast.LENGTH_SHORT).show()
        itemSelectedText.text = "Filme:${movie.title} | Diretor: ${movie.director}"
    }
}

