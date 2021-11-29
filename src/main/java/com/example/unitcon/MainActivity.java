package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);


    }
    public void distance(View distance){
        Intent intent = new Intent(this , MainActivity2.class);
        startActivity(intent);

    }
    public void weight(View weight){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }


        }