package com.example.mybuttonandview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button left;
    Button rite;
    Button up;
    Button down;
    ImageView mario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left = findViewById(R.id.left);
        rite = findViewById(R.id.rite);
        up = findViewById(R.id.up);
        down = findViewById(R.id.down);
        mario = findViewById(R.id.mario);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == rite.getId()) {
                    mario.setX(mario.getX() + 10);
                }
                if (v.getId() == left.getId()) {
                    mario.setRotationY(180);
                    mario.setX(mario.getX() - 10);
                }
                if (v.getId() == up.getId()) {
                    mario.animate().rotation(-90);
                    mario.setY(mario.getY() - 10);
                }
                if (v.getId() == down.getId()) {
                    mario.animate().rotation(90);
                    mario.setY(mario.getY() + 10);
                }
            }
        };
        rite.setOnClickListener(listener);
        left.setOnClickListener(listener);
        up.setOnClickListener(listener);
        down.setOnClickListener(listener);

    }

}