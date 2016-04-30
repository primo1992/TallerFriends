package com.example.carlos.tallerfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class hombre extends AppCompatActivity {


    public void dar1(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.opcion1m.class);
        startActivity(i);
    }

    public void dar2(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.opcion2m.class);
        startActivity(i);
    }

    public void dar3(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.opcion3m.class);
        startActivity(i);
    }

    public void volver(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hombre);
    }
}
