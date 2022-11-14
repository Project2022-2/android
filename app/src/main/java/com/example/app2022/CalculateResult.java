package com.example.app2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculateResult extends AppCompatActivity {
    TextView result;
    int calresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_result);

        Intent intent = getIntent();
        calresult = intent.getIntExtra("CalResult", 0);
        String num = String.valueOf(calresult);
        result = findViewById(R.id.result);
        result.setText(num);
    }
}