package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AddButton = (Button) findViewById(R.id.AddButton);
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText FirstNum = (EditText) findViewById(R.id.FirstNum);
                EditText SecondNum = (EditText) findViewById(R.id.SecondNum);
                TextView res= (TextView) findViewById(R.id.res);

                int Num1= Integer.parseInt(FirstNum.getText().toString());
                int Num2= Integer.parseInt(SecondNum.getText().toString());
                int resultat= Num1+ Num2;
                res.setText(resultat+ "");






            }
        });


    }
}
