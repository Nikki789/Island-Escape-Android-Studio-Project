package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.up899244.storage.StoredItem1;

public class EndingWithRaft extends AppCompatActivity {

    private Button button;

    private Button button1;

    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending_with_raft);

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

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity() {
        Intent intent = new Intent(this, MakeARaft.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(this, MakeTheSOSSign.class);
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MakeABigFire.class);
        startActivity(intent);
    }
}