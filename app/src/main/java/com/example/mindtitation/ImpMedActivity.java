package com.example.mindtitation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ImpMedActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp_med);

        listView=findViewById(R.id.listvieww);

        String[] title=getResources().getStringArray(R.array.title_med);
        final String[] details= getResources().getStringArray(R.array.detail_med);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,title);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> AdapterView, View view, int i, long id) {
                String iss = details[i];
                Intent ii = new Intent(ImpMedActivity.this,detailsactivity.class);
                ii.putExtra("detail",iss);
                startActivity(ii);


            }
        });
    }
}