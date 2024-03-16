package com.example.midtermanirudhpadma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText meterInput;
    private TextView millimeterOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        meterInput = findViewById(R.id.meter_input);
        millimeterOutput = findViewById(R.id.millimeter_output);

        // Set click listener for the convert button
        Button convertButton = findViewById(R.id.convert_button);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input value from the EditText
                String inputText = meterInput.getText().toString();
                if (inputText.isEmpty()) {
                    // Show an error message if the input is empty
                    millimeterOutput.setText("Please enter a value");
                    return;
                }

                // Convert meters to millimeters
                double meters = Double.parseDouble(inputText);
                double millimeters = meters * 1000;

                // Display the result
                millimeterOutput.setText("Millimeters: " + millimeters);
            }
        });
    }
}