package com.example.mindtitation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MeditateActivity extends AppCompatActivity {

    Button btn_tipsmed, btn_medsounds;
    ImageButton btn_backmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meditate);

        btn_tipsmed = findViewById(R.id.btn_tipsmed);
        btn_medsounds = findViewById(R.id.btn_medsounds);
        btn_backmed = findViewById(R.id.btn_backmed);

        btn_tipsmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeditateActivity.this, ImpMedActivity.class);
                startActivity(intent);
            }
        });


    }
}