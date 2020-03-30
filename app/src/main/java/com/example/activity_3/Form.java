package com.example.activity_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form extends AppCompatActivity {

    Button submit;
    EditText Nama, Pass, Telp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit  = findViewById(R.id.btnok);
        Nama    = findViewById(R.id.editUN);
        Pass    = findViewById(R.id.editPass);
        Telp    = findViewById(R.id.editTelp);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (Nama.getText().toString().equals("") && Pass.getText().toString().equals("") && Telp.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Isi Semua Data!", Toast.LENGTH_LONG).show();
                }
                else if (Nama.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Nama Tidak Boleh Kosong.", Toast.LENGTH_LONG).show();
                }
                else if (Pass.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Email Tidak Boleh Kosong.", Toast.LENGTH_LONG).show();
                }
                else if (Telp.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Nomor Telepon Tidak Boleh Kosong.", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}