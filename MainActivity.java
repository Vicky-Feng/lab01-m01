package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnmis,btnpoint,btnd,btnMus,btnC,btneq,screen;
    TextView edttxt;
    float val_one,val_two;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn8);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnplus = (Button) findViewById(R.id.btnplus);
        btnmis = (Button) findViewById(R.id.btnmis);
        btnpoint = (Button) findViewById(R.id.btnpoint);
        btnd = (Button) findViewById(R.id.btnd);
        btnMus = (Button) findViewById(R.id.btnMus);
        btnC = (Button) findViewById(R.id.btnC);
        btneq = (Button) findViewById(R.id.btneq);
        edttxt =(TextView) findViewById(R.id.screen);
        btn1.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "1");
        });

        btn2.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "2");
        });

        btn3.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "3");
        });

        btn4.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "4");
        });

        btn5.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "5");
        });

        btn6.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "6");
        });

        btn7.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "7");
        });

        btn8.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "8");
        });

        btn9.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "9");
        });

        btnplus.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "+");
        });

        btnmis.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "-");
        });

        btnpoint.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + ".");
        });

        btnd.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "/");
        });

        btnMus.setOnClickListener((v) -> {
            edttxt.setText(edttxt.getText() + "*");
        });

        btnplus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){


            }
        });

        btnMus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });

        btnmis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });

        btnd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });

        btneq.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });

        btnC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });

        btnpoint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });





    }
}