package com.ibnumovieapp.moviesapp.movieList.data.remote

import com.ibnumovieapp.moviesapp.movieList.data.remote.respnod.MovieListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

 
interface MovieApi {

    @GET("movie/{category}")
    suspend fun getMoviesList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = API_KEY
    ): MovieListDto

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
        const val API_KEY = "8eb08be0b9783d85f166b3f8109fbaa7"
    }

}