package com.example.homework02_p;

public class Char {
    private String myung_sam;
    private String sukia_sq;
    private int photoID;

    public Char() {
    }

    public Char(String myung_sam, String sukia_sq, int photoID) {
        this.myung_sam = myung_sam;
        this.sukia_sq = sukia_sq;
        this.photoID = photoID;
    }

    public String getMyung_sam() {
        return myung_sam;
    }

    public void setMyung_sam(String myung_sam) {
        this.myung_sam = myung_sam;
    }

    public String getSukia_sq() {
        return sukia_sq;
    }

    public void setSukia_sq(String sukia_sq) {
        this.sukia_sq = sukia_sq;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
