package com.example.toggle;

// Replace with your package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView image1;
    private ImageView image2;
    private Button button;
    private boolean isImage1Visible = true; // Track which image is currently visible

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isImage1Visible) {
                    image1.setVisibility(View.GONE); // Hide image1
                    image2.setVisibility(View.VISIBLE); // Show image2
                } else {
                    image1.setVisibility(View.VISIBLE); // Show image1
                    image2.setVisibility(View.GONE); // Hide image2
                }
                isImage1Visible = !isImage1Visible; // Toggle the visibility state
            }
        });
    }
}