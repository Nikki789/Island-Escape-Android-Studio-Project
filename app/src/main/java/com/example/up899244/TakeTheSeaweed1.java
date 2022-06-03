package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TakeTheSeaweed1 extends AppCompatActivity {

    private Button button;

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_the_seaweed1);

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
                openActivity1();
            }
        });
    }


    public void openActivity() {
        Intent intent = new Intent(this, FightTheShark1.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(this, SwimAsFastAsYouCan1.class);
        startActivity(intent);
    }
}