package com.example.sinewybuckle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnbutton3,btnbutton,btnbutton2,btnbutton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbutton3=(Button)findViewById(R.id.button3);
        btnbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
            }
        });

        btnbutton=(Button)findViewById(R.id.button);
        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            }
        });

        btnbutton2=(Button)findViewById(R.id.button2);
        btnbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity4.class);
            }
        });

        btnbutton4=(Button)findViewById(R.id.button4);
        btnbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity5.class);
            }
        });
    }
}