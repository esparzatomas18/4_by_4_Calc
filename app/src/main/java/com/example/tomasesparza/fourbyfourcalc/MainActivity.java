package com.example.tomasesparza.fourbyfourcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, operation;
    TextView answer;
    Button calculate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.firstInputTxt);
        num2 = (EditText) findViewById(R.id.secondInputTxt);
        operation = (EditText) findViewById(R.id.opeartionTxt);
        answer = (TextView) findViewById(R.id.answerTxt);
        calculate = (Button) findViewById(R.id.btnCalc);

    }

    public void calcBtnClicked(View v){

        double number1, number2, result;
        String sign;

        number1 = Double.parseDouble(num1.getText().toString());
        number2 = Double.parseDouble(num2.getText().toString());
        sign = operation.getText().toString();

        if(sign.contentEquals("+")) {
            result = number1 + number2;
            answer.setText(result + "");
        }
        else if(sign.contentEquals("-"))
        {
            result = number1 - number2;
            answer.setText(result + "");
        }
        else if(sign.contentEquals("x"))
        {
            result = number1 * number2;
            answer.setText(result + "");
        }
        else if(sign.contentEquals("/"))
        {
            result = number1 / number2;
            answer.setText(result + "");
        }

    }
}
