package com.example.climatefintechapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buying();
            }
        });
        button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Selling();
            }
        });
    }
    public void Buying(){
        Intent intent = new Intent(this, BuyingActivity.class);
        startActivity(intent);
    }
    public void Selling(){
        Intent intent = new Intent(this, PaperActivity.class);
        startActivity(intent);
    }



}