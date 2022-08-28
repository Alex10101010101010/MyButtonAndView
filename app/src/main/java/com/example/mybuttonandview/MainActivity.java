package com.example.mybuttonandview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private int hour;
    private int minute;

    private Button morningButton;
    private Button dayButton;
    private Button eveningButton;
    private Button nightButton;

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.main_image_view);
    }

    public void okToast(String text) {
        text = text + "\nСейчас " + withZero(this.hour) + ":" + withZero(this.minute) + ".";
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void wrongToast(String text) {
        text = text + "\nСейчас " + withZero(this.hour) + ":" + withZero(this.minute) + ".";
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void dayButtonClick(View view) {
        hour = Calendar.getInstance().getTime().getHours();
        minute = Calendar.getInstance().getTime().getMinutes();
        if (hour >= 11 && hour < 17) {
            okToast("УРА, сейчас день ! ПОРА ПОЛИТЬ РОЗУ !");
            image.setImageResource(R.drawable.day);
        } else {
            wrongToast("ЭЙ ! Да разве ж сейчас день?");
        }
    }

    public void eveningButtonClick(View view) {
        hour = Calendar.getInstance().getTime().getHours();
        minute = Calendar.getInstance().getTime().getMinutes();
        if (hour >= 17 && hour < 24) {
            okToast("Вечер пришел ! ПОРА ЗАКРЫВАТЬ РОЗУ !");
            image.setImageResource(R.drawable.evening);

        } else {
            wrongToast("Нет, сейчас еще не ночь !!!");
        }
    }

    public void nightButtonClick(View view) {
        hour = Calendar.getInstance().getTime().getHours();
        minute = Calendar.getInstance().getTime().getMinutes();
        if (hour >= 0 && hour < 6) {
            okToast("Наступила ночь ! ПОШЛИ СМОТРЕТЬ ЗВЕЗДЫ !");
            image.setImageResource(R.drawable.night);

        } else {
            wrongToast("Сейчас не ночь, ты ошибся");
        }
    }

    public void morningButtonClick(View view) {
        hour = Calendar.getInstance().getTime().getHours();
        minute = Calendar.getInstance().getTime().getMinutes();
        if (hour >= 6 && hour < 11) {
            okToast("УТРО ! ПОРА ПОЛОТЬ БАОБАБЫ !");
            image.setImageResource(R.drawable.morning);

        } else {
            wrongToast("ЭЙ ! СЕЙЧАС ДАЛЕКО НЕ УТРО !");
        }
    }

    private String withZero(int time) {
        String result;
        if (time < 10) {
            result = "0" + time;
        } else {
            result = String.valueOf(time);
        }
        return result;
    }
}
