package com.hrd.homework_spring.homework_spring.repository.model;

public class Article {
    private int id;
    private String title;
    private String author;
    private String description;
    private String image;

    public Article(int id, String title, String author, String description, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.image = image;
    }

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
