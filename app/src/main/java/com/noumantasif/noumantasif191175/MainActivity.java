package com.noumantasif.noumantasif191175;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Nouman_191175txt1;
    private EditText Nouman_191175txt2;
    private TextView Nouman_191175txt3;
    private TextView Nouman_191175txt4;
    private Button Nouman_191175button1;
    private  Button Nouman_191175button2;
    private  Button Nouman_191175button3;






    private Button Nouman_191175button4;


    private String string_res = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Nouman_191175txt1 = (EditText) findViewById(R.id.txt_1);




        Nouman_191175txt2 = (EditText) findViewById(R.id.txt_2);
        Nouman_191175txt3= (TextView) findViewById(R.id.txt_3);
        Nouman_191175txt4= (TextView) findViewById(R.id.txt_4);
        Nouman_191175txt3= (TextView) findViewById(R.id.txt_5);
        Nouman_191175txt3= (TextView) findViewById(R.id.txt_6);
        Nouman_191175button1= (Button) findViewById(R.id.btn_1);
        Nouman_191175button2 = (Button) findViewById(R.id.btn_2);
        Nouman_191175button3 = (Button) findViewById(R.id.btn_3);
        Nouman_191175button4 = (Button) findViewById(R.id.btn_4;



        Nouman_191175button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Nouman_191175txt1.getText().length()>0) && (Nouman_191175txt2.getText().length()>0))
                {
                    double operand1 = Double.parseDouble(Nouman_191175txt1.getText().toString());
                    double operand2 = Double.parseDouble(Nouman_191175txt2.getText().toString());
                    double result = operand1 + operand2;
                    String text = operand1 +"+"+operand2+ " = "+ result;
                    Nouman_191175txt3.setText(text);


                    string_res = string_res+","+text;
                   Nouman_191175txt4 .setText(string_res);

                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


        Nouman_191175button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Nouman_191175txt1.getText().length()>0) && (Nouman_191175txt2.getText().length()>0))
                {
                    double operand1 = Double.parseDouble(Nouman_191175txt1.getText().toString());
                    double operand2 = Double.parseDouble(Nouman_191175txt2.getText().toString());
                    double result = operand1 - operand2;
                    String text = operand1 +"-"+operand2+ " = "+ result;

                   Nouman_191175txt3.setText(text);


                    string_res = string_res+","+text;
                    Nouman_191175txt4.setText(string_res);
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        Nouman_191175button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Nouman_191175txt1.getText().length()>0) && (Nouman_191175txt2.getText().length()>0))
                {
                    double operand1 = Double.parseDouble(Nouman_191175txt1.getText().toString());
                    double operand2 = Double.parseDouble(Nouman_191175txt2.getText().toString());
                    double result = operand1 * operand2;
                    String text = operand1 +"*"+operand2+ " = "+ result;

                    Nouman_191175txt3.setText(text);


                    string_res = string_res+","+text;
                   Nouman_191175txt4.setText(string_res);
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        Nouman_191175button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Nouman_191175txt1.getText().length()>0) && (Nouman_191175txt2.getText().length()>0))
                {
                    double operand1 = Double.parseDouble(Nouman_191175txt1.getText().toString());
                    double operand2 = Double.parseDouble(Nouman_191175txt2.getText().toString());
                    double result = operand1 / operand2;
                    String text = operand1 +"/"+operand2+ " = "+ result;

                    Nouman_191175txt3.setText(text);


                    string_res = string_res+","+text;
                    Nouman_191175txt4.setText(string_res);
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}