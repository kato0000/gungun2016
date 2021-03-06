package com.example.tech.gungun2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        int num = r.nextInt(5);
        TextView textViewM = (TextView) findViewById(R.id.textViewM);
        for (int i=0;i<missions.length;i++) {
            //Log.d("見書", missions[i].toString());
        }
        //Log.d("テキストm", textViewM.toString());
        switch (num){
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
