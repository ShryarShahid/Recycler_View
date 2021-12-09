package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList= (RecyclerView) findViewById(R.id.prorammingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"Muzzamil", "Talha", "Saira", "Afshan", "Zakir", "Ali", "Aman", "Nawaz", "Alina", "Ashfaq", "Ayesha", "Minahil", "Minha"};
        programmingList.setAdapter(new ProgrammingAdapter(languages));
    }
}