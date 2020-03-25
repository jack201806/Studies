package com.example.myapplication;

public class Student {
    private String name;
    private String stuNo;
    private int photoId;

    public Student(String name, String stuNo, int photoId) {
        this.name = name;
        this.stuNo = stuNo;
        this.photoId = photoId;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }


}
