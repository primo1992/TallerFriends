package com.example.carlos.tallerfriends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RatingBar;

public class mujer extends AppCompatActivity {



    public void dar1(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.opcion1h.class);
        startActivity(i);
    }

    public void dar2(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.opcion2h.class);
        startActivity(i);
    }

    public void dar3(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.opcion3h.class);
        startActivity(i);
    }

    public void volver(View view){
        Intent i = new Intent(this, com.example.carlos.tallerfriends.MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mujer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();





            }
        });
    }

}
