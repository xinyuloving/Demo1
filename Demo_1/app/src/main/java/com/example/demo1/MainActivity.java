package com.example.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo1.R;
import com.example.demo1.activity.NumericKeyboardActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mainNumerickeyboard;//数字键盘

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mainNumerickeyboard = (TextView) findViewById(R.id.main_numerickeyboard);

        mainNumerickeyboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_numerickeyboard://数字键盘
                Intent intent = new Intent(this, NumericKeyboardActivity.class);
                startActivity(intent);
                break;
        }
    }
}