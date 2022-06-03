package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.up899244.storage.StoredItem1;

public class Paddles extends AppCompatActivity {

    private Button button;

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paddles);

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
        Intent intent = new Intent(this, RaftDone.class);
        StoredItem1.setTrueForPaddles();
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(this, RaftDone.class);
        startActivity(intent);
    }
}
