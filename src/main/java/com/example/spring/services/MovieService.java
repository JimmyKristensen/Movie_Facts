package com.example.spring.services;


import com.example.spring.models.Movie;

import java.util.ArrayList;
import java.util.Random;

import static com.example.spring.repositories.MovieDataRepository.getMovieData;

public class MovieService {

    private static ArrayList<Movie> movies = getMovieData();
    private static Random random = new Random();

    public static Object getFirstMovie(){
       return movies.get(0).toString();
    }
gfhfgh

    public static Object getRandomMovie(){
        int min = 0;
        int max = movies.size();
        int randomNumber = random.nextInt(max - min + 1) + min;

        return movies.get(randomNumber).toString();
    }

    public static String getTenSortByPopularityList(){
        ArrayList<Object> movielistOfTenRandomMovies = new ArrayList<Object>();
        int min = 0;
        int max = movies.size();

        for (int i = 0; i < 9; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            movielistOfTenRandomMovies.add(movies.get(randomNumber).toString());
        }

        String text = "";
        for (Object movie:
             movielistOfTenRandomMovies) {
            text = text + movie.toString();
        }
        return text;
    }


}
