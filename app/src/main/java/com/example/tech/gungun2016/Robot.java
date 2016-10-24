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

    Robot(int id,int level,int status,String name,Part[] parts){
        this.id = id;
        this.level = level;
        this.status = status;
        this.name = name;
        this.parts = parts;
    }

    public void display() {
    }

    public void selectDisplay() {
    }
}