package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    private Button button5;
    private EditText edittext1;
    private TextView textView3 ,textView4,textView7,textView8;
    private Spinner spinner4,spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button5=findViewById(R.id.button5);
        edittext1=findViewById(R.id.edittext1);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        spinner3=findViewById(R.id.spinner3);
        spinner4=findViewById(R.id.spinner4);

        String[] from = {"kilogram", "gram", "pound"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spinner3.setAdapter(ad);
        String[] to = {"kilogram", "gram", "pound"};
        ArrayAdapter<String> ad1 = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spinner4.setAdapter(ad1);
    }
    public void calculate1(View calculate1){
        String s = edittext1.getText().toString();
        Float weigh = Float.parseFloat(s);

        if (spinner3.getSelectedItem().toString().equals("kilogram") && spinner4.getSelectedItem().toString().equals("gram")) {
            Float tot = weigh * 1000;
            textView8.setText(" The Corresponding value of "+weigh+"is"+String.valueOf(tot));
        } else if (spinner3.getSelectedItem().toString().equals("kilogram") && spinner4.getSelectedItem().toString().equals("pound")) {
            Double tot = weigh * 2.205;
            textView8.setText(" The Corresponding value of "+weigh+" is "+String.valueOf(tot));
        } else if (spinner3.getSelectedItem().toString() == "kilogram" && spinner4.getSelectedItem().toString().equals("kilogram")) {
            textView8.setText(" The Corresponding value of "+weigh+" is "+String.valueOf(weigh));
        } else if (spinner3.getSelectedItem().toString() == "pound" && spinner4.getSelectedItem().toString().equals("pound")) {
            textView8.setText(" The Corresponding value of "+weigh+" is "+String.valueOf(weigh));
        } else if (spinner3.getSelectedItem().toString().equals("pound") && spinner4.getSelectedItem().toString().equals("gram")) {
            Double tot = weigh * 453.5;
            textView8.setText(" The Corresponding value of "+weigh+" is "+String.valueOf(tot));
        } else if (spinner3.getSelectedItem().toString().equals("pound") && spinner4.getSelectedItem().toString().equals("kilogram")) {
            Double tot = weigh * 0.454;
            textView8.setText(" The Corresponding value of "+weigh+" is " +String.valueOf(tot));
        } else if (spinner3.getSelectedItem().toString().equals("gram") && spinner4.getSelectedItem().toString().equals("kilogram")) {
            Double tot = weigh * 0.001;
            textView8.setText(" The Corresponding value of "+weigh+" is "+String.valueOf(tot));
        } else if (spinner3.getSelectedItem().toString().equals("gram") && spinner4.getSelectedItem().toString().equals("gram")) {
            textView8.setText(" The Corresponding value of "+weigh+" is "+String.valueOf(weigh));
        } else if (spinner3.getSelectedItem().toString().equals("gram") && spinner4.getSelectedItem().toString().equals("pound")) {
            Double tot = weigh * 0.0022;
            textView8.setText(" The Corresponding value of "+weigh+" is "+String.valueOf(tot));


        }
    }
}