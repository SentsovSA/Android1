package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewName;
    private EditText editText;
    private Button button;
    private View calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initEditText();
        initButton();
    }

    private void initViews() {
        textViewName = findViewById(R.id.textViewName);
        calendarView = findViewById(R.id.calendarView);
    }

    private void initEditText(){
        editText = findViewById(R.id.editText);
    }

    private void initButton(){
        button = findViewById(R.id.button);
    }

    public void changeLayout(View view) {
        setContentView(R.layout.input_type_test);
    }

    public void changeLayoutBack(View view) {
        setContentView(R.layout.activity_main);
    }
}