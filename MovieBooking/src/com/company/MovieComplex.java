package com.company;

import java.util.HashMap;

public class MovieComplex {
    String name;
    HashMap<Integer,CinemaHall> cinemaHalls = new HashMap<>();
    HashMap<Movie, CinemaHall> movieAndCinemaMap = new HashMap<>();

    public HashMap<Movie, CinemaHall> getMovieAndCinemaMap() {
        return movieAndCinemaMap;
    }

    public MovieComplex(){
    }

    public MovieComplex(String name){
        this.name = name;
    }

    public void addCinemaHall(CinemaHall hall) throws  IllegalArgumentException{
        if(cinemaHalls.containsKey(hall.getId())){
            throw new IllegalArgumentException("Cinema Hall already present at this ID");
        }
        cinemaHalls.put(hall.getId(), hall);
    }

    public void addMovieToHall(Movie movie, CinemaHall hall){
        movieAndCinemaMap.put(movie, hall);
    }

}
