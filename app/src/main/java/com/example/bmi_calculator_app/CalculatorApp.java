package com.example.bmi_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
public class CalculatorApp extends AppCompatActivity {

   private EditText number1, number2;

   private Button add ,subtract, multiply , divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_app);

        number1 = findViewById(R.id.num1);
        number2 = findViewById(R.id.num2);
        add = findViewById(R.id.addition);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());

                Log.d("Addition = ",a+b+"");
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());

                Log.d("Subtraction = ", a-b+"");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());

                Log.d("Multiply = ", a*b+"");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());

                Log.d("Divide = ", a/b+"");
            }
        });
    }
}