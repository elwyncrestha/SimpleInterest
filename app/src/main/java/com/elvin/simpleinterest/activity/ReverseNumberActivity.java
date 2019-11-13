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

public class ReverseNumberActivity extends AppCompatActivity {

    EditText etReversingNumber;
    Button btnReverse;
    TextView tvReversedNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_number);

        bindControls();
        configureListeners();
    }

    private void bindControls() {
        this.etReversingNumber = findViewById(R.id.etReversingNumber);
        this.btnReverse = findViewById(R.id.btnReverse);
        this.tvReversedNumber = findViewById(R.id.tvReversedNumber);
    }

    private void configureListeners() {
        this.btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etReversingNumber.getText())) {
                    etReversingNumber.setError("Input is empty!!!");
                    return;
                }
                int num;
                try {
                    num = Integer.parseInt(etReversingNumber.getText().toString());
                } catch (Exception e) {
                    etReversingNumber.setError("Enter valid input");
                    return;
                }
                tvReversedNumber.setText(String.valueOf(Arithmetic.reverseNumber(num)));
            }
        });
    }
}
