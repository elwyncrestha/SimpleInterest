package com.elvin.simpleinterest;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etPrincipal;
    EditText etTime;
    EditText etRate;
    Button btnCalculate;
    TextView tvSimpleInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindControls();
        configureListeners();
    }

    private void bindControls() {
        this.etPrincipal = findViewById(R.id.etPrincipal);
        this.etTime = findViewById(R.id.etTime);
        this.etRate = findViewById(R.id.etRate);
        this.btnCalculate = findViewById(R.id.btnCalculate);
        this.tvSimpleInterest = findViewById(R.id.tvSimpleInterest);
    }

    private void configureListeners() {
        this.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etPrincipal.getText())) {
                    etPrincipal.setError("Principal is empty");
                    return;
                }
                if (TextUtils.isEmpty(etTime.getText())) {
                    etPrincipal.setError("Time is empty");
                    return;
                }
                if (TextUtils.isEmpty(etRate.getText())) {
                    etPrincipal.setError("Rate is empty");
                    return;
                }

                float principal, time, rate, SI;
                principal = time = rate = SI = 0.0f;
                try {
                    principal = Float.parseFloat(etPrincipal.getText().toString());
                } catch (Exception e) {
                    etPrincipal.setError("Enter valid principal");
                    return;
                }
                try {
                    time = Float.parseFloat(etTime.getText().toString());
                } catch (Exception e) {
                    etPrincipal.setError("Enter valid time");
                    return;
                }
                try {
                    rate = Float.parseFloat(etRate.getText().toString());
                } catch (Exception e) {
                    etRate.setError("Enter valid rate");
                    return;
                }
                SI = (principal * time * rate) / 100;
                tvSimpleInterest.setText(String.valueOf(SI));
            }
        });
    }
}
