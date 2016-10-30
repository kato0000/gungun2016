package com.example.tech.gungun2016;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Robot {
    int id;
    int level;
    int status;
    String name;
    Part[] parts;

    Robot(int id,int level,int status,String name){
        this.id = id;
        this.level = level;
        this.status = status;
        this.name = name;
        switch (level){
            case 1:
                parts = new Part[3];
                break;
            case 2:
                parts = new Part[4];
                break;
            case 3:
                parts = new Part[5];
                break;
        }
        switch (id){
            case 1:
                break;
        }
    }

    public void display() {
    }
}