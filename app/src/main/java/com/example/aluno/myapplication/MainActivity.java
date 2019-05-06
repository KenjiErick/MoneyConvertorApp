package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button dol;
    private Button yen;
    private Button real;
    private Button euro;
    private Button dolc;
    private Button yenc;
    private Button realc;
    private Button euroc;
    private TextView result;
    private EditText valor;
    private Toast erro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dol = (Button) findViewById(R.id.buttonDol);
        dolc = (Button) findViewById(R.id.buttonDol2);
        yen = (Button) findViewById(R.id.buttonYen);
        yenc = (Button) findViewById(R.id.buttonYen2);
        real = (Button) findViewById(R.id.buttonReal);
        realc = (Button) findViewById(R.id.buttonReal2);
        euro = (Button) findViewById(R.id.buttonEuro);
        euroc = (Button) findViewById(R.id.buttonEuro2);
        result = (TextView) findViewById(R.id.textResult);
        valor = (EditText) findViewById(R.id.editText4);

        dol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    final Double doll = Double.parseDouble(valor.getText().toString());

                    dolc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+doll);
                        }
                    });

                    yenc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+doll*110.90);
                        }
                    });

                    realc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+doll*3.96);
                        }
                    });

                    euroc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+doll*0.89);
                        }
                    });

                } catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro", Toast.LENGTH_SHORT).show();
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    final Double yenn = Double.parseDouble(valor.getText().toString());

                    dolc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+yenn*0.0090);
                        }
                    });

                    yenc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+yenn);
                        }
                    });

                    realc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+yenn*0.036);
                        }
                    });

                    euroc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+yenn*0.0081);
                        }
                    });

                } catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro", Toast.LENGTH_SHORT).show();
                }
            }
        });

        real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    final Double reall = Double.parseDouble(valor.getText().toString());

                    dolc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+reall*0.25);
                        }
                    });

                    yenc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+reall*28.01);
                        }
                    });

                    realc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+reall);
                        }
                    });

                    euroc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+reall*0.23);
                        }
                    });

                } catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro", Toast.LENGTH_SHORT).show();
                }
            }
        });

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    final Double euroo = Double.parseDouble(valor.getText().toString());

                    dolc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+euroo*1.12);
                        }
                    });

                    yenc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+euroo*124.17);
                        }
                    });

                    realc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+euroo*4.43);
                        }
                    });

                    euroc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            result.setText("Resultado: "+euroo);
                        }
                    });
                } catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
