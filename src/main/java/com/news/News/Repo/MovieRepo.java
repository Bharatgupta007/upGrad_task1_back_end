package com.news.News.Repo;

import com.news.News.Models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends MongoRepository<Movie,String> {

    @Query(value = "{title: ?0}")
    List<Movie> deleteByText(String title);
}
