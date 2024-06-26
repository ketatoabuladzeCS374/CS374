package com.example.midtermketevanabuladze;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView headerTextView;
    private Button conversionButton;
    private Button contactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        headerTextView = findViewById(R.id.header);
        conversionButton = findViewById(R.id.ButtonConversion);
        contactButton = findViewById(R.id.ButtonContact);

        // Set a click listener on the conversion button
        conversionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click to start the ConversionActivity
                startConversionActivity();
            }
        });

        // Set a click listener on the contact button
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click to start the ContactActivity
                startContactActivity();
            }
        });
    }
    private void convertLitersToGallons() {
        // Get the value from the EditText and convert it to double
        String litersStr = litersEditText.getText().toString();
        double liters = Double.parseDouble(litersStr);

        // Perform the conversion
        double gallons = liters * 0.264172;

        // Display the result
        resultTextView.setText(String.format("%.2f liters = %.2f gallons", liters, gallons));
    }

    // Method to start the ConversionActivity
    private void startConversionActivity() {
        Intent intent = new Intent(MainActivity.this, ConversionActivity.class);
        startActivity(intent);
    }

    // Method to start the ContactActivity
    private void startContactActivity() {
        Intent intent = new Intent(MainActivity.this, ContactActivity.class);
        startActivity(intent);
    }
}
