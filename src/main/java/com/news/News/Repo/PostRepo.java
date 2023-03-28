package com.news.News.Repo;

import com.news.News.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepo extends MongoRepository<Post,String> {
    @Query("{ title : { $regex : ?0 } }")
    List<Post> getPostsByTitleRegEx(String title);

}
