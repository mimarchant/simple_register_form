package com.example.simple_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name);
        EditText lastName = findViewById(R.id.lastName);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        Button registerButton = findViewById(R.id.registerBtn);
    }
}