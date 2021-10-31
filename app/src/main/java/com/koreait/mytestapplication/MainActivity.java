package com.koreait.mytestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clkBtn(View v) {
        EditText editText = (EditText) findViewById(R.id.et);
        String str = editText.getText().toString();

        switch (v.getId()) {
            case R.id.btn_0:
                str += "0";
                editText.setText(str);
                break;

            case R.id.btn_1:
                str += "1";
                editText.setText(str);
                break;

            case R.id.btn_2:
                str += "2";
                editText.setText(str);
                break;

            case R.id.btn_3:
                str += "3";
                editText.setText(str);
                break;

            case R.id.btn_4:
                str += "4";
                editText.setText(str);
                break;

            case R.id.btn_5:
                str += "5";
                editText.setText(str);
                break;

            case R.id.btn_6:
                str += "6";
                editText.setText(str);
                break;

            case R.id.btn_7:
                str += "7";
                editText.setText(str);
                break;

            case R.id.btn_8:
                str += "8";
                editText.setText(str);
                break;

            case R.id.btn_9:
                str += "9";
                editText.setText(str);
                break;

            case R.id.btn_cancel:
                str += "AC";
                editText.setText(str);
                break;

            case R.id.btn_percent:
                str += "%";
                editText.setText(str);
                break;

            case R.id.btn_divide:
                str += "/";
                editText.setText(str);
                break;

            case R.id.btn_multiply:
                str += "X";
                editText.setText(str);
                break;

            case R.id.btn_subtract:
                str += "1";
                editText.setText(str);
                break;

            case R.id.btn_add:
                str += "1";
                editText.setText(str);
                break;

            case R.id.btn_equal:
                str += "=";
                editText.setText(str);
                break;
        }

    }

}




