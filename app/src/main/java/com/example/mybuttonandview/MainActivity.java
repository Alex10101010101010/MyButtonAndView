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

    private String input;
    private String answer;

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
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);
        plusButton = findViewById(R.id.plus_button);
        minusButton = findViewById(R.id.minus_button);
        percentButton = findViewById(R.id.percent_button);
        pointButton = findViewById(R.id.point_button);
        equallyButton = findViewById(R.id.equally_button);

        nineButton = findViewById(R.id.nine_button);
        eightButton = findViewById(R.id.eight_button);
        sevenButton = findViewById(R.id.seven_button);
        sixButton = findViewById(R.id.six_button);
        fiveButton = findViewById(R.id.five_button);
        fourButton = findViewById(R.id.four_button);
        threeButton = findViewById(R.id.three_button);
        twoButton = findViewById(R.id.two_button);
        oneButton = findViewById(R.id.one_button);
        zeroButton = findViewById(R.id.zero_button);
    }

    public void ClickButton(View view) {
        final Button BUTTON;
        final String DATA;
        BUTTON = (Button) view;
        DATA = BUTTON.getText().toString();
        switch (DATA) {
            case "C":
                input = "";
                break;
            case "A":
                input += answer;
                break;
            case "*":
                Solve();
                input += "*";
                break;
            case "=":
                Solve();
                answer += input;
                break;
            case "%":
                Solve();
                input += "%";
                break;
            case "del":
                String newText;
                if (input != null) {
                    newText = input.substring(0, input.length() - 1);
                } else {
                    newText = "";
                }
                input = newText;
                break;
//            case "+":
//                Solve();
//                input += "+";
//                break;
//            case "-":
//                Solve();
//                input += "-";
//                break;
//            case "/":
//                Solve();
//                input += "/";
//                break;
            default:
                if (input == null) {
                    input = "";
                }
                if (DATA.equals("+") || DATA.equals("-") || DATA.equals("÷")) {
                    Solve();
                }
                input += DATA;
        }
        screenTv.setText(input);
    }

    private void Solve() {
        if (input.split("\\*").length == 2) {
            String numder[] = input.split("\\*");
            try {
                double multiply = Double.parseDouble(numder[0]) * Double.parseDouble(numder[1]);
                input = multiply + "";
            } catch (Exception e) {
            }
        }

        if (input.split(getString(R.string.divide)).length == 2) {
            String numder[] = input.split(getString(R.string.divide));
            try {
                double divide = Double.parseDouble(numder[0]) / Double.parseDouble(numder[1]);
                input = divide + "";
            } catch (Exception e) {
            }
        }

        if (input.split("%").length == 2) {
            String numder[] = input.split("%");
            try {
                double percent = Double.parseDouble(numder[0]) / 100;
                input = percent + "";
            } catch (Exception e) {
            }
        }

        if (input.split("\\+").length == 2) {
            String numder[] = input.split("\\+");
            try {
                double plus = Double.parseDouble(numder[0]) + Double.parseDouble(numder[1]);
                input = plus + "";
            } catch (Exception e) {
            }
        }

        if (input.split("-").length > 1) {
            String numder[] = input.split("-");
            if (numder[0] == "" && numder.length == 2) {
                numder[0] = 0 + "";
            }
            try {
                double minus = 0;
                if (numder.length == 2) {
                    minus = Double.parseDouble(numder[0]) - Double.parseDouble(numder[1]);
                } else if (numder.length == 3) {
                    minus = -Double.parseDouble(numder[1]) - Double.parseDouble(numder[2]);
                }
                input = minus + "";
            } catch (Exception e) {
            }
        }
//разделитель целого числа. что бы можно было поставить запятую после целого числа
        String n[] = input.split(".");
        if (n.length > 1) {
            if (n[1].equals("0")) {
                input = n[0];
            }
        }
        screenTv.setText(input);
    }

    public void percentEvent(View view) {
        try {
            double percent = Double.parseDouble(screenTv.getText().toString()) / 100;
//            double percent = Double.parseDouble(Screen.getText().toString()) - ((Double.parseDouble(Screen.getText().toString()) / 100)*10);
            screenTv.setText(percent + "");
        } catch (Exception e) {
        }
    }
}