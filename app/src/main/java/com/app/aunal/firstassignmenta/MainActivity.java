package com.app.aunal.firstassignmenta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textView) TextView textView;
    @BindView(R.id.seven) Button seven;
    @BindView(R.id.eight) Button eight;
    @BindView(R.id.nine) Button nine;
    @BindView(R.id.six) Button six;
    @BindView(R.id.five) Button five;
    @BindView(R.id.four) Button four;
    @BindView(R.id.three) Button three;
    @BindView(R.id.two) Button two;
    @BindView(R.id.one) Button one;
    @BindView(R.id.zero) Button zero;
    @BindView(R.id.point) Button point;
    @BindView(R.id.equal) Button equal;
    @BindView(R.id.divide) Button divide;
    @BindView(R.id.multiply) Button multiply;
    @BindView(R.id.substract) Button substract;
    @BindView(R.id.plus) Button plus;
    @BindView(R.id.backSpace) Button back;
    @BindView(R.id.clearAll) Button clear;
    @BindView(R.id.root) Button root;
    @BindView(R.id.power) Button power;
    private String operation = "";
    int startInt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setClickListeners();
    }
    private void setClickListeners(){

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + seven.getText();
                textView.setText(operation);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + eight.getText();
                textView.setText(operation);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + nine.getText();
                textView.setText(operation);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + six.getText();
                textView.setText(operation);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + five.getText();
                textView.setText(operation);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + four.getText();
                textView.setText(operation);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + three.getText();
                textView.setText(operation);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + two.getText();
                textView.setText(operation);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + one.getText();
                textView.setText(operation);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + zero.getText();
                textView.setText(operation);
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + point.getText();
                textView.setText(operation);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("this is operation = " + operation);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + divide.getText();
                textView.setText(operation);

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + multiply.getText();
                textView.setText(operation);
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + substract.getText();
                textView.setText(operation);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + plus.getText();
                textView.setText(operation);
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + root.getText();
                textView.setText(operation);
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation + power.getText();
                textView.setText(operation);
            }
        });
        //remove last character from operation string
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = operation.substring(0,operation.length()-1);
                textView.setText(operation);
            }
        });
        //clear operation string
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "";
                textView.setText(operation);
            }
        });
    }

}
