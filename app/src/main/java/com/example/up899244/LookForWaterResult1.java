package com.example.up899244;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.up899244.storage.StoredItem1;

import androidx.appcompat.app.AppCompatActivity;

public class LookForWaterResult1 extends AppCompatActivity {

    private Button button2;

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_for_water_result1);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity1();
                }
            });


        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }




    public void openActivity1() {
        Intent intent = new Intent(this, KeepLookingForWaterNextButton.class);
        StoredItem1.setTrueForWater();
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent = new Intent(this, MakeACampfireResult1.class);
        startActivity(intent);
    }

}
