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
import android.widget.PopupMenu;

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


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.popupmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item) {
        if (item.getItemId() == R.layout.form) {
            startActivity(new Intent(this, Form.class));
        }
        return true;
    }
}