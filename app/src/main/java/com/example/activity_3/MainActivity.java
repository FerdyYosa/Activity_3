package com.example.activity_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText Nama, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btnok);
        Nama = findViewById(R.id.editUN);
        Pass = findViewById(R.id.editPass);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                if (Pass.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}