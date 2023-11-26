package com.example.mindtitation;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;
public class DashboardActivity extends AppCompatActivity {

    ImageButton btn_profile, btn_menu, btn_sleep, btn_meditate;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        btn_sleep = findViewById(R.id.btn_sleep);
        btn_meditate = findViewById(R.id.btn_meditate);


        btn_sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, SleepActivity.class);
                startActivity(intent);
            }
        });

        btn_meditate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, MeditateActivity.class);
                startActivity(intent);
            }
        });


    }
}
