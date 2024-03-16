package com.example.midtermketevanabuladze;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        // Find the "Previous" button by its ID
        Button previousButton = findViewById(R.id.previousButton);

        // Set a click listener on the "Previous" button
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity when the "Previous" button is clicked
                startMainActivity();
            }
        });
    }

    // Method to start MainActivity
    private void startMainActivity() {
        Intent intent = new Intent(ContactActivity.this, MainActivity.class);
        startActivity(intent);
        finish(); // Finish the current activity to remove it from the back stack
    }
}


