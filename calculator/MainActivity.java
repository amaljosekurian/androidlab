package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {
//Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    String currentInput = "";
    double operand1 = 0;
    String operator = "";
MaterialTextView text;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.t1);


    }

    public void onDigitClick(View view){
        currentInput+=((Button)view).getText().toString();
        updateDisplay();
    }

    private void updateDisplay() {
        text.setText(currentInput);
    }
    public  void onOperator(View view){
        if(!currentInput.isEmpty()) {
            operand1=Double.parseDouble(currentInput);
            operator = ((Button) view).getText().toString();
            currentInput="";
        }
    }
    public  void Equalclick(View view){
        if(!currentInput.isEmpty()){
            double operand2=Double.parseDouble(currentInput);
            double res=operate(operand1,operator,operand2);
            currentInput=String.valueOf(res);
            updateDisplay();
        }
    }
    public  void clear(View view){
       operand1=0;
       currentInput="";
       operator="";
       updateDisplay();

    }

    private double operate(double operand1, String operator, double operand2) {
      switch (operator){
          case "+":
              return operand1 + operand2;
          case "-":
              return operand1 - operand2;
          case "*":
              return operand1 * operand2;
          case "/":
              if(operand2!=0){
                  return operand1/operand2;
              }else {
                  return Double.NaN;
              }
          default:
              return 0;
      }
    }
}