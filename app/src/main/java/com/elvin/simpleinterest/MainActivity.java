package com.elvin.simpleinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.elvin.simpleinterest.activity.SimpleInterestActivity;

public class MainActivity extends AppCompatActivity {

    Button btnSimpleInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindControl();
        configureListeners();
    }

    private void bindControl() {
        this.btnSimpleInterest = findViewById(R.id.btnSimpleInterest);
    }

    private void configureListeners() {
        this.btnSimpleInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleInterestActivity.class);
                startActivity(intent);
            }
        });
    }
}
