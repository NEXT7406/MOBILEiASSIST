package com.example.gpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calculate= (Button) findViewById(R.id.button2);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDisplayGPA();
            }
        });




        Spinner myspinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.Credit));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);

        Spinner myspinner1 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> myAdapter1=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.Credit));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner1.setAdapter(myAdapter1);

        Spinner myspinner2 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> myAdapter2=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.Credit));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myAdapter2);

        Spinner myspinner3 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter<String> myAdapter3=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.Credit));
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner3.setAdapter(myAdapter3);

        Spinner myspinner4 = (Spinner) findViewById(R.id.spinner6);
        ArrayAdapter<String> myAdapter4=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.Credit));
        myAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner4.setAdapter(myAdapter4);

        Spinner myspinner5 = (Spinner) findViewById(R.id.spinner7);
        ArrayAdapter<String> myAdapter5=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.Credit));
        myAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner5.setAdapter(myAdapter5);

        Spinner myspinner6 = (Spinner) findViewById(R.id.spinner8);
        ArrayAdapter<String> myAdapter6=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.Credit));
        myAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner6.setAdapter(myAdapter6);

        Spinner myspinner7 = (Spinner) findViewById(R.id.spinner9);
        ArrayAdapter<String> myAdapter7=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.Credit));
        myAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner7.setAdapter(myAdapter7);


    }

    public void openDisplayGPA(){
        Intent intent=new Intent(this, DisplayGPA.class);
        startActivity(intent);
    }
}