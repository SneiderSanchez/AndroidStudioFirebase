package com.example.taller3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class logged extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
        Intent myIntent = getIntent(); // gets the previously created intent
        String name = myIntent.getStringExtra("name"); // will return "FirstKeyValue"
        String email = myIntent.getStringExtra("email"); // will return "FirstKeyValue"
        TextView userName = (TextView)findViewById(R.id.userName);
        userName.setText(name);
        TextView userEmail = (TextView)findViewById(R.id.userEmail);
        userEmail.setText(email);

        button = findViewById(R.id.toNewLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logged.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
