package com.example.tech.gungun2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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
        Robot[] robots = new Robot[9];
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
        for(int i=0; i< imageViews.length; i++) {
            imageViews[i] = (ImageView) findViewById(Rid[i]);
            switch(robots[i].status){
                case 0:
                    imageViews[i].setImageResource(roboSil[i]);
                    break;
                case 1:
                    imageViews[i].setImageResource(roboSil2[i]);
                    break;
                case 2:
                    imageViews[i].setImageResource(robo[i]);
                    break;
            }
            final int finalI = i;
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
