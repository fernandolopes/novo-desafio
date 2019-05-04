package com.example.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

public class MainActivity extends AppCompatActivity {

    EditText valor1, valor2, valor3;
    Button btnSomar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSomar = (Button) findViewById(R.id.button);
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        valor3 = (EditText) findViewById(R.id.valor3);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(valor1.getText().toString());
                double num2 = Double.parseDouble(valor2.getText().toString());
                double num3 = Double.parseDouble(valor3.getText().toString());

                double soma = ((num1 *1) + (num2 *2) + (num3 * 3)) / 6;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(
                        MainActivity.this);

                dialogo.setTitle("Resultado da soma");
                String nota = "A soma é" + soma + ": ";
                nota += soma >= 6? " Aluno aprovado!" : "Aluno reprovado!";
                dialogo.setMessage(nota);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });
    }
}
