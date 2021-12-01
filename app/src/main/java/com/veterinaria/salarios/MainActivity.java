package com.veterinaria.salarios;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtxCategoria, edtxHoras;
 Button btnCalcular;
 TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxCategoria= findViewById(R.id.edtxCategoria);
        edtxHoras= findViewById(R.id.edtxHoras);
        txvResultado= findViewById(R.id.txvResultado);
        btnCalcular= findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Operaciones op= new Operaciones();

                int cate= Integer.parseInt(edtxCategoria.getText().toString());
                int horas= Integer.parseInt(edtxHoras.getText().toString());

                txvResultado.setText(""+op.calcularSalario(cate,horas));

            }
        });

    }
}