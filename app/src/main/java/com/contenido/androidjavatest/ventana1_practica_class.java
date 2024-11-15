// ### Practica_1 [ Hola mundo! ] - Ventana #1
// • Mostrar un 'Hola mundo!' de diferentes formas

package com.contenido.androidjavatest;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ventana1_practica_class extends AppCompatActivity {

    private TextView txtMensaje;
    private Button btnForma1, btnForma2, btnForma3, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.ventana1_practica);

        init();

        btnForma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forma1();

            }
        });

        btnForma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forma2();

            }
        });

        btnForma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forma3();

            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerrarVentana();

            }
        });


    }



    private void init() {

        setLayoutVentana();

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        txtMensaje = findViewById(R.id.txtMensaje);
        btnForma1 = findViewById(R.id.btnForma1);
        btnForma2 = findViewById(R.id.btnForma2);
        btnForma3 = findViewById(R.id.btnForma3);

        btnSalir = findViewById(R.id.btnSalir);
    }



    // # Será aquí donde deban escribir su lógica  ( Hacer lo que se pidió ) #

    private void forma1() {
        // # Cambiando el nombre del 'TextView'


    }

    private void forma2() {
        // # Cambiando el nombre del 'Botón'


    }

    private void forma3() {
        // # Con 'Toast' (Notificación temporal)


    }


    private void cerrarVentana() {
        this.finish();
    }

    private void setLayoutVentana() {
        // # Establece que ésta ventana abarque toda la ventana

        DisplayMetrics medidas = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidas);

        int ancho, largo;
        ancho = medidas.widthPixels;
        largo = medidas.heightPixels;

        getWindow().setLayout((int)(ancho * 1), (int)(largo * 1));
    }

}
