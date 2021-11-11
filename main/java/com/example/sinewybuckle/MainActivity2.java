package com.example.sinewybuckle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void calcularEcuacion(View v){

        double x1, x2;

        EditText sCoeficienteA = (EditText)findViewById(R.id.txtCoeficienteA);
        EditText sCoeficienteB = (EditText)findViewById(R.id.txtCoeficienteB);
        EditText sCoeficienteC = (EditText)findViewById(R.id.txtCoeficienteC);
        TextView sResultado = (TextView) findViewById(R.id.lblResultado);

        double a = Double.parseDouble(sCoeficienteA.getText().toString());
        double b = Double.parseDouble(sCoeficienteB.getText().toString());
        double c = Double.parseDouble(sCoeficienteC.getText().toString());

        //calculamos el determinante
        double d = ((b*b)-4*a*c);

        if(d<0){
            sResultado.setText("No existen soluciones reales");
        }
        else{
            //queda confirmar que A sea distinto de 0
            //si a=0 nos encontramos una división por cero.
            x1 = ( -b + Math.sqrt(d))/(2*a);

            x2 = ( -b - Math.sqrt(d))/(2*a);

            sResultado.setText("Solución X1: " +x1 + "\n Solución X2: "+x2);


        }
    }

    public void creditos(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Por Edzon yunuel")
                .setTitle("Desarrollado")
                .setCancelable(false)
                .setNeutralButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}
