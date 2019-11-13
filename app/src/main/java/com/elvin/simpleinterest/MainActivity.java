package com.elvin.simpleinterest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.elvin.simpleinterest.activity.AreaOfCircleActivity;
import com.elvin.simpleinterest.activity.PalindromeNumberActivity;
import com.elvin.simpleinterest.activity.ReverseNumberActivity;
import com.elvin.simpleinterest.activity.SimpleInterestActivity;
import com.elvin.simpleinterest.activity.SwapNumberActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnShowSimpleInterest;
    Button btnShowAreaOfCircle;
    Button btnShowPalindrome;
    Button btnShowReverseNumber;
    Button btnShowSwapNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindControl();
    }

    private void bindControl() {
        this.btnShowSimpleInterest = findViewById(R.id.btnShowSimpleInterest);
        this.btnShowAreaOfCircle = findViewById(R.id.btnShowAreaOfCircle);
        this.btnShowPalindrome = findViewById(R.id.btnShowPalindrome);
        this.btnShowReverseNumber = findViewById(R.id.btnShowReverseNumber);
        this.btnShowSwapNumber = findViewById(R.id.btnShowSwapNumber);

        this.btnShowSimpleInterest.setOnClickListener(this);
        this.btnShowAreaOfCircle.setOnClickListener(this);
        this.btnShowPalindrome.setOnClickListener(this);
        this.btnShowReverseNumber.setOnClickListener(this);
        this.btnShowSwapNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnShowSimpleInterest:
                intent = new Intent(MainActivity.this, SimpleInterestActivity.class);
                break;
            case R.id.btnShowAreaOfCircle:
                intent = new Intent(MainActivity.this, AreaOfCircleActivity.class);
                break;
            case R.id.btnShowPalindrome:
                intent = new Intent(MainActivity.this, PalindromeNumberActivity.class);
                break;
            case R.id.btnShowReverseNumber:
                intent = new Intent(MainActivity.this, ReverseNumberActivity.class);
                break;
            case R.id.btnShowSwapNumber:
                intent = new Intent(MainActivity.this, SwapNumberActivity.class);
                break;
            default:
                throw new IllegalArgumentException();
        }
        startActivity(intent);
    }
}
