package com.example.edzonyunuelfloreslopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button btnbutton;
    Button btnbutton2;
    ImageView imageView;
    RotateAnimation animation = new RotateAnimation(
            0,
            360,
            RotateAnimation.RELATIVE_TO_SELF, 0.5f, //Como debe interpretarse pivotXValue
            RotateAnimation.RELATIVE_TO_SELF, 0.5f);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbutton = findViewById(R.id.button);

        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        btnbutton2 = findViewById(R.id.button2);
        btnbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

        imageView = (ImageView) findViewById(R.id.imageView);
        rotarImagen(imageView);

    }

    private void rotarImagen(View view){
        RotateAnimation animation = new RotateAnimation(0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

        animation.setDuration(2000);
        animation.setRepeatCount(animation.INFINITE);
        animation.setRepeatMode(animation.REVERSE);
        view.startAnimation(animation);
    }
}
