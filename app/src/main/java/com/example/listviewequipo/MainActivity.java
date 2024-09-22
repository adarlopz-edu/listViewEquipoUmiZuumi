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
     ArrayList<String> nombres;

     EditText editTarea;
     String StringTarea;
     ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        findViewById(R.id.add);
        editTarea = findViewById(R.id.tarea);
        listView = (ListView) findViewById(R.id.listViewxml);
        nombres = new ArrayList<String>();

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres);
        listView.setAdapter(adaptador);

    }

    public void play(View view) {
        StringTarea = editTarea.getText().toString();

        nombres.add(StringTarea);
        adaptador.notifyDataSetChanged();
    }
}