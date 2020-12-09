package com.example.color_seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.divyanshu.colorseekbar.ColorSeekBar;

public class MainActivity extends AppCompatActivity {

    // Initialize Variable.
    View view;
    ColorSeekBar colorSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning the Variables.
        view = findViewById(R.id.view);
        colorSeekBar = findViewById(R.id.color_seekBar);

        colorSeekBar.setOnColorChangeListener(new ColorSeekBar.OnColorChangeListener(){
            @Override
            public void onColorChangeListener(int i) {
                view.setBackgroundColor(i);
            }
        });
    }
}