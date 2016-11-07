package com.example.tech.gungun2016;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

    Bitmap bitmap;  //表示画像
    int bitmapWidth[] = new int[8]; //画像サイズ 幅;
    int bitmapHeight[] = new int[8]; //画像サイズ 高さ
    int roboid;
    private Paint mPaint = new Paint();

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

//    private void roboId(int roboid) {
//        this.roboid = roboid;
//    }

    @Override
    protected void onDraw(Canvas canvas) {
        switch (roboid) {
            case 1:
                bitmapWidth[0] = 700;
                bitmapHeight[0] = 350;
                bitmapWidth[1] = bitmapWidth[0] - 15;
                bitmapHeight[1] = bitmapHeight[0] + 120;
                bitmapWidth[2] = bitmapWidth[0];
                bitmapHeight[2] = bitmapHeight[0];
                bitmapWidth[3] = bitmapWidth[0] + 70;
                bitmapHeight[3] = bitmapHeight[0] + 115;
                bitmapWidth[4] = bitmapWidth[0] - 100;
                bitmapHeight[4] = bitmapHeight[0] - 125;
//                Bitmap dog10 = BitmapFactory.decodeResource(getResources(), R.drawable.dog1);
//                canvas.drawBitmap(dog10, 400, 100, mPaint);
                Bitmap dog11 = BitmapFactory.decodeResource(getResources(), R.drawable.dog1legrsil);
                canvas.drawBitmap(dog11, bitmapWidth[1], bitmapHeight[1], mPaint);
                Bitmap dog12 = BitmapFactory.decodeResource(getResources(), R.drawable.dog1bodysil);
                canvas.drawBitmap(dog12, bitmapWidth[2], bitmapHeight[2], mPaint);
                Bitmap dog13 = BitmapFactory.decodeResource(getResources(), R.drawable.dog1leglsil);
                canvas.drawBitmap(dog13, bitmapWidth[3], bitmapHeight[3], mPaint);
                Bitmap dog14 = BitmapFactory.decodeResource(getResources(), R.drawable.dog1headsil);
                canvas.drawBitmap(dog14, bitmapWidth[4], bitmapHeight[4], mPaint);
                break;
            case 2:
                bitmapWidth[0] = 800;
                bitmapHeight[0] = 350;
                bitmapWidth[1] = bitmapWidth[0] - 30;
                bitmapHeight[1] = bitmapHeight[0] + 120;
                bitmapWidth[2] = bitmapWidth[0] + 170;
                bitmapHeight[2] = bitmapHeight[0] - 20;
                bitmapWidth[3] = bitmapWidth[0];
                bitmapHeight[3] = bitmapHeight[0];
                bitmapWidth[4] = bitmapWidth[0] + 60;
                bitmapHeight[4] = bitmapHeight[0] + 115;
                bitmapWidth[5] = bitmapWidth[0] - 75;
                bitmapHeight[5] = bitmapHeight[0] - 155;
//                Bitmap dog20 = BitmapFactory.decodeResource(getResources(), R.drawable.dog2);
//                canvas.drawBitmap(dog20, 200, 100, mPaint);
                Bitmap dog21 = BitmapFactory.decodeResource(getResources(), R.drawable.dog2legrsil);
                canvas.drawBitmap(dog21, bitmapWidth[1], bitmapHeight[1], mPaint);
                Bitmap dog22 = BitmapFactory.decodeResource(getResources(), R.drawable.dog2body2sil);
                canvas.drawBitmap(dog22, bitmapWidth[2], bitmapHeight[2], mPaint);
                Bitmap dog23 = BitmapFactory.decodeResource(getResources(), R.drawable.dog2body1sil);
                canvas.drawBitmap(dog23, bitmapWidth[3], bitmapHeight[3], mPaint);
                Bitmap dog24 = BitmapFactory.decodeResource(getResources(), R.drawable.dog2leglsil);
                canvas.drawBitmap(dog24, bitmapWidth[4], bitmapHeight[4], mPaint);
                Bitmap dog25 = BitmapFactory.decodeResource(getResources(), R.drawable.dog2headsil);
                canvas.drawBitmap(dog25, bitmapWidth[5], bitmapHeight[5], mPaint);
                break;
            case 3:
                bitmapWidth[0] = 800;
                bitmapHeight[0] = 350;
                bitmapWidth[1] = bitmapWidth[0] - 75;
                bitmapHeight[1] = bitmapHeight[0] + 25;
                bitmapWidth[2] = bitmapWidth[0] + 155;
                bitmapHeight[2] = bitmapHeight[0] + 100;
                bitmapWidth[3] = bitmapWidth[0] + 135;
                bitmapHeight[3] = bitmapHeight[0] - 30;
                bitmapWidth[4] = bitmapWidth[0];
                bitmapHeight[4] = bitmapHeight[0];
                bitmapWidth[5] = bitmapWidth[0] + 20;
                bitmapHeight[5] = bitmapHeight[0] + 25;
                bitmapWidth[6] = bitmapWidth[0] + 225;
                bitmapHeight[6] = bitmapHeight[0] + 100;
                bitmapWidth[7] = bitmapWidth[0] - 75;
                bitmapHeight[7] = bitmapHeight[0] - 185;
//                Bitmap dog30 = BitmapFactory.decodeResource(getResources(), R.drawable.dog3);
//                canvas.drawBitmap(dog30, 200, 100, mPaint);
                Bitmap dog31 = BitmapFactory.decodeResource(getResources(), R.drawable.dog3legfrsil);
                canvas.drawBitmap(dog31, bitmapWidth[1], bitmapHeight[1], mPaint);
                Bitmap dog32 = BitmapFactory.decodeResource(getResources(), R.drawable.dog3legbrsil);
                canvas.drawBitmap(dog32, bitmapWidth[2], bitmapHeight[2], mPaint);
                Bitmap dog33 = BitmapFactory.decodeResource(getResources(), R.drawable.dog3body2sil);
                canvas.drawBitmap(dog33, bitmapWidth[3], bitmapHeight[3], mPaint);
                Bitmap dog34 = BitmapFactory.decodeResource(getResources(), R.drawable.dog3body1sil);
                canvas.drawBitmap(dog34, bitmapWidth[4], bitmapHeight[4], mPaint);
                Bitmap dog35 = BitmapFactory.decodeResource(getResources(), R.drawable.dog3legflsil);
                canvas.drawBitmap(dog35, bitmapWidth[5], bitmapHeight[5], mPaint);
                Bitmap dog36 = BitmapFactory.decodeResource(getResources(), R.drawable.dog3legblsil);
                canvas.drawBitmap(dog36, bitmapWidth[6], bitmapHeight[6], mPaint);
                Bitmap dog37 = BitmapFactory.decodeResource(getResources(), R.drawable.dog3headsil);
                canvas.drawBitmap(dog37, bitmapWidth[7], bitmapHeight[7], mPaint);
                break;
            case 4:
                bitmapWidth[0] = 700;
                bitmapHeight[0] = 400;
                bitmapWidth[1] = bitmapWidth[0] - 40;
                bitmapHeight[1] = bitmapHeight[0] - 20;
                bitmapWidth[2] = bitmapWidth[0];
                bitmapHeight[2] = bitmapHeight[0];
                bitmapWidth[3] = bitmapWidth[0] + 50;
                bitmapHeight[3] = bitmapHeight[0] - 220;
//                Bitmap monkey10 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey1);
//                canvas.drawBitmap(monkey10, 500, bitmapHeight[0], mPaint);
                Bitmap monkey11 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey1legsil);
                canvas.drawBitmap(monkey11, bitmapWidth[1], bitmapHeight[1], mPaint);
                Bitmap monkey12 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey1bodysil);
                canvas.drawBitmap(monkey12, bitmapWidth[2], bitmapHeight[2], mPaint);
                Bitmap monkey13 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey1headsil);
                canvas.drawBitmap(monkey13, bitmapWidth[3], bitmapHeight[3], mPaint);
                break;
            case 5:
                bitmapWidth[0] = 800;
                bitmapHeight[0] = 350;
                bitmapWidth[1] = bitmapWidth[0] - 115;
                bitmapHeight[1] = bitmapHeight[0] - 100;
                bitmapWidth[2] = bitmapWidth[0] - 95;
                bitmapHeight[2] = bitmapHeight[0] - 65;
                bitmapWidth[3] = bitmapWidth[0] - 100;
                bitmapHeight[3] = bitmapHeight[0] + 100;
                bitmapWidth[4] = bitmapWidth[0];
                bitmapHeight[4] = bitmapHeight[0];
                bitmapWidth[5] = bitmapWidth[0] + 70;
                bitmapHeight[5] = bitmapHeight[0] + 5;
                bitmapWidth[6] = bitmapWidth[0] - 60;
                bitmapHeight[6] = bitmapHeight[0] - 220;
                Bitmap monkey20 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey2);
                canvas.drawBitmap(monkey20, 200, 100, mPaint);
                Bitmap monkey21 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey2swordsil);
                canvas.drawBitmap(monkey21, bitmapWidth[1], bitmapHeight[1], mPaint);
                Bitmap monkey22 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey2armrsil);
                canvas.drawBitmap(monkey22, bitmapWidth[2], bitmapHeight[2], mPaint);
                Bitmap monkey23 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey2legsil);
                canvas.drawBitmap(monkey23, bitmapWidth[3], bitmapHeight[3], mPaint);
                Bitmap monkey24 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey2bodysil);
                canvas.drawBitmap(monkey24, bitmapWidth[4], bitmapHeight[4], mPaint);
                Bitmap monkey25 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey2armlsil);
                canvas.drawBitmap(monkey25, bitmapWidth[5], bitmapHeight[5], mPaint);
                Bitmap monkey26 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey2headsil);
                canvas.drawBitmap(monkey26, bitmapWidth[6], bitmapHeight[6], mPaint);
                break;
            case 6:
                bitmapWidth[0] = 800;
                bitmapHeight[0] = 400;
                bitmapWidth[1] = bitmapWidth[0] - 40;
                bitmapHeight[1] = bitmapHeight[0] + 70;
                bitmapWidth[2] = bitmapWidth[0] - 135;
                bitmapHeight[2] = bitmapHeight[0] - 340;
                bitmapWidth[3] = bitmapWidth[0];
                bitmapHeight[3] = bitmapHeight[0];
                bitmapWidth[4] = bitmapWidth[0] + 130;
                bitmapHeight[4] = bitmapHeight[0] - 100;
                bitmapWidth[5] = bitmapWidth[0] + 30;
                bitmapHeight[5] = bitmapHeight[0] - 135;
                bitmapWidth[6] = bitmapWidth[0] + 5;
                bitmapHeight[6] = bitmapHeight[0] - 270;
                bitmapWidth[7] = bitmapWidth[0] - 35;
                bitmapHeight[7] = bitmapHeight[0] - 120;
                Bitmap monkey30 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3);
                canvas.drawBitmap(monkey30, 200, 100, mPaint);
                Bitmap monkey31 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3legsil);
                canvas.drawBitmap(monkey31, bitmapWidth[1], bitmapHeight[1], mPaint);
                Bitmap monkey32 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3armrsil);
                canvas.drawBitmap(monkey32, bitmapWidth[2], bitmapHeight[2], mPaint);
                Bitmap monkey37 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3body3sil);
                canvas.drawBitmap(monkey37, bitmapWidth[7], bitmapHeight[7], mPaint);
                Bitmap monkey33 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3body2sil);
                canvas.drawBitmap(monkey33, bitmapWidth[3], bitmapHeight[3], mPaint);
                Bitmap monkey34 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3armlsil);
                canvas.drawBitmap(monkey34, bitmapWidth[4], bitmapHeight[4], mPaint);
                Bitmap monkey35 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3body1sil);
                canvas.drawBitmap(monkey35, bitmapWidth[5], bitmapHeight[5], mPaint);
                Bitmap monkey36 = BitmapFactory.decodeResource(getResources(), R.drawable.monkey3headsil);
                canvas.drawBitmap(monkey36, bitmapWidth[6], bitmapHeight[6], mPaint);

                break;
            default:
                break;
        }
    }

}