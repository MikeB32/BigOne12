package com.example.mike.bigone12;

/**
 * Created by Mike on 9/8/2016.
 */
public class Data {

    int id;
    String name;
    String place;



    public Data(String name , String place){
        this.name=name;
        this.place=place;
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
