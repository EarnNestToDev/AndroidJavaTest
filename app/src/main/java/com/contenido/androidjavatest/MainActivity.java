// ### Main.java


// # Librerías
package com.contenido.androidjavatest;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


// # Clase #
public class MainActivity extends AppCompatActivity {

    // # Declaración de variables globales #
    private TextView txtSaludo, txtSaludo2; // Label (saludo)
    private Button btnVentana1, btnVentana2, btnSalir; // Botones (Ventana 1, Ventana 2, Salir)


    // # Función auto-generada que se ejecuta al abrir la aplicación #
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // # Bloque de código auto-generado #
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // # Aquí empieza tu lógica # (A partir de aquí ya no se auto-genera nada)

        init(); // Se ejecuta la función 'init'

        txtSaludo.setText("Hola mundo"); // Cambiar texto del elemento vinculado


        // # Establecer acción al presionar el botón #

        btnVentana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // # Aquí se escribe lo que se quiera hacer
                // que ocurra al presionar el botón #

                // # Abrir 'ventana 1'
                startActivity(
                        new Intent(
                                getApplicationContext(),
                                ventana1_practica_class.class
                        )
                );
            }
        });


        btnVentana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // # Aquí se escribe lo que se quiera hacer
                // que ocurra al presionar el botón #

                // # Abrir 'ventana 2'
                startActivity(
                        new Intent(
                                getApplicationContext(),
                                ventana2_practica_class.class
                        )
                );

            }
        });


        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // # Aquí se escribe lo que se quiera hacer
                // que ocurra al presionar el botón #

                cerrarVentana(); // Cerrar aplicación o ventana actual
            }
        });

        // # Final del método onCreate #
    }


    // # Función X (No se auto-genera)
    private void init() {
        // (i) Esta función se ejecuta al "abrir" la aplicación
        // (i) Por lo general aquí solo se pone lo básico

        // # Establece la orientación de pantalla siempre en vertical #
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // # Notificación temporal #
        Toast.makeText(getApplicationContext(), "Hola :D!", Toast.LENGTH_LONG).show(); // Solo muestra un pequeño saludo al abrir la aplicación


        // # Enlace de objetos visuales con variables globales de la clase
        txtSaludo = findViewById(R.id.txtSaludo); // Enlazar variable tipo 'TextView' con elemento de 'activity_main.xml' con id 'txtSaludo'
        txtSaludo2 = findViewById(R.id.txtSaludo2); // Enlazar variable tipo 'TextView' con elemento de 'activity_main.xml' con id 'txtSaludo2'
        btnVentana1 = findViewById(R.id.btnVentana1); // Enlazar variable tipo 'Button' con elemento de 'activity_main.xml' con id 'btnVentana1'
        btnVentana2 = findViewById(R.id.btnVentana2); // Enlazar variable tipo 'Button' con elemento de 'activity_main.xml' con id 'btnVentana2'
        btnSalir = findViewById(R.id.btnSalir); // Enlazar variable tipo 'Button' con elemento de 'activity_main.xml' con id 'btnSalir'

    }


    // # Otras funciones propias #

    private void cerrarVentana() {
        // Al llamar ésta función, la ventana se cierra
        // en caso de estar en la ventana principal
        // el método cierra la app

        this.finish();
    }


    // # Final de la clase MainActivity #
}