package com.elvin.simpleinterest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.elvin.simpleinterest.R;
import com.elvin.simpleinterest.model.Arithmetic;

public class SwapNumberActivity extends AppCompatActivity {

    EditText etSwapFirst;
    EditText etSwapSecond;
    Button btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap_number);

        bindControls();
        configureListeners();
    }

    private void bindControls() {
        this.etSwapFirst = findViewById(R.id.etSwapFirst);
        this.etSwapSecond = findViewById(R.id.etSwapSecond);
        this.btnSwap = findViewById(R.id.btnSwap);
    }

    private void configureListeners() {
        this.btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etSwapFirst.getText())) {
                    etSwapFirst.setError("Input is empty!!!");
                    return;
                } else if (TextUtils.isEmpty(etSwapSecond.getText())) {
                    etSwapSecond.setError("Input is empty!!!");
                    return;
                }
                int num1, num2;
                try {
                    num1 = Integer.parseInt(etSwapFirst.getText().toString());
                } catch (Exception e) {
                    etSwapFirst.setError("Enter valid input");
                    return;
                }
                try {
                    num2 = Integer.parseInt(etSwapSecond.getText().toString());
                } catch (Exception e) {
                    etSwapSecond.setError("Enter valid input");
                    return;
                }
                int[] swapped = Arithmetic.swapNumber(num1, num2);
                etSwapFirst.setText(String.valueOf(swapped[0]));
                etSwapSecond.setText(String.valueOf(swapped[1]));
            }
        });
    }
}
