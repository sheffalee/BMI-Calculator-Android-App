package com.example.bmi_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText height, weight;

    private Button bmi_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        bmi_btn = findViewById(R.id.bmi_btn);

        bmi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float h =Float.parseFloat(height.getText().toString());
                float w = Float.parseFloat(weight.getText().toString());


                float res = h /(w*w);
                Log.d("BMI is: ",res+"");
                Toast.makeText(getApplicationContext(), "BMI = " + res, Toast.LENGTH_LONG).show();
            }
        });
    }


}