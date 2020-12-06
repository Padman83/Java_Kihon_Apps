package com.example.version_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCode = findViewById(R.id.tv_code);
        tvName = findViewById(R.id.tv_name);

        tvCode.setText(String.valueOf(BuildConfig.VERSION_CODE));

        tvName.setText(String.valueOf(BuildConfig.VERSION_NAME));
    }
}