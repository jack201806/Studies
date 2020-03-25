package com.example.homework02;

public class Goods {
    private String store;
    private String intro;
    private String price;
    private int photoID;

    public Goods(String store, String intro, String price, int photoID) {
        this.store = store;
        this.intro = intro;
        this.price = price;
        this.photoID = photoID;
    }

    public Goods() {}

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
