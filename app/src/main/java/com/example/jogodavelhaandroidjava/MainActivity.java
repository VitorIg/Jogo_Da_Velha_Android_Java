package com.example.jogodavelhaandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button buttonGameVelha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGameVelha = findViewById(R.id.button_jogar_velha);
        buttonGameVelha.setOnClickListener(view -> {
            startActivity(new Intent(this, JogoDaVelha.class));
        });
    }
}