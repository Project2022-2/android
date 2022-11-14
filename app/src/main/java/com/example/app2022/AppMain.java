package com.example.app2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_main);
    }

    public void onBtnMyPage(View view){
        Intent intent = new Intent(this, MyPageMain.class);
        startActivity(intent);
    }

    public void onBtnCalculator(View view){
        Intent intent = new Intent(this, CalculateInput.class);
        startActivity(intent);
    }
}