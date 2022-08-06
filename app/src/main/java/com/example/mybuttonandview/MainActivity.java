package com.example.mybuttonandview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView startIv;
    private ImageView androshaIv;
    private ImageView colossusIv;
    private ImageView handingGardensSemramsIv;
    private ImageView lighthouseAlexandriaIv;
    private ImageView mausoleumHalicornassusIv;
    private ImageView pyramidCheopsIv;
    private ImageView statueZeusOlympiaIv;
    private ImageView templeArtemisEphesusIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();

        onClickButton();
    }

    private void onClickButton() {
        boolean isStart = true;
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isStart) {
                    colossusIv.setVisibility(View.VISIBLE);
                    startIv.setVisibility(View.INVISIBLE);

                } else {
                    handingGardensSemramsIv.setVisibility(View.INVISIBLE);
                    lighthouseAlexandriaIv.setVisibility(View.VISIBLE);

                }
            }
        };
        startIv.setOnClickListener(listener);
        colossusIv.setOnClickListener(listener);

    }

    private void intView(){
        startIv = findViewById(R.id.start_image_view);
        androshaIv = findViewById(R.id.image_view2);
        colossusIv = findViewById(R.id.image_view3);
        handingGardensSemramsIv = findViewById(R.id.image_view4);
        lighthouseAlexandriaIv = findViewById(R.id.image_view5);
        mausoleumHalicornassusIv = findViewById(R.id.image_view6);
        pyramidCheopsIv = findViewById(R.id.image_view7);
        templeArtemisEphesusIv = findViewById(R.id.image_view8);
        statueZeusOlympiaIv = findViewById(R.id.image_view9);
    }
}