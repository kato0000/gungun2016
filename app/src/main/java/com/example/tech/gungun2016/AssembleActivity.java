package com.example.tech.gungun2016;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AssembleActivity extends AppCompatActivity implements View.OnTouchListener {

    Intent i = getIntent();
    int id = i.getIntExtra("id",0);
    Paint mPaint = new Paint();
    int pid[] = { R.id.parts1, R.id.parts2, R.id.parts3, R.id.parts4, R.id.parts5};
    ImageView imageViewS = (ImageView) findViewById(R.id.partssil);
    private ImageView image_View[] = new ImageView[2];
    private ImageView imageView1;
    private int preDx, preDy, newDx, newDy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assemble);

        switch (id){
            case 1:
                imageViewS.setImageResource(R.drawable.dog1sil2);
                break;
            case 2:
                imageViewS.setImageResource(R.drawable.dog2sil2);
                break;
            case 3:
                imageViewS.setImageResource(R.drawable.dog3sil2);
                break;
            case 4:
                imageViewS.setImageResource(R.drawable.monkey1sil2);
                break;
            case 5:
                imageViewS.setImageResource(R.drawable.monkey2sil2);
                break;
            case 6:
                imageViewS.setImageResource(R.drawable.monkey3sil2);
                break;
            case 7:
                imageViewS.setImageResource(R.drawable.bird1sil2);
                break;
            case 8:
                imageViewS.setImageResource(R.drawable.bird2sil2);
                break;
            case 9:
                imageViewS.setImageResource(R.drawable.bird3sil2);
                break;
        }


        image_View[0] = (ImageView) findViewById(R.id.parts1);
        image_View[1] = (ImageView) findViewById(R.id.parts2);
        imageView1 = (ImageView) findViewById(R.id.partssil);

        for (int i = 0; i < 2; i++) {
            // 画像をセット
            image_View[i].setOnTouchListener(this);
        }

        preDx = preDy = newDx = newDy = 0;
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
                        int dx = image_View[0].getLeft() + (newDx - preDx);
                        int dy = image_View[0].getTop() + (newDy - preDy);

                        // 画像の位置を設定する
                        image_View[0].layout(dx, dy, dx + image_View[0].getWidth(), dy + image_View[0].getHeight());
                        image_View[1].layout(dx + 50, dy + 50, dx + 50 + image_View[0].getWidth(), dy + 50 + image_View[0].getHeight());
                        break;

                    case MotionEvent.ACTION_UP:

                        int imgX = imageView1.getLeft() + imageView1.getWidth() / 2;
                        int imgY = imageView1.getTop() + imageView1.getHeight() / 2;
                        int img_X = image_View[0].getLeft() + image_View[0].getWidth() / 2;
                        int img_Y = image_View[0].getTop() + image_View[0].getHeight() / 2;

                        //離したとき近くにいたらくっつく
                        if (imgX - img_X < 100 && imgX - img_X > -100 && imgY - img_Y < 100 && imgY - img_Y > -100) {
                            image_View[0].layout(imageView1.getLeft() - 50, imageView1.getTop() - 50, imageView1.getLeft() - 50 + imageView1.getWidth(), imageView1.getTop() - 50 + imageView1.getHeight());
                            image_View[1].layout(imageView1.getLeft() + 50, imageView1.getTop() + 50, imageView1.getLeft() + 50 + imageView1.getWidth(), imageView1.getTop() + 50 + imageView1.getHeight());
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
                        int dx = image_View[1].getLeft() + (newDx - preDx);
                        int dy = image_View[1].getTop() + (newDy - preDy);

                        // 画像の位置を設定する
                        image_View[0].layout(dx - 50, dy - 50, dx - 50 + image_View[0].getWidth(), dy - 50 + image_View[0].getHeight());
                        image_View[1].layout(dx, dy, dx + image_View[1].getWidth(), dy + image_View[1].getHeight());
                        break;

                    case MotionEvent.ACTION_UP:

                        int imgX = imageView1.getLeft() + imageView1.getWidth() / 2;
                        int imgY = imageView1.getTop() + imageView1.getHeight() / 2;
                        int img_X = image_View[1].getLeft() + image_View[1].getWidth() / 2;
                        int img_Y = image_View[1].getTop() + image_View[1].getHeight() / 2;

                        //離したとき近くにいたらくっつく
                        if (imgX - img_X < 100 && imgX - img_X > -100 && imgY - img_Y < 100 && imgY - img_Y > -100) {
                            image_View[0].layout(imageView1.getLeft() - 50, imageView1.getTop() - 50, imageView1.getLeft() - 50 + imageView1.getWidth(), imageView1.getTop() - 50 + imageView1.getHeight());
                            image_View[1].layout(imageView1.getLeft() + 50, imageView1.getTop() + 50, imageView1.getLeft() + 50 + imageView1.getWidth(), imageView1.getTop() + 50 + imageView1.getHeight());                        }
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
}