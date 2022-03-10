package com.example.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input1 = 0, input2 = 0, res = 0;
    TextView edt1;
    boolean Addition, Subtract, Multiplication, Division, decimal;
    Button btn_clear, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_Dot, btn_Add, btn_Sub, btn_mul, btn_Division, btn_Eql, btn_Del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_Dot = (Button) findViewById(R.id.btn_dot);
        btn_Add = (Button) findViewById(R.id.btn_add);
        btn_Sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_Division = (Button) findViewById(R.id.btn_div);
        btn_Del = (Button) findViewById(R.id.btn_clear);


        edt1 = (TextView) findViewById(R.id.SHOW_ALL);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt1.setText(edt1.getText() + "1");
            }

        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });


        btn_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;

            }
        });

        btn_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {

                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Addition = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        btn_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Division = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        btn_Eql = (Button) findViewById(R.id.btn_Equal);
        btn_Eql.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Addition) {
                        input2 = Float.parseFloat(edt1.getText() + "");
                        res = input1 + input2;
                        edt1.setText("= " +res);

                    }

                    if (Subtract) {
                        input2 = Float.parseFloat(edt1.getText() + "");
                        res = input1 - input2;
                        edt1.setText("= " +res);
                    }

                    if (Multiplication) {
                        input2 = Float.parseFloat(edt1.getText() + "");
                        res = input1 * input2;
                        edt1.setText("= " +res);
                    }

                    if (Division) {
                        input2 = Float.parseFloat(edt1.getText() + "");
                        res = input1 / input2;
                        edt1.setText("= " +res);
                    }
                }
            });
        }
    }