package com.example.tech.gungun2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AssembleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assemble);

        Intent i = getIntent();
        int id = i.getIntExtra("id",0);
        int pid[] = { R.id.parts1, R.id.parts2, R.id.parts3, R.id.parts4, R.id.parts5};
        ImageView imageViewS = (ImageView) findViewById(R.id.partssil);

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

        Button button = (Button) findViewById(R.id.buttonAs);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });
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
