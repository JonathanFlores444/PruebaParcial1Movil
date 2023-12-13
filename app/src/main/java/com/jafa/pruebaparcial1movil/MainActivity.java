package com.jafa.pruebaparcial1movil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edCedula,edNombres,edPlaca,edAnFab,edMarca,edColor,edTipo,edValor,edMultas;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edCedula=findViewById(R.id.txtCedula);
        edNombres=findViewById(R.id.txtNombres);
        edPlaca=findViewById(R.id.txtPlaca);
        edAnFab=findViewById(R.id.txtAniofab);
        edMarca=findViewById(R.id.txtMarca);
        edColor=findViewById(R.id.txtColor);
        edTipo=findViewById(R.id.txtTipo);
        edValor=findViewById(R.id.txtValor);
        edMultas=findViewById(R.id.txtNumMultas);
        btnCalcular=findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cedula = Integer.parseInt(edCedula.getText().toString());
                String nombres = edNombres.getText().toString();
                int placa = Integer.parseInt(edPlaca.getText().toString());
                int anio = Integer.parseInt(edAnFab.getText().toString());
                String marca = edMarca.getText().toString();
                String color = edColor.getText().toString();
                String tipo = edTipo.getText().toString();
                int valor = Integer.parseInt(edValor.getText().toString());
                int multas = Integer.parseInt(edMultas.getText().toString());

                if(anio <= 2010){

                }


            }
        });
    }
}