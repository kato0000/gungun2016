package com.example.tech.gungun2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button button = (Button) findViewById(R.id.buttonS);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        ImageView imageViews[] = new ImageView[9];
        final Robot[] robots = new Robot[9];
        robots[0] = new Robot(1,1,2,"dog1");
        robots[1] = new Robot(2,2,1,"dog2");
        robots[2] = new Robot(3,3,0,"dog3");
        robots[3] = new Robot(4,1,2,"monkey1");
        robots[4] = new Robot(5,2,2,"monkey2");
        robots[5] = new Robot(6,3,0,"monkey3");
        robots[6] = new Robot(7,1,2,"bird1");
        robots[7] = new Robot(8,2,0,"bird2");
        robots[8] = new Robot(9,3,0,"bird3");
        int Rid[] = { R.id.robot1, R.id.robot2, R.id.robot3, R.id.robot4, R.id.robot5, R.id.robot6, R.id.robot7, R.id.robot8, R.id.robot9};
        int robo[] = {
                R.drawable.dog1, R.drawable.dog2, R.drawable.dog3,
                R.drawable.monkey1, R.drawable.monkey2, R.drawable.monkey3,
                R.drawable.bird1, R.drawable.bird2, R.drawable.bird3};
        int roboSil[] = {
                R.drawable.dog1sil, R.drawable.dog2sil, R.drawable.dog3sil,
                R.drawable.monkey1sil, R.drawable.monkey2sil, R.drawable.monkey3sil,
                R.drawable.bird1sil, R.drawable.bird2sil, R.drawable.bird3sil};
        int roboSil2[] = {
                R.drawable.dog1sil2, R.drawable.dog2sil2, R.drawable.dog3sil2,
                R.drawable.monkey1sil2, R.drawable.monkey2sil2, R.drawable.monkey3sil2,
                R.drawable.bird1sil2, R.drawable.bird2sil2, R.drawable.bird3sil2};
        int qes = R.drawable.mark_question;

        for(int i=0; i< imageViews.length; i++) {
            imageViews[i] = (ImageView) findViewById(Rid[i]);
            switch(robots[i].status){
                case 0:
                    imageViews[i].setImageResource(qes);
                    break;
                case 1:
                    imageViews[i].setImageResource(roboSil2[i]);
                    break;
                case 2:
                    imageViews[i].setImageResource(robo[i]);
                    break;
            }

            final int finalI = i;
            imageViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(SelectActivity.this, AssembleActivity.class);
                    intent.putExtra("robot_id", robots[finalI].id);
                    startActivity(intent);
                }
             });
        }
        for (int i = 0;i<imageViews.length;i++) {
            if(robots[i].status == 1){
                imageViews[i].setBackgroundResource(R.drawable.border);
                for (int j = 0;j<imageViews.length;j++) {
                    if(robots[j].status != 1){
                        imageViews[j].setBackgroundResource(R.color.white);
                    }
                }
            }
            else if(robots[i].status == 0){
                boolean count = false;
                for (int j = 0;j<imageViews.length;j++) {
                    if(robots[j].status == 1){
                        count = true;
                    }
                }
                if(!count){
                    imageViews[i].setBackgroundResource(R.drawable.border);
                }
            }
        }


    }

    public void onActiveClick(View view){
        switch (view.getId()){
            case R.id.buttonS:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
