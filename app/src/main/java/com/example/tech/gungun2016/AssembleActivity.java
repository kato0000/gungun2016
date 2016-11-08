package com.example.tech.gungun2016;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AssembleActivity extends Activity implements View.OnTouchListener {
    Intent i;
    int robot_id;
    int robot_status;
    int parts_id[] = { R.id.parts1, R.id.parts2, R.id.parts3, R.id.parts4, R.id.parts5, R.id.parts6, R.id.parts7};
    ImageView imageView[] = new ImageView[7];
    private int preDx, preDy, newDx, newDy;
    int imgX,imgY,img_X,img_Y;
    int initX;
    int initY;

    private MyView myView;
    private Robot robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assemble);
        ImageView image_View = (ImageView) findViewById(R.id.partssil);
        myView = (MyView) this.findViewById(R.id.my_view);

        i =  getIntent();
        robot_id = i.getIntExtra("robot_id",0);
        robot_status = i.getIntExtra("status",100);
        for (int j=0;j<imageView.length;j++){
            imageView[j] = (ImageView) findViewById(parts_id[j]);
        }
        switch (robot_id){
            case 1:
                myView.roboid = 1;
                imageView[0].setImageResource(R.drawable.dog1legl);
                imageView[1].setImageResource(R.drawable.dog1body);
                imageView[2].setImageResource(R.drawable.dog1head);
                break;
            case 2:
                myView.roboid = 2;

                break;
            case 3:
                myView.roboid = 3;

                break;
            case 4:
                myView.roboid = 4;
                imageView[0].setImageResource(R.drawable.monkey1leg);
                imageView[1].setImageResource(R.drawable.monkey1body);
                imageView[2].setImageResource(R.drawable.monkey1head);
                imageView[3].setImageResource(R.drawable.nai);
                imageView[4].setImageResource(R.drawable.nai);
                break;
            case 5:
                myView.roboid = 5;
                //monkey2sword,monkey2armr,monkey2leg,monkey2body,monkey2arml,monkey2head
                imageView[0].setImageResource(R.drawable.monkey2sword);
                imageView[1].setImageResource(R.drawable.monkey2armr);
                imageView[2].setImageResource(R.drawable.monkey2leg);
                imageView[3].setImageResource(R.drawable.monkey2body);
                imageView[4].setImageResource(R.drawable.monkey2arml);
                imageView[5].setImageResource(R.drawable.monkey2head);

                break;
            case 6:
                myView.roboid = 6;

                break;
            case 7:
                myView.roboid = 7;

                break;
            case 8:
                myView.roboid = 8;

                break;
            case 9:
                myView.roboid = 9;

                break;
            default:
                break;
        }
        for (int j = 0; j < imageView.length; j++) {
            // 画像をセット
            imageView[j].setOnTouchListener(this);
        }

        preDx = preDy = newDx = newDy = 0;

        Button button = (Button) findViewById(R.id.buttonAs);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        //このやり方でいきたい
