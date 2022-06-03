package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KeepLookingForWaterThirdWithTwo extends AppCompatActivity {

    private Button button;

    private Button button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_looking_for_water1);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity() {
        Intent intent = new Intent(this, FindShelterAfterEating1.class);
        startActivity(intent);
    }


    public void openActivity2() {
        Intent intent = new Intent(this, MakeACampfireResult1.class);
        startActivity(intent);
    }


}
