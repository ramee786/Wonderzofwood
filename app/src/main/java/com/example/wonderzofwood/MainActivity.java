package com.example.wonderzofwood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText password;
    Button login, login1;
    TextView signUp;
    ProgressBar progressBar;
    Button text_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intitViews();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.login:
                        loginButtonClicked();
                        break;
                    case R.id.signUp:
                        signUpButtonClicked();
                        break;
                }
            }
        });
    }

    private void signUpButtonClicked() {
    }


    private void loginButtonClicked() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);

    }

    private void intitViews() {
        userName = findViewById(R.id.user_name);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        signUp = findViewById(R.id.signUp);
        progressBar = findViewById(R.id.progressBar);
    }
}