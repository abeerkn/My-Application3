package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.myapplication3.R.id.*;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView mytext;
    EditText name;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(Hbutton);
        name=(EditText) findViewById(personName);
        mytext=(TextView)  findViewById(Show);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String st= name.getText().toString();
                mytext.setText("hello, "+st);
            }

        });
    }
}