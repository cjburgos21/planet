package com.example.javier.planet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    List<Planet> planetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        planetList = new ArrayList<>();
    }

    private ArrayList<Planet> filllist() {
        ArrayList<Planet> l = new ArrayList<>();
        String desc = "Lorem ipsum algo";

        l.add(new Planet(id 1, title"algo", desc));
        l.add(new Planet(id 2, title"algo2", desc));
        l.add(new Planet(id 3, title"algo", desc));

        return l;
    }

}

