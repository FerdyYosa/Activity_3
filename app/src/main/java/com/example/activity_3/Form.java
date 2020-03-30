package com.example.activity_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
        setContentView(R.layout.form);

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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popupmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            startActivity(new Intent(this, Form.class));
        } else if (item.getItemId() == R.id.menu2){
            startActivity(new Intent(this, Activity2.class));
        } else if (item.getItemId() == R.id.menu3) {
            startActivity(new Intent(this, Activity3.class));
        }
        return true;
    }
}