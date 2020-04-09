package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Button loginButton = findViewById(R.id.button3);
        final EditText emailEditText = findViewById(R.id.editText);
        final EditText passEditText = findViewById(R.id.editText7);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emailEditText.getText().toString().isEmpty()) {
                    emailEditText.setError("Empty field not allowed !");
                }
                if (passEditText.getText().toString().isEmpty()) {
                    passEditText.setError("Empty field not allowed !");
                }
            }
        });
    }
    public void Signup(View view) {
        Intent i = new Intent(User.this,UserSignUp.class);
        startActivity(i);
    }
}
