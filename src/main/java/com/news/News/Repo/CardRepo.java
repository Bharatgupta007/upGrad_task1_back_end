package com.news.News.Repo;
import com.news.News.Models.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepo extends MongoRepository<Card, Integer> {
}
