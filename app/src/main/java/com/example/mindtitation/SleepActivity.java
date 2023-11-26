package com.example.mindtitation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SleepActivity extends AppCompatActivity {

    Button btn_tipssleep, btn_sleepsounds;
    ImageButton btn_backsleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sleep);

        btn_tipssleep = findViewById(R.id.btn_tipssleep);
        btn_sleepsounds = findViewById(R.id.btn_sleepsounds);
        btn_backsleep = findViewById(R.id.btn_backsleep);

        btn_tipssleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SleepActivity.this, ImpSleepActivity.class);
                startActivity(intent);
            }
        });

        btn_sleepsounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SleepActivity.this, SleepSoundsActivity.class);
                startActivity(intent);
            }
        });


    }
}