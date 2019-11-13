package com.elvin.simpleinterest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.elvin.simpleinterest.R;
import com.elvin.simpleinterest.model.Arithmetic;

public class PalindromeNumberActivity extends AppCompatActivity {

    EditText etPalindromeNumber;
    Button btnCheckPalindrome;
    TextView tvPalindromeResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome_number);

        bindControls();
        configureListeners();
    }

    private void bindControls() {
        this.etPalindromeNumber = findViewById(R.id.etPalindromeNumber);
        this.btnCheckPalindrome = findViewById(R.id.btnCheckPalindrome);
        this.tvPalindromeResult = findViewById(R.id.tvPalindromeResult);
    }

    private void configureListeners() {
        this.btnCheckPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etPalindromeNumber.getText())) {
                    etPalindromeNumber.setError("Input is empty!!!");
                    return;
                }
                int radius;
                try {
                    radius = Integer.parseInt(etPalindromeNumber.getText().toString());
                } catch (Exception e) {
                    etPalindromeNumber.setError("Enter valid input");
                    return;
                }
                tvPalindromeResult.setText(String.valueOf(Arithmetic.palindromeNumber(radius)));
            }
        });
    }
}
