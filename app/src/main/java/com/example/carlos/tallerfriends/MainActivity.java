package com.example.carlos.tallerfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void mujer(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.mujer.class);
        startActivity(i);
    }

    public void hombre(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.hombre.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

