package com.example.prgm6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView textViewEmail;
    private TextView textViewPassword;
    private Button buttonViewDetails;

    private String email;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewEmail = findViewById(R.id.textViewEmail);
        textViewPassword = findViewById(R.id.textViewPassword);
        buttonViewDetails = findViewById(R.id.buttonViewDetails);

        // Get the data from the Intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            email = extras.getString("EMAIL");
            password = extras.getString("PASSWORD");
        }

        // Set up button click listener
        buttonViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email != null && password != null) {
                    // Make the TextViews visible
                    textViewEmail.setVisibility(View.VISIBLE);
                    textViewPassword.setVisibility(View.VISIBLE);

                    // Set the text with the actual data
                    textViewEmail.setText("Email: " + email);
                    textViewPassword.setText("Password: " + password);

                    // Show a Toast message with the details
                    Toast.makeText(MainActivity2.this, "Details:\n" + email + "\n" + password, Toast.LENGTH_LONG).show();
                } else {
                    // Show a message if the details are not available
                    Toast.makeText(MainActivity2.this, "No details available", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
