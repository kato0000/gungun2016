package com.example.tech.gungun2016;

public class Mission {
    String description;
    int id;

    Mission(int id,String description){
        this.description = description;
        this.id = id;
    }
    public String toString() {
        return "id:" + id + ",description:" + description;
    }
}
