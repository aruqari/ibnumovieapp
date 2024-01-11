package com.ibnumovieapp.moviesapp.details.peresntation

import com.ibnumovieapp.moviesapp.movieList.domain.model.Movie

 
data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
