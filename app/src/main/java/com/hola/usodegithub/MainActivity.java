package com.hola.usodegithub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usuario, password;
    String valor;
    Bundle variables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Asignamos valores
        usuario= (EditText)findViewById(R.id.usuario);
        password=(EditText)findViewById(R.id.password);
    }

    public void enviarDatos(View view) {
        valor = usuario.getText().toString();
        variables = new Bundle();
        variables.putString("valorKey", valor);
        Intent i2 = new Intent(this, MainActivity2.class);
        i2.putExtras(variables);
        startActivity(i2);
    }
}