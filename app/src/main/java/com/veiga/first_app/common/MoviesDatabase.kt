package com.veiga.first_app.common

import com.veiga.first_app.domain.movie.Movie

object MoviesDatabase {
    private val movies = listOf(
        Movie("Alien", "Ridley Scott"),
        Movie("La La Land", "Damien Chazelle"),
        Movie("Nomadland", "Chloe Zhao"),
        Movie("Alien", "Ridley Scott"),
        Movie("La La Land", "Damien Chazelle"),
        Movie("Nomadland", "Chloe Zhao"),
        Movie("Alien", "Ridley Scott"),
        Movie("La La Land", "Damien Chazelle"),
        Movie("Nomadland", "Chloe Zhao"),
        Movie("Alien", "Ridley Scott"),
        Movie("La La Land", "Damien Chazelle"),
        Movie("Nomadland", "Chloe Zhao"),
    )

    fun getMovies() = movies
}