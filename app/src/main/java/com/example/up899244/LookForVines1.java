package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LookForVines1 extends AppCompatActivity {

    private Button button;

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_for_vines1);

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
        Intent intent = new Intent(this, PlayDead1.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(this, RunForYourLife1.class);
        startActivity(intent);
    }
}
