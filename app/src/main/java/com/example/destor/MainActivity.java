package com.example.destor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etA, etB, etC;
    Button btnCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    connectComponents();

    private void connectComponents()
    {
        etA=findViewById(R.id.etAMain);
        etB=findViewById(R.id.etBMain);
        etC=findViewById(R.id.etCMain);
        btnCalculate=findViewById(R.id.btnCalculateMain);

    }

        public void calculate(View view) {

        String a=etA.getText().toString();
            String b=etB.getText().toString();
            String c=etC.getText().toString();
            if


        }
}