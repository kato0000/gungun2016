package com.example.tech.gungun2016;

public class Part {
    int id;
    Layer[] layers;
    Layer[] silhouetteLayers;

    Part(int id,Layer[] layers,Layer[] silhouetteLayers){
        this.id = id;
        this.layers = layers;
        this.silhouetteLayers = silhouetteLayers;
    }
}
