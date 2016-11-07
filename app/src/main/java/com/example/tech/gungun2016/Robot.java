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
    private MyView myView;
    ImageView imageView[] = new ImageView[5];
    int imgX,imgY,img_X,img_Y;
    int initX,initY;

    Robot(int id,int level,int status,String name){
        this.id = id;
        this.level = level;
        this.status = status;
        this.name = name;
    }

    public void move(int robotid, int patsid) {
        switch (robotid) {
            case 4:
                switch (patsid) {
                    case 0:

                        break;
                    case 1:

                        break;
                }
                break;
            default:
                break;
        }

    }
}