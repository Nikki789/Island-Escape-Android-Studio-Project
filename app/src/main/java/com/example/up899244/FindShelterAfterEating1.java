package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.up899244.storage.StoredItem1;

public class FindShelterAfterEating1 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_shelter_after_eating1);

        button = (Button) findViewById(R.id.button);
        if(StoredItem1.getValueForFood()==true){
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity();
                }
            });
        }
        else{
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity1();
                }
            });
        }

    }

    public void openActivity() {
        Intent intent = new Intent(this,EatTheFruitBadResult.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(this, BoilTheWater.class);
        startActivity(intent);
    }
}
