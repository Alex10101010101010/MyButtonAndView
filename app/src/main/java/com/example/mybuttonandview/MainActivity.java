package com.example.mybuttonandview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView screenTv;

    private Button resetButton;
    private Button deleteButton;
    private Button multiplyButton;
    private Button divideButton;
    private Button plusButton;
    private Button minusButton;
    private Button percentButton;
    private Button pointButton;
    private Button equallyButton;

    private Button nineButton;
    private Button eightButton;
    private Button sevenButton;
    private Button sixButton;
    private Button fiveButton;
    private Button fourButton;
    private Button threeButton;
    private Button twoButton;
    private Button oneButton;
    private Button zeroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_all);

        init();
    }

    private void init() {
        screenTv = findViewById(R.id.screen_text_view);

        resetButton = findViewById(R.id.reset_button);
        deleteButton = findViewById(R.id.del_character_button);
    }

    public void ClickButton(View view) {

    }
}