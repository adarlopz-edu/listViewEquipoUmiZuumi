package com.example.listviewequipo;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ListView listView;
     ArrayList<String> contactos;

     EditText nom, num;
     String nombre, numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }

    public void play(View view) {

        nombre = nom.getText().toString();
        numero = num.getText().toString();

        findViewById(R.id.add);
        nom = findViewById(R.id.nombre);
        num = findViewById(R.id.numero);
        listView = (ListView) findViewById(R.id.listViewxml);

        contactos = new ArrayList<String>();
        contactos.add(nombre);
        contactos.add(numero);
        contactos.add("hola3");
        contactos.add("hola4");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contactos);
        listView.setAdapter(adapter);

    }
}