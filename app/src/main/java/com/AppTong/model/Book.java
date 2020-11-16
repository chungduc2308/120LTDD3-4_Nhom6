package com.AppTong.model;
public class Book {
    String id;
    Integer imgrul;
    String title;
    public Book(String id, Integer imgrul, String title) {
        this.id = id;
        this.imgrul = imgrul;
        this.title = title;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getImgrul() {
        return imgrul;
    }
    public void setImgrul(Integer imgrul) {
        this.imgrul = imgrul;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
