package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.up899244.storage.StoredItem1;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Introduction.class);
        StoredItem1.setFalseForBamboo();
        StoredItem1.setFalseForBambooMade();
        StoredItem1.setFalseForCave();
        StoredItem1.setFalseForClothes();
        StoredItem1.setFalseForFood();
        StoredItem1.setFalseForPaddles();
        StoredItem1.setFalseForSails();
        StoredItem1.setTrueForWater();
        StoredItem1.setTrueForRealFood();
        startActivity(intent);
    }


}
