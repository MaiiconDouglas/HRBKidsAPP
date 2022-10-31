package com.example.hrbkidsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntroActivity extends AppCompatActivity {

private ConstraintLayout startBtnDashboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        startBtnDashboard=findViewById(R.id.startBtn);


        startBtnDashboard.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                startActivity(new Intent(IntroActivity.this,MainActivity.class));
            }


        });
    }
}