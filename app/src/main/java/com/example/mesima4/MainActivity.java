package com.example.mesima4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView image;
    int ranNum;
    Random rand = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        image = (ImageView) findViewById(R.id.imagenum);

    }

    public void clicker(View view) {
        ranNum = rand.nextInt(3 + 1);
        if(ranNum == 1){
            btn.setText("1");
            image.setImageResource(R.drawable.one);
        }
        if(ranNum == 2) {
            btn.setText("2");
            image.setImageResource(R.drawable.two);
        }
        if(ranNum == 3){
            btn.setText("3");
            image.setImageResource(R.drawable.three);
        }
    }
}