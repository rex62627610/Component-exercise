package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int Total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runLogin(View view) {
        TextView conterview = (TextView) findViewById(R.id.button4);
        conterview.setText("logout");

        //public void runLogin(View view) {
        //  TextView conterview = findViewById(R.id.conter);
        //conterview.setText("" + Total);
        //   Total++;

    }
}