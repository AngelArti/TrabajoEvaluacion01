package com.example.trabajoevaluacion01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Bolas extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    //private Integer ent1;
    //private Integer ent2;
    //private Integer ent3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolas);

        /*EditText rojo = findViewById(R.id.edtRojo);
        EditText azul = findViewById(R.id.edtAzul);
        EditText verde = findViewById(R.id.edtVerde);*/
        RadioGroup grupo = findViewById(R.id.rgColor);
        grupo.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener)this);

        /*rojo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                ent1 = Integer.parseInt(s.toString());

            }
        });

        azul.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                ent2 = Integer.parseInt(s.toString());
            }
        });

        verde.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                ent3 = Integer.parseInt(s.toString());
            }
        });*/
    }



    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        EditText rojo = findViewById(R.id.edtRojo);
        EditText azul = findViewById(R.id.edtAzul);
        EditText verde = findViewById(R.id.edtVerde);
        TextView result = findViewById(R.id.txtResult);
        Integer ent1 = Integer.parseInt(rojo.getText().toString());
        Integer ent2 = Integer.parseInt(azul.getText().toString());
        Integer ent3 = Integer.parseInt(verde.getText().toString());
        Double calculo;
        DecimalFormat df = new DecimalFormat("0.00");


        switch (checkedId) {
            case R.id.rbRojo:
                calculo = (double)(ent1*100)/(ent1+ent2+ent3);
                result.setText("La probabilidad de que saques una bola roja será de: " +df.format(calculo)+ "%");

                break;
            case R.id.rbAzul:
                calculo = (double)(ent2*100)/(ent1+ent2+ent3);
                result.setText("La probabilidad de que saques una bola azul será de: " +df.format(calculo)+ "%");

                break;
            case R.id.rbVerde:
                calculo = (double)(ent3*100)/(ent1+ent2+ent3);
                result.setText("La probabilidad de que saques una bola verde será de: " +df.format(calculo)+ "%");

                break;

        }
        /*public void Calcula (View vista)
    {
        TextView result = findViewById(R.id.txtResult);
        result.setText("Has sacado una bola de color: ");*/
    }
}