//        for(int i = 0; i < parts_id.length; i++) {
//            // x,y 位置取得
//            newDx = (int) event.getRawX();
//            newDy = (int) event.getRawY();
//
//            switch (event.getAction()) {
//                // ドラッグしたら
//                case MotionEvent.ACTION_MOVE:
//
//                    // ACTION_MOVEでの位置
//                    int dx = imageView[i].getLeft() + (newDx - preDx);
//                    int dy = imageView[i].getTop() + (newDy - preDy);
//
//                    // 画像の位置を設定する
//                    imageView[i].layout(dx, dy, dx + imageView[i].getWidth(), dy + imageView[i].getHeight());
//                    break;
//
//                case MotionEvent.ACTION_UP:
//                    switch (robot_id){
//                        case 4:
//                            imgX = myView.bitmapWidth[1] + imageView[0].getWidth()/14*10;
//                            imgY = myView.bitmapHeight[1];
//                            initX = 0;
//                            initY = 650;
//                            break;
//                        default:
//                            break;
//                    }
//                    img_X = imageView[i].getLeft();
//                    img_Y = imageView[i].getTop();
//                    //離したとき近くにいたらくっつく
//                    if (imgX - img_X < 100 & imgX - img_X > -100 && imgY - img_Y < 100 && imgY - img_Y > -100) {
//                        imageView[i].layout(imgX,imgY, imgX + imageView[i].getWidth(), imgY + imageView[i].getHeight());
//                    }
//                    else {
//                        imageView[i].layout(initX,initY, initX + imageView[i].getWidth(), initY + imageView[i].getHeight());
//                    }
//                    break;
//            }
//            //タッチした位置を古い位置とする
//            preDx = newDx;
//            preDy = newDy;
//
//            return true;
//        }
        switch (v.getId()) {
            case R.id.parts1:
                // x,y 位置取得
                newDx = (int) event.getRawX();
                newDy = (int) event.getRawY();

                switch (event.getAction()) {
                    // ドラッグしたら
                    case MotionEvent.ACTION_MOVE:
//                        posset(parts_id[0]);
                        // ACTION_MOVEでの位置
                        int dx = imageView[0].getLeft() + (newDx - preDx);
                        int dy = imageView[0].getTop() + (newDy - preDy);

                        // 画像の位置を設定する
                        imageView[0].layout(dx, dy, dx + imageView[0].getWidth(), dy + imageView[0].getHeight());
                        break;

                    case MotionEvent.ACTION_UP:
                        switch (robot_id){
                            case 4:
                                imgX = myView.bitmapWidth[1] + imageView[0].getWidth()/14*10;
                                imgY = myView.bitmapHeight[1];
                                initX = 0;
                                initY = 650;
                                break;
                            default:
                                break;
                        }
                        img_X = imageView[0].getLeft();
                        img_Y = imageView[0].getTop();
                        //離したとき近くにいたらくっつく
                        if (imgX - img_X < 100 && imgX - img_X > -100 && imgY - img_Y < 100 && imgY - img_Y > -100) {
                            imageView[0].layout(imgX,imgY, imgX + imageView[0].getWidth(), imgY + imageView[0].getHeight());
                        }
                        else {
                            imageView[0].layout(initX,initY, initX + imageView[0].getWidth(), initY + imageView[0].getHeight());
                        }
                        break;
                }
                break;
            case R.id.parts2:
                // x,y 位置取得
                newDx = (int) event.getRawX();
                newDy = (int) event.getRawY();

                switch (event.getAction()) {
                    // ドラッグしたら
                    case MotionEvent.ACTION_MOVE:
                        // ACTION_MOVEでの位置
                        int dx = imageView[1].getLeft() + (newDx - preDx);
                        int dy = imageView[1].getTop() + (newDy - preDy);

                        // 画像の位置を設定する
                        imageView[1].layout(dx, dy, dx + imageView[1].getWidth(), dy + imageView[1].getHeight());
                        break;

                    case MotionEvent.ACTION_UP:
                        switch (robot_id){
                            case 4:
                                imgX = myView.bitmapWidth[2] + imageView[1].getWidth()/14*15;
                                imgY = myView.bitmapHeight[2];
                                initX = 0;
                                initY = 350;
                                break;
                            default:
                                break;
                        }
                        img_X = imageView[1].getLeft();
                        img_Y = imageView[1].getTop();
                        //離したとき近くにいたらくっつく
                        if (imgX - img_X < 100 && imgX - img_X > -100 && imgY - img_Y < 100 && imgY - img_Y > -100) {
                            imageView[1].layout(imgX,imgY, imgX + imageView[1].getWidth(), imgY + imageView[1].getHeight());
                        }
                        else {
                            imageView[1].layout(initX,initY, initX + imageView[1].getWidth(), initY + imageView[1].getHeight());
                        }
                        break;
                }
                break;
            case R.id.parts3:
                // x,y 位置取得
                newDx = (int) event.getRawX();
                newDy = (int) event.getRawY();

                switch (event.getAction()) {
                    // ドラッグしたら
                    case MotionEvent.ACTION_MOVE:
                        // ACTION_MOVEでの位置
                        int dx = imageView[2].getLeft() + (newDx - preDx);
                        int dy = imageView[2].getTop() + (newDy - preDy);

                        // 画像の位置を設定する
                        imageView[2].layout(dx, dy, dx + imageView[2].getWidth(), dy + imageView[2].getHeight());
                        break;

                    case MotionEvent.ACTION_UP:
                        switch (robot_id){
                            case 4:
                                imgX = myView.bitmapWidth[3] + imageView[2].getWidth()/28*30;
                                imgY = myView.bitmapHeight[3];
                                initX = 0;
                                initY = 0;
                                break;
                        }


                        img_X = imageView[2].getLeft();
                        img_Y = imageView[2].getTop();
                        //離したとき近くにいたらくっつく違ったら元の場所に戻る
                        if (imgX - img_X < 100 && imgX - img_X > -100 && imgY - img_Y < 100 && imgY - img_Y > -100) {
                            imageView[2].layout(imgX,imgY, imgX + imageView[2].getWidth(), imgY + imageView[2].getHeight());
                        }
                        else {
                            imageView[2].layout(initX,initY, initX + imageView[2].getWidth(), initY + imageView[2].getHeight());
                        }
                        break;
                }
                break;
        }

        //タッチした位置を古い位置とする
        preDx = newDx;
        preDy = newDy;

       return true;
    }

    public void onActiveClick(View view){
        switch (view.getId()){
            case R.id.buttonAs:
                Intent intent = new Intent(this, SelectActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
    public void posset(int partsid){
        int pid = 0;
        switch (partsid) {
            case R.id.parts1:
                pid = 0;
                break;
            case R.id.parts2:
                pid = 1;
                break;
        }
            //ACTION_MOVEでの位置
            int dx = imageView[pid].getLeft() + (newDx - preDx);
            int dy = imageView[pid].getTop() + (newDy - preDy);

            // 画像の位置を設定する
            imageView[pid].layout(dx, dy, dx + imageView[pid].getWidth(), dy + imageView[pid].getHeight());
    }
}