package com.example.gohasu.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random;

    

    public void generateRandomNumber() {

        Random r = new Random();

        random = r.nextInt(19) +1;

    }

    public void guessNumber (View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        int guessValue = Integer.parseInt(editText.getText().toString());

        Log.i("Entered value", editText.getText().toString());

        Log.i("Info", "Button pressed: " + random );


        if (guessValue < random) {
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        } else if (guessValue > random) {
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Correct. Try again!", Toast.LENGTH_SHORT).show();
            generateRandomNumber();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}
