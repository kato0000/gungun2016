package com.example.tech.gungun2016;

public class Part {
    float posX,posY; //位置
    int id;
    String name;
    Layer[] layers;
    Layer[] silhouetteLayers;

    Part(float posX,float posY,int id,Layer[] layers,Layer[] silhouetteLayers){
        this.posX = posX;
        this.posY = posY;
        this.id = id;
        this.layers = layers;
        this.silhouetteLayers = silhouetteLayers;
    }
}
