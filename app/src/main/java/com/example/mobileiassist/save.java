package com.example.mobileiassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class save extends AppCompatActivity {
    Button saved;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        saved= (Button) findViewById(R.id.button4);
        saved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensaved();
            }
        });


    }

    public void opensaved(){
        
        Intent intent=new Intent(this, savedHistory.class);
        startActivity(intent);
    }
}