package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button button4;
    private TextView textView6, textView5, textView2, textView;
    private Spinner spinner, spinner2;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button4 = findViewById(R.id.button4);
        textView2 = findViewById(R.id.textView11);
        textView5 = findViewById(R.id.textView12);
        textView6 = findViewById(R.id.textView13);
        textView = findViewById(R.id.textView10);
        spinner = findViewById(R.id.spinner5);
        spinner2 = findViewById(R.id.spinner2);
        edittext = findViewById(R.id.edittext3);

        String[] from = {"kilometer", "Miles", "meter"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spinner.setAdapter(ad);
        String[] to = {"kilometer", "Miles", "meter"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spinner2.setAdapter(ad1);
    }

    public void calculate(View calculate) {

        String s = edittext.getText().toString();
        Float dist = Float.parseFloat(s);
        if (spinner.getSelectedItem().toString().equals("kilometer") && spinner2.getSelectedItem().toString().equals("meter")) {
            Float tot = dist * 1000;
            textView6.setText(" The Corresponding value of "+dist+" is "+String.valueOf(tot));
        } else if (spinner.getSelectedItem().toString().equals("kilometer") && spinner2.getSelectedItem().toString().equals("Miles")) {
            Double tot = dist * 0.621;
            textView6.setText(" The Corresponding value of "+dist+" is "+String.valueOf(tot));
        } else if (spinner.getSelectedItem().toString() == "kilometer" && spinner2.getSelectedItem().toString().equals("kilometer")) {
            textView6.setText(" The Corresponding value of "+dist+" is "+String.valueOf(dist));
        } else if (spinner.getSelectedItem().toString() == "Miles" && spinner2.getSelectedItem().toString().equals("Miles")) {
            textView6.setText(" The Corresponding value of "+dist+" is "+String.valueOf(dist));
        } else if (spinner.getSelectedItem().toString().equals("Miles") && spinner2.getSelectedItem().toString().equals("meter")) {
            Double tot = dist * 1609.3;
            textView6.setText(" The Corresponding value of "+dist+" is " +String.valueOf(tot));
        } else if (spinner.getSelectedItem().toString().equals("Miles") && spinner2.getSelectedItem().toString().equals("kilometer")) {
            Double tot = dist * 1.609;
            textView6.setText(" The Corresponding value of "+dist+" is "+String.valueOf(tot));
        } else if (spinner.getSelectedItem().toString().equals("meter") && spinner2.getSelectedItem().toString().equals("kilometer")) {
            Float tot = dist / 1000;
            textView6.setText(" The Corresponding value of "+dist+" is "+String.valueOf(tot));
        } else if (spinner.getSelectedItem().toString().equals("meter") && spinner2.getSelectedItem().toString().equals("meter")) {
            textView6.setText(" The Corresponding value of "+dist+" is "+String.valueOf(dist));
        } else if (spinner.getSelectedItem().toString().equals("meter") && spinner2.getSelectedItem().toString().equals("Miles")) {
            Double tot = dist * 0.000621;
            textView6.setText(" The Corresponding value of "+dist+" is "+String.valueOf(tot));


        }

    }
}












