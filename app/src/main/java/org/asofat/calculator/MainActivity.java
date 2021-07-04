package org.asofat.calculator;

import androidx.appcompat.app.AppCompatActivity;

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

        EditText xpression = (EditText) findViewById(R.id.expression);

        TextView result = (TextView) findViewById(R.id.result);

        Button btn0 = (Button) findViewById(R.id.button0);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);

        Button btnDot = (Button) findViewById(R.id.power);
        Button btnAdd = (Button) findViewById(R.id.addition);
        Button btnSub = (Button) findViewById(R.id.subtract);
        Button btnMultiply = (Button) findViewById(R.id.multiply);
        Button btnDiv = (Button) findViewById(R.id.divide);
        Button btnMod = (Button) findViewById(R.id.modulus);
        Button btnPi = (Button) findViewById(R.id.pi);
        Button Equals = (Button) findViewById(R.id.answer);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Button btn  = (Button) v;
                xpression.append((btn.getText().toString()));
            }
        };

        btn0.setOnClickListener(listener);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btnDot.setOnClickListener(listener);
        btnDiv.setOnClickListener(listener);
        btnAdd.setOnClickListener(listener);
        btnSub.setOnClickListener(listener);
        btnMod.setOnClickListener(listener);
        btnMultiply.setOnClickListener(listener);
        btnPi.setOnClickListener(listener);
        Equals.setOnClickListener(listener);


    }
    // TODO : perform simple calculations like add, subtract, multiply, divide and mod.


}