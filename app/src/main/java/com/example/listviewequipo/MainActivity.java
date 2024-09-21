package com.example.listviewequipo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //hola, esto lo escribio brad
        //hi
        findViewById(R.id.play);
    }

    public void play(View view) {

        if(mp3!=null)
            mp3.release();
        mp3= new MediaPlayer();
        try {
            mp3.setDataSource("https://file-examples.com/storage/fee0ddbaf066ed3199cfa16/2017/11/file_example_MP3_700KB.mp3");
            mp3.prepareAsync();
            Toast.makeText(this, "wait", Toast.LENGTH_SHORT).show();
        }catch (IOException e){
            Toast.makeText(this, "no existe el archivo", Toast.LENGTH_SHORT).show();
        }
        mp3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mp3.start();
            }
        });

    }
}