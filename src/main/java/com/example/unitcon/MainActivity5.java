package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    private Button button7;
    private TextView textView9,textView14,textView15,textView16;
    private EditText edittext5;
    private Spinner spinner7 ,spinner8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button7=findViewById(R.id.button7);
        textView9=findViewById(R.id.textView9);
        textView14=findViewById(R.id.textView14);
        textView15=findViewById(R.id.textView15);
        textView16=findViewById(R.id.textView16);
        edittext5=findViewById(R.id.edittext5);
        spinner7=findViewById(R.id.spinner7);
        spinner8=findViewById(R.id.spinner8);


        String[] from = {"Hours", "Minutes", "Seconds"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spinner7.setAdapter(ad);
        String[] to = {"Hours", "Minutes", "Seconds"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spinner8.setAdapter(ad1);

    }
    public void calculate4(View calculate4){
        String s = edittext5.getText().toString();
        Integer time = Integer.parseInt(s);


        if (spinner7.getSelectedItem().toString().equals("Hours") && spinner8.getSelectedItem().toString().equals("Minutes")) {
            Integer tot = time * 60;
            textView16.setText(String.valueOf(tot));
        } else if (spinner7.getSelectedItem().toString().equals("Hours") && spinner8.getSelectedItem().toString().equals("Seconds")) {
            Integer tot = time * 3600;
            textView16.setText(String.valueOf(tot));
        } else if (spinner7.getSelectedItem().toString() == "Hours" && spinner8.getSelectedItem().toString().equals("Hours")) {
            textView16.setText(String.valueOf(time));
        } else if (spinner7.getSelectedItem().toString() == "Seconds" && spinner8.getSelectedItem().toString().equals("Seconds")) {
            textView16.setText(String.valueOf(time));
        } else if (spinner7.getSelectedItem().toString().equals("Seconds") && spinner8.getSelectedItem().toString().equals("Minutes")) {
            Double tot = time * 0.0167;
            textView16.setText(String.valueOf(tot));
        } else if (spinner7.getSelectedItem().toString().equals("Seconds") && spinner8.getSelectedItem().toString().equals("Hours")) {
            Double tot = time * 0.000278;
            textView16.setText(String.valueOf(tot));
        } else if (spinner7.getSelectedItem().toString().equals("Minutes") && spinner8.getSelectedItem().toString().equals("Hours")) {
            Double tot = time * 0.0167;
            textView16.setText(String.valueOf(tot));
        } else if (spinner7.getSelectedItem().toString().equals("Minutes") && spinner8.getSelectedItem().toString().equals("Minutes")) {
            textView16.setText(String.valueOf(time));
        } else if (spinner7.getSelectedItem().toString().equals("Minutes") && spinner8.getSelectedItem().toString().equals("Seconds")) {
            Integer tot = time * 60;
            textView16.setText(String.valueOf(tot));


        }

    }
}