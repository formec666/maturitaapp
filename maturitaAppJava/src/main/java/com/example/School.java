package com.example;


public class School {
    public Boolean authenticated;
    public String name;
    public String logoURL;
    
    public School(String name, String url, Boolean auth){
        this.name=name;
        this.logoURL=url;
        this.authenticated=auth; // this gets called to actually construct the school object
    }

    public School() {//this constructor gets called by the app to get the school object
    }


}
