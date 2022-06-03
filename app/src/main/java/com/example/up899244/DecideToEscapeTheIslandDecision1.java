package com.example.up899244;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.up899244.storage.StoredItem1;

public class DecideToEscapeTheIslandDecision1 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decide_to_escape_the_island_decision1);

        button = (Button) findViewById(R.id.button);
        if(StoredItem1.getValueForClothes() == true && StoredItem1.getValueForBamboo()==true){
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
        Intent intent = new Intent(this, EndingWithRaft.class);
        startActivity(intent);
    }

    public void openActivity1() {
        Intent intent = new Intent(this,EndingWithoutRaft.class);
        startActivity(intent);
    }
}
