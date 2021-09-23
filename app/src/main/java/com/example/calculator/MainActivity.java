package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        Integer str1 = Integer.parseInt(firstNumber.getText().toString());
        Integer str2 = Integer.parseInt(secondNumber.getText().toString());
        Integer ans = str1 + str2;

        goToActivity2(ans.toString());
    }

    public void clickSub(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        Integer str1 = Integer.parseInt(firstNumber.getText().toString());
        Integer str2 = Integer.parseInt(secondNumber.getText().toString());
        Integer ans = str1 - str2;

        goToActivity2(ans.toString());
    }

    public void clickMult(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        Integer str1 = Integer.parseInt(firstNumber.getText().toString());
        Integer str2 = Integer.parseInt(secondNumber.getText().toString());
        Integer ans = str1 * str2;

        goToActivity2(ans.toString());
    }

    public void clickDiv(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        Integer str1 = Integer.parseInt(firstNumber.getText().toString());
        Integer str2 = Integer.parseInt(secondNumber.getText().toString());
        Integer ans = str1 / str2;

        goToActivity2(ans.toString());
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}