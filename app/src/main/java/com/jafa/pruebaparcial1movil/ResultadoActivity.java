package com.jafa.pruebaparcial1movil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView tvCedula, tvNombres, tvPlaca, tvAuto, tvMultaContamina, tvImporte5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvCedula = findViewById(R.id.txtCedulaRes);
        tvNombres = findViewById(R.id.txtNombresRes);
        tvPlaca = findViewById(R.id.txtPlacaRes);
        tvAuto = findViewById(R.id.txtAutoRes);
        tvMultaContamina = findViewById(R.id.txtContaminaRes);
        tvImporte5 = findViewById(R.id.txtImporte5);

        Bundle enviarDatos = this.getIntent().getExtras();
        if (enviarDatos != null) {
            String cedula = enviarDatos.getString("ced");
            tvCedula.setText(cedula);
            String nombre = enviarDatos.getString("nom");
            tvNombres.setText(nombre + "");
            String placa = enviarDatos.getString("pla");
            tvPlaca.setText(placa + "");
            String marca = enviarDatos.getString("mar");
            String color = enviarDatos.getString("col");
            String tipo = enviarDatos.getString("tip");
            tvAuto.setText(marca + " " + tipo + " color " + color);
            int anio = enviarDatos.getInt("ani");
            if (anio <= 2010) {
                int calculaAnio = 2023 - anio;
                double multaContamina = calculaAnio * 8.7;
                tvMultaContamina.setText(multaContamina + "");
            } else {
                tvMultaContamina.setText("Su auto no registra esta multa");
            }
            int valor = enviarDatos.getInt("val");
            if ('1' == cedula.charAt(0) && 'I' == placa.charAt(0)) {
                double totalImporte = valor * 21.75;
                tvImporte5.setText("El importe del 5% es de: " + totalImporte);
            } else {
                tvImporte5.setText("No se cobrara");
            }

        }
    }
}