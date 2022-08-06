package com.example.mybuttonandview;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

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
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == startIv.getId()) {
                    colossusIv.setVisibility(View.VISIBLE);
                    startIv.setVisibility(View.INVISIBLE);
                } else if (v.getId() == colossusIv.getId()) {
                    colossusIv.setVisibility(View.INVISIBLE);
                    handingGardensSemramsIv.setVisibility(View.VISIBLE);
                } else if (v.getId() == handingGardensSemramsIv.getId()) {
                    handingGardensSemramsIv.setVisibility(View.INVISIBLE);
                    lighthouseAlexandriaIv.setVisibility(View.VISIBLE);
                } else if (v.getId() == lighthouseAlexandriaIv.getId()) {
                    lighthouseAlexandriaIv.setVisibility(View.INVISIBLE);
                    mausoleumHalicornassusIv.setVisibility(View.VISIBLE);
                } else if (v.getId() == mausoleumHalicornassusIv.getId()) {
                    mausoleumHalicornassusIv.setVisibility(View.INVISIBLE);
                    pyramidCheopsIv.setVisibility(View.VISIBLE);
                } else if (v.getId() == pyramidCheopsIv.getId()) {
                    pyramidCheopsIv.setVisibility(View.INVISIBLE);
                    statueZeusOlympiaIv.setVisibility(View.VISIBLE);
                } else if (v.getId() == statueZeusOlympiaIv.getId()) {
                    statueZeusOlympiaIv.setVisibility(View.INVISIBLE);
                    templeArtemisEphesusIv.setVisibility(View.VISIBLE);
                } else if (v.getId() == templeArtemisEphesusIv.getId()) {
                    templeArtemisEphesusIv.setVisibility(View.INVISIBLE);
                    androshaIv.setVisibility(View.VISIBLE);
                } else {
                    androshaIv.setVisibility(View.INVISIBLE);
                }
            }
        };

        startIv.setOnClickListener(listener);
        androshaIv.setOnClickListener(listener);
        handingGardensSemramsIv.setOnClickListener(listener);
        lighthouseAlexandriaIv.setOnClickListener(listener);
        mausoleumHalicornassusIv.setOnClickListener(listener);
        pyramidCheopsIv.setOnClickListener(listener);
        statueZeusOlympiaIv.setOnClickListener(listener);
        templeArtemisEphesusIv.setOnClickListener(listener);
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