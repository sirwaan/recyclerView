package com.sirwansoft.recyclerview;

public class ModelRecycler {
    private String title;
    private int Picture;


    public ModelRecycler() {
    }

    public ModelRecycler(String title, int picture) {
        this.title = title;
        Picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPicture() {
        return Picture;
    }

    public void setPicture(int picture) {
        Picture = picture;
    }
}
