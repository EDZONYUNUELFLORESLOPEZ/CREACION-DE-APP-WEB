package com.example.sinewybuckle;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText edtpeso,edtaltura;
    TextView txtimc,txtinfrapeso,txtnormal,txtsobrepeso,txtobesidad1,txtobesidad2,txtobesidad3;
    Button btncalcular,btnborrar,btnregresar;
    float peso, altura,imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edtpeso=(EditText)findViewById(R.id.peso);
        edtaltura=(EditText)findViewById(R.id.altura);

        txtimc=(TextView)findViewById(R.id.imc);
        txtinfrapeso=(TextView)findViewById(R.id.infrapeso);
        txtnormal=(TextView)findViewById(R.id.normal);
        txtsobrepeso=(TextView)findViewById(R.id.sobrepeso);
        txtobesidad1=(TextView)findViewById(R.id.obesidad1);
        txtobesidad2=(TextView)findViewById(R.id.obesidad2);
        txtobesidad3=(TextView)findViewById(R.id.obesidad3);

        btnregresar=(Button)findViewById(R.id.btnregresar);
        btnregresar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
            }
        });

        btncalcular=(Button)findViewById(R.id.calcular);
        btncalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                peso=Float.parseFloat(edtpeso.getText().toString());
                altura=Float.parseFloat(edtaltura.getText().toString());
                imc=peso/(altura*altura);
                txtimc.setText("IMC: "+redondear(imc));
                borrar();
                if(imc<18.5){
                    txtinfrapeso.setBackgroundColor(Color.parseColor("#000000"));
                    txtinfrapeso.setTextColor(Color.parseColor("#FFFFFF"));
                }
                if(imc>=18.5&&imc<25){
                    txtnormal.setBackgroundColor(Color.parseColor("#000000"));
                    txtnormal.setTextColor(Color.parseColor("#FFFFFF"));
                }
                if(imc>=25&&imc<30){
                    txtsobrepeso.setBackgroundColor(Color.parseColor("#000000"));
                    txtsobrepeso.setTextColor(Color.parseColor("#FFFFFF"));
                }
                if(imc>=30&&imc<35){
                    txtobesidad1.setBackgroundColor(Color.parseColor("#000000"));
                    txtobesidad1.setTextColor(Color.parseColor("#FFFFFF"));
                }
                if(imc>=35&&imc<40){
                    txtobesidad2.setBackgroundColor(Color.parseColor("#000000"));
                    txtobesidad2.setTextColor(Color.parseColor("#FFFFFFFFF"));
                }
                if(imc>=40){
                    txtobesidad3.setBackgroundColor(Color.parseColor("#000000"));
                    txtobesidad3.setTextColor(Color.parseColor("#FFFFFFFFF"));
                }
            }
        });


        btnborrar=(Button)findViewById(R.id.borrar);
        btnborrar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                borrar();
                edtpeso.setText("");
                edtaltura.setText("");
                txtimc.setText("IMC:");
            }
        });


    }
    public float redondear(float n){
        float res;
        int valor=0;
        valor=(int)(n*100);
        res=(float)valor/100;
        return res;
    }
    public void borrar(){
        txtinfrapeso.setBackgroundColor(Color.parseColor("#FFFFFFFFF"));
        txtinfrapeso.setTextColor(Color.parseColor("#000000"));

        txtnormal.setBackgroundColor(Color.parseColor("#FFFFFFFFF"));
        txtnormal.setTextColor(Color.parseColor("#000000"));

        txtsobrepeso.setBackgroundColor(Color.parseColor("#FFFFFFFFF"));
        txtsobrepeso.setTextColor(Color.parseColor("#000000"));

        txtobesidad1.setBackgroundColor(Color.parseColor("#FFFFFFFFF"));
        txtobesidad1.setTextColor(Color.parseColor("#000000"));

        txtobesidad2.setBackgroundColor(Color.parseColor("#FFFFFF"));
        txtobesidad2.setTextColor(Color.parseColor("#000000"));

        txtobesidad3.setBackgroundColor(Color.parseColor("#FFFFFF"));
        txtobesidad3.setTextColor(Color.parseColor("#000000"));

    }
}