package com.example.schooolapplication;

public class School {
    // variabel untuk menampung data item
    private String txt_school_name, txt_location, txt_date_created;
    private Integer profile_image;

    public School(String txt_school_name, String txt_location, String txt_date_created, Integer profile_image) {
        this.txt_school_name = txt_school_name;
        this.txt_location = txt_location;
        this.txt_date_created = txt_date_created;
        this.profile_image = profile_image;
    }

    public String getTxt_school_name() {
        return txt_school_name;
    }

    public void setTxt_school_name(String txt_school_name) {
        this.txt_school_name = txt_school_name;
    }

    public String getTxt_location() {
        return txt_location;
    }

    public void setTxt_location(String txt_location) {
        this.txt_location = txt_location;
    }

    public String getTxt_date_created() {
        return txt_date_created;
    }

    public void setTxt_date_created(String txt_date_created) {
        this.txt_date_created = txt_date_created;
    }

    public Integer getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(Integer profile_image) {
        this.profile_image = profile_image;
    }
}
