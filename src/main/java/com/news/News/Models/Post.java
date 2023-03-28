package com.news.News.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "News")
public class Post {
    private String title;
    private String body1;
    private String body2;
    private String photo1;
    private String photo2;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody1() {
        return body1;
    }

    public void setBody1(String body1) {
        this.body1 = body1;
    }

    public String getBody2() {
        return body2;
    }

    public void setBody2(String body2) {
        this.body2 = body2;
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", body1='" + body1 + '\'' +
                ", body2='" + body2 + '\'' +
                ", photo1='" + photo1 + '\'' +
                ", photo2='" + photo2 + '\'' +
                '}';
    }
}
