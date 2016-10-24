package com.example.tech.gungun2016;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Layer {
    int order; //順番
    int imageResource; //画像
    float offsetX, offsetY;
    private Paint mPaint = new Paint();

    //コンストラクタ
    Layer(int order, int imageResource, float offsetX, float offsetY) {
        this.order = order;
        this.imageResource = imageResource;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }
}