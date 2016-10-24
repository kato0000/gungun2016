package com.example.tech.gungun2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends Activity {

    private Mission[] missions;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        missions = new Mission[4];
        missions[0] = new Mission(1,"はみがきをする");
        missions[1] = new Mission(2,"手をあらう");
        missions[2] = new Mission(3,"かたづける");
        missions[3] = new Mission(4,"べんきょうをする");

        user = new User(1,"test","ああああ","qwerty");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(user.name + "さん ようこそ");

        Random r = new Random();
        int n = r.nextInt(5);
        TextView textViewM = (TextView) findViewById(R.id.textViewM);
        switch (n){
            case 0:
                textViewM.setText("もくひょうをクリアしてお供を組み立てよう");
                break;
            case 1:
                textViewM.setText("きょうは「"+missions[0].description+"」をがんばってみよう！");
                break;
            case 2:
                textViewM.setText("きょうは「"+missions[1].description+"」をがんばってみよう！");
                break;
            case 3:
                textViewM.setText("きょうは「"+missions[2].description+"」をがんばってみよう！");
                break;
            case 4:
                textViewM.setText("きょうは「"+missions[3].description+"」をがんばってみよう！");
                break;

        }

        Button mButton[] = new Button[4];
        int Rid[] = { R.id.mButton1, R.id.mButton2, R.id.mButton3, R.id.mButton4 };
        for(int i=0; i< mButton.length; i++) {
            mButton[i] = (Button) findViewById(Rid[i]);
            mButton[i].setText(missions[i].description);
            final int finalI = i;
            mButton[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, AssessmentActivity.class);
                    intent.putExtra("id", missions[finalI].id);
                    intent.putExtra("description", missions[finalI].description);
                    startActivity(intent);
                    //onActiveClick(view);
                }
            });
        }

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SelectActivity.class);
                startActivity(intent);
            }
        });

        /*Button mButton2 = (Button) findViewById(R.id.mButton2);
        mButton2.setText(missions[1].name);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        Button mButton3 = (Button) findViewById(R.id.mButton3);
        mButton3.setText(missions[2].name);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        Button mButton4 = (Button) findViewById(R.id.mButton4);
        mButton4.setText(missions[3].name);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });*/
    }

    public void onActiveClick(View view){
        switch (view.getId()){
            case R.id.mButton1:
                Intent intent = new Intent(this, AssessmentActivity.class);
                startActivity(intent);
                break;
            case R.id.mButton2:
                Intent intent2 = new Intent(this, AssessmentActivity.class);
                startActivity(intent2);
                break;
            case R.id.mButton3:
                Intent intent3 = new Intent(this, AssessmentActivity.class);
                startActivity(intent3);
                break;
            case R.id.mButton4:
                Intent intent4 = new Intent(this, AssessmentActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
