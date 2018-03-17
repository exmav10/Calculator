package com.app.aunal.firstassignmenta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

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
    float startInt = 0;
    int count = 0;
    boolean isDivide = false;
    boolean isPower = false;
    boolean isFirst = true;
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
                if (operation.length() == 0){
                    Toast.makeText(MainActivity.this, "Enter number first.", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + point.getText();
                    textView.setText(operation);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.length() == 0){
                    Toast.makeText(MainActivity.this, "Enter number first.", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + equal.getText();
                    textView.setText(operation);
                    execute();
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.length() == 0){
                    Toast.makeText(MainActivity.this, "Enter number first.", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + divide.getText();
                    textView.setText(operation);
                }
                isFirst = false;

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.length() == 0){
                    Toast.makeText(MainActivity.this, "Enter number first.", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + multiply.getText();
                    textView.setText(operation);
                }
                isFirst = false;
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.length() == 0){
                    Toast.makeText(MainActivity.this, "Enter number first.", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + substract.getText();
                    textView.setText(operation);
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.length() == 0){
                    Toast.makeText(MainActivity.this, "Enter number first.", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + plus.getText();
                    textView.setText(operation);
                }
                isFirst = false;
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation = operation + root.getText();
                textView.setText(operation);
                isFirst = false;

            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.length() == 0){
                    Toast.makeText(MainActivity.this, "Enter number first.", Toast.LENGTH_SHORT).show();
                }else{
                    operation = operation + power.getText();
                    textView.setText(operation);
                    count++;
                }
                isFirst = false;
            }
        });
        //remove last character from operation string
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation.length() != 0){
                    operation = operation.substring(0,operation.length()-1);
                    textView.setText(operation);
                }

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
    private void execute(){
        char firstChar = operation.charAt(0);
        if (firstChar == '+' || firstChar ==  'X' || firstChar == '-' || firstChar == '/' || firstChar == '.'){
            Toast.makeText(MainActivity.this, "Enter number first.", Toast.LENGTH_SHORT).show();
            operation = operation.substring(0,operation.length()-1);
        }else{
            String number = "";
            float toInt = 0;
            ArrayList<Float> numbers = new ArrayList<>();
            ArrayList<Character> operators = new ArrayList<>();
            for (int i=0;i<operation.length();i++){
                char ch = operation.charAt(i);
                if (Character.isDigit(operation.charAt(i))){
                    number = number + ch;
                }else if(ch == '+' || ch ==  'X' || ch == '-' || ch == '/' || ch == '.' || ch== '^' ){
                    if (number != ""){
                        toInt = Float.parseFloat(number);
                    }
                    numbers.add(toInt);
                    number = "";
                    operators.add(ch);
                }else if(ch=='√'){
                    operators.add(ch);
                }else if (ch == '='){
                    toInt = Float.parseFloat(number);
                    numbers.add(toInt);
                    for (int k=0;k<operators.size();k++){
                        char op = operators.get(k);
                        switch (op) {
                            case '+':
                                numbers.add(numbers.get(0) + numbers.get(1));
                                startInt = numbers.get(numbers.size()-1);
                                numbers.remove(0);
                                numbers.remove(0);
                                break;
                            case '-':
                                if (operators.size()>1){
                                    numbers.add(numbers.get(1) - numbers.get(0));
                                }else{
                                    numbers.add(numbers.get(0) - numbers.get(1));
                                }
                                startInt = numbers.get(numbers.size()-1);
                                numbers.remove(0);
                                numbers.remove(0);
                                break;
                            case 'X':
                                numbers.add(numbers.get(0) * numbers.get(1));
                                startInt = numbers.get(numbers.size()-1);
                                numbers.remove(0);
                                numbers.remove(0);
                                break;
                            case '/':
                                if (numbers.get(1) == 0){
                                    Toast.makeText(MainActivity.this,"Illegal",Toast.LENGTH_SHORT).show();
                                 break;
                                }
                                numbers.add(numbers.get(0) / numbers.get(1));
                                startInt = numbers.get(numbers.size()-1);
                                numbers.remove(0);
                                numbers.remove(0);
                                break;
                            case '^':
                                numbers.add((float) Math.pow(numbers.get(0),numbers.get(1)));
                                startInt = numbers.get(numbers.size()-1);
                                numbers.remove(0);
                                numbers.remove(0);
                                break;
                            case '√':
                                numbers.add((float) Math.sqrt(numbers.get(0)));
                                startInt = numbers.get(numbers.size()-1);
                                numbers.remove(0);
                                break;
                        }
                    }
                    operation = startInt + "";
                    textView.setText(operation);
                    operation = "";
                    startInt = 0;
                    isFirst = true;
                }else{
                    Toast.makeText(MainActivity.this,"Look execution",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
