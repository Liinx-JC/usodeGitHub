package com.hola.usodegithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView datos;
    String valorRecibido;
    Bundle variablesReci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //ASIGNAMOS VALORES
        datos =(TextView)findViewById(R.id.nom);
        //Recuperamos Valores

    }
}