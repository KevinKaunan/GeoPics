package com.example.prueba1github;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pasarDeActivity(View view) {
        Intent intentDatos = new Intent(this, Pagina2Activity.class);
        startActivity(intentDatos);
    }
}
