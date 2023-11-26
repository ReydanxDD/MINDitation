package com.example.mindtitation;

import static android.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ImpSleepActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp_sleep);

        listView=findViewById(R.id.listview);

        String[] title=getResources().getStringArray(R.array.title_sleep);
        final String[] details= getResources().getStringArray(R.array.detail_sleep);

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this, layout.simple_list_item_1,title);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> AdapterView, View view, int i, long id) {
                String iss = details[i];
                Intent ii = new Intent(ImpSleepActivity.this,detailsactivity.class);
                ii.putExtra("detail",iss);
                startActivity(ii);


            }
        });
    }
}