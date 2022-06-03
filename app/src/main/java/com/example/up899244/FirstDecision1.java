package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.up899244.storage.StoredItem1;

public class FirstDecision1 extends AppCompatActivity {

    private Button button;

    private Button button1;

    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_decision1);

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
        Intent intent = new Intent(this, Food1.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(this, Shelter1.class);
        StoredItem1.setTrueForBamboo();
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Cargo1.class);
        StoredItem1.setTrue();
        startActivity(intent);
    }



    public boolean getValue() {
        return StoredItem1.getValue();
    }

    public boolean getValueForCave() {
        return StoredItem1.getValueForCave();
    }

    public boolean getValueForFood() {
        return StoredItem1.getValueForCave();
    }

    public boolean getValueForBamboo() {
        return StoredItem1.getValueForBamboo();
    }

    public boolean getValueForClothes() {
        return StoredItem1.getValueForClothes();
    }
}
