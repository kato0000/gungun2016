package com.example.tech.gungun2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AssessmentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);
        Intent i = getIntent();
        int id = i.getIntExtra("id",0);
        String description = i.getStringExtra("description");

        TextView textView = (TextView) findViewById(R.id.textViewA);
        textView.setText("「" + description + "」");

        Button button = (Button) findViewById(R.id.buttonA);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });
    }

    public void onActiveClick(View view){
        switch (view.getId()){
            case R.id.buttonA:
                //Intent intent = new Intent(this, MainActivity.class);
                //startActivity(intent);
                finish();
                break;
            case R.id.imageView:
                Intent intent = new Intent(this, SelectActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.imageView2:
                Intent intent2 = new Intent(this, SelectActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}
