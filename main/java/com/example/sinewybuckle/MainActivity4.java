package com.example.sinewybuckle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity4 extends AppCompatActivity {

    private Button generar;
    TextView textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        generar = findViewById(R.id.generar);
        textView4 = findViewById(R.id.textView4);


        final Random random = new Random();
        generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String randomNumber = String.valueOf(random.nextInt(999));

                textView4.setText(randomNumber);



            }
        });






    }
}