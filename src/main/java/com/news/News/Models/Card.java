package com.news.News.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.util.ArrayList;

@Document(collection = "Cards")
public class Card {
    @Id
    private int id;
    private String Title;
    private String Actors;
    private String Director;
    private ArrayList<String> Images;
    private String Year;
    private String Genre;
    private String Country;

    public Card() {
    }

    public Card(int id, String title, String actors, String director, ArrayList<String> images, String year, String genre, String country) {
        this.id = id;
        Title = title;
        Actors = actors;
        Director = director;
        Images = images;
        Year = year;
        Genre = genre;
        Country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public ArrayList<String> getImages() {
        return Images;
    }

    public void setImages(ArrayList<String> images) {
        Images = images;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
