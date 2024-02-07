package com.example.bmi_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;

public class Add2Numbers extends AppCompatActivity {
    
    private EditText number1 , number2;

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add2_numbers);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                int ans = n1+n2;
                Log.d("Answer is ",ans+"");
                Toast.makeText(Add2Numbers.this, "Sum = "+ans, Toast.LENGTH_SHORT).show();
            }
        });

    }
}