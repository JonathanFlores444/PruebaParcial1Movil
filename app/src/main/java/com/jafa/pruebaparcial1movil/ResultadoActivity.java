package com.jafa.pruebaparcial1movil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView tvCedula,tvNombres,tvPlaca,tvAuto,tvMultaContamina,tvTuttiMultas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvCedula=findViewById(R.id.txtCedulaRes);
        tvNombres=findViewById(R.id.txtNombresRes);
        tvPlaca=findViewById(R.id.txtPlacaRes);
        tvAuto=findViewById(R.id.txtAutoRes);
        tvMultaContamina=findViewById(R.id.txtContaminaRes);
        tvTuttiMultas=findViewById(R.id.txtTotalMultasRes);

        Bundle enviarDatos = this.getIntent().getExtras();
        if(enviarDatos!= null){
            int cedula = enviarDatos.getInt("ced");
            tvCedula.setText(cedula);
            String nombre = enviarDatos.getString("nom");
            tvNombres.setText(nombre+"");
            String placa = enviarDatos.getString("pla");
            tvPlaca.setText(placa+"");
            String marca = enviarDatos.getString("mar");
            String color = enviarDatos.getString("col");
            String tipo = enviarDatos.getString("tip");
            tvAuto.setText(marca+" "+tipo+" color "+color);
            int anio = enviarDatos.getInt("ani");
            if(anio <= 2010){
                int calculaAnio = 2023-anio;
                double multaContamina = calculaAnio * 8.6;
                tvMultaContamina.setText(multaContamina+"");
            }else{
                tvMultaContamina.setText("Su auto no registra esta multa");
            }
            
    }
}