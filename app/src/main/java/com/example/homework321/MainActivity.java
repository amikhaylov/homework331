package com.example.homework321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.constraintlayout.widget.Group;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView entryField = findViewById(R.id.entryField);

        final Button number0 = findViewById(R.id.number0);
        number0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number0.getText());
            }
        });

        final Button number1 = findViewById(R.id.number1);
        number1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number1.getText());
            }
        });

        final Button number2 = findViewById(R.id.number2);
        number2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number2.getText());
            }
        });

        final Button number3 = findViewById(R.id.number3);
        number3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number3.getText());
            }
        });

        final Button number4 = findViewById(R.id.number4);
        number4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number4.getText());
            }
        });

        final Button number5 = findViewById(R.id.number5);
        number5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number5.getText());
            }
        });

        final Button number6 = findViewById(R.id.number6);
        number6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number6.getText());
            }
        });

        final Button number7 = findViewById(R.id.number7);
        number7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number7.getText());
            }
        });

        final Button number8 = findViewById(R.id.number8);
        number8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number8.getText());
            }
        });

        final Button number9 = findViewById(R.id.number9);
        number9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(number9.getText());
            }
        });

        final Button point = findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(point.getText());
            }
        });

        final Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(clear.getText());
            }
        });

        final Button negate = findViewById(R.id.negate);
        negate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(negate.getText());
            }
        });

        final Button percent = findViewById(R.id.percent);
        percent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(percent.getText());
            }
        });

        final Button addition = findViewById(R.id.addition);
        addition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(addition.getText());
            }
        });

        final Button subtraction = findViewById(R.id.subtraction);
        subtraction.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(subtraction.getText());
            }
        });

        final Button multiplication = findViewById(R.id.multiplication);
        multiplication.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(multiplication.getText());
            }
        });

        final Button division = findViewById(R.id.division);
        division.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(division.getText());
            }
        });

        final Button calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(calculate.getText());
            }
        });

        final Button sin = findViewById(R.id.sin);
        sin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(sin.getText());
            }
        });

        final Button cos = findViewById(R.id.cos);
        cos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(cos.getText());
            }
        });

        final Button tan = findViewById(R.id.tan);
        tan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(tan.getText());
            }
        });

        final Button log = findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(log.getText());
            }
        });

        final Button ln = findViewById(R.id.ln);
        ln.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(ln.getText());
            }
        });

        final Button sqrt = findViewById(R.id.sqrt);
        sqrt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(sqrt.getText());
            }
        });

        final Button pow = findViewById(R.id.pow);
        pow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(pow.getText());
            }
        });

        final Button factorial = findViewById(R.id.factorial);
        factorial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(factorial.getText());
            }
        });

        final Button pi = findViewById(R.id.pi);
        pi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(pi.getText());
            }
        });

        final Button e = findViewById(R.id.e);
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                entryField.append(e.getText());
            }
        });

        final Group engineering = findViewById(R.id.engineering);

        final Button mode = findViewById(R.id.mode);
        mode.setOnClickListener(new View.OnClickListener() {
            boolean engineeringMode = false;

            public void onClick(View v) {
                if (!engineeringMode) {
                    engineeringMode = true;
                    engineering.setVisibility(Group.VISIBLE);
                    mode.setText(getResources().getString(R.string.engineering));
                } else {
                    engineeringMode = false;
                    engineering.setVisibility(Group.GONE);
                    mode.setText(getResources().getString(R.string.usual));
                }
            }
        });
    }
}
