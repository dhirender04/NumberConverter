package com.example.numberconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {
    private static final int SPLASH_OUT_TIME=4000;
    private ImageView imgApp;
    private TextView welcometxt;
    private TextView createrName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgApp=findViewById(R.id.imgApp);
        welcometxt=findViewById(R.id.welcometxt);
         createrName=findViewById(R.id.createrName);

         welcometxt.setX(-350);
       createrName.setY(-200);

        ///Animation
       imgApp.animate().rotation(360).setDuration(2000);
       welcometxt.animate().translationXBy(350).setDuration(1000);
       createrName.animate().translationYBy(200).setDuration(2000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_OUT_TIME);

    }


}