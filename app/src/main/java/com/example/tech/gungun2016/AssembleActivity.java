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
    int parts_id[] = { R.id.parts1, R.id.parts2, R.id.parts3, R.id.parts4, R.id.parts5};
    ImageView imageView[] = new ImageView[5];
    ImageView imageViewS[] = new ImageView[7];
    ImageView image_View;
    Bitmap bitmap;  //表示画像
    int bitmapWidth; //画像サイズ 幅
    int bitmapHeight; //画像サイズ 高さ
    private Paint mPaint = new Paint();
    private int preDx, preDy, newDx, newDy;

    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assemble);
        ImageView image_View = (ImageView) findViewById(R.id.partssil);
        myView = (MyView) this.findViewById(R.id.my_view);

        i =  getIntent();
        robot_id = i.getIntExtra("robot_id",0);
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
                break;
            case 5:
                myView.roboid = 5;
                imageView[0].setImageResource(R.drawable.monkey2leg);
                imageView[1].setImageResource(R.drawable.monkey2body);
                imageView[2].setImageResource(R.drawable.monkey1head);

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
        switch (v.getId()) {
            case R.id.parts1:
                // x,y 位置取得
                newDx = (int) event.getRawX();
                newDy = (int) event.getRawY();

                switch (event.getAction()) {
                    // ドラッグしたら
                    case MotionEvent.ACTION_MOVE:

                        // ACTION_MOVEでの位置
                        int dx = imageView[0].getLeft() + (newDx - preDx);
                        int dy = imageView[0].getTop() + (newDy - preDy);

                        // 画像の位置を設定する
                        imageView[0].layout(dx, dy, dx + imageView[0].getWidth(), dy + imageView[0].getHeight());
                        break;

                    case MotionEvent.ACTION_UP:

                        int imgX = myView.bitmapWidth[1];
                        int imgY = myView.bitmapHeight[1];
                        int img_X = imageView[0].getLeft() + imageView[0].getWidth() / 2;
                        int img_Y = imageView[0].getTop() + imageView[0].getHeight() / 2;

                        //離したとき近くにいたらくっつく
                        if (imgX - img_X < 100 && imgX - img_X > -100 && imgY - img_Y < 100 && imgY - img_Y > -100) {
                            imageView[0].layout(myView.bitmapWidth[1],myView.bitmapHeight[1], imageView[0].getLeft() + imageView[0].getWidth(), imageView[0].getTop() + imageView[0].getHeight());}
                        break;
                }
                break;
//            case R.id.parts2:
//                // x,y 位置取得
//                newDx = (int) event.getRawX();
//                newDy = (int) event.getRawY();
//
//                switch (event.getAction()) {
//                    // ドラッグしたら
//                    case MotionEvent.ACTION_MOVE:
//                        // ACTION_MOVEでの位置
//                        int dx = imageView[1].getLeft() + (newDx - preDx);
//                        int dy = imageView[1].getTop() + (newDy - preDy);
//
//                        // 画像の位置を設定する
//                        imageView[1].layout(dx, dy, dx + imageView[1].getWidth(), dy + imageView[1].getHeight());
//                        break;
//
//                    case MotionEvent.ACTION_UP:
//
//                        int imgX = imageViewS[1].getLeft() + imageViewS[1].getWidth() / 2;
//                        int imgY = imageViewS[1].getTop() + imageViewS[1].getHeight() / 2;
//                        int img_X = imageView[1].getLeft() + imageView[1].getWidth() / 2;
//                        int img_Y = imageView[1].getTop() + imageView[1].getHeight() / 2;
//
//                        //離したとき近くにいたらくっつく
//                        if (imgX - img_X < 100 && imgX - img_X > -100 && imgY - img_Y < 100 && imgY - img_Y > -100) {
//                            imageView[1].layout(imageViewS[1].getLeft(), imageViewS[1].getTop(), imageViewS[1].getLeft() + imageViewS[1].getWidth(), imageViewS[1].getTop() + imageViewS[1].getHeight());}
//                        break;
//                }
//                break;
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
}