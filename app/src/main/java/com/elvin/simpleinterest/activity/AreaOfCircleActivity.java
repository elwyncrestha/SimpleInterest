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

public class AreaOfCircleActivity extends AppCompatActivity {

    EditText etRadius;
    Button btnCalculateArea;
    TextView tvArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_of_circle);

        bindControls();
        configureListeners();
    }

    private void bindControls() {
        this.etRadius = findViewById(R.id.etRadius);
        this.btnCalculateArea = findViewById(R.id.btnCalculateArea);
        this.tvArea = findViewById(R.id.tvArea);
    }

    private void configureListeners() {
        this.btnCalculateArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etRadius.getText())) {
                    etRadius.setError("Radius is empty!!!");
                    return;
                }
                float radius;
                try {
                    radius = Float.parseFloat(etRadius.getText().toString());
                } catch (Exception e) {
                    etRadius.setError("Enter valid radius");
                    return;
                }
                tvArea.setText(String.valueOf(Arithmetic.areaOfCircle(radius)));
            }
        });
    }
}
