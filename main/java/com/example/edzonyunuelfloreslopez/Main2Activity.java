package com.example.edzonyunuelfloreslopez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    ListView listView;


    int avatar[]={R.drawable.a};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView =findViewById(R.id.lista);


    }
}
