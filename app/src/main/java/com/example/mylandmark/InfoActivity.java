package com.example.mylandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {

    ImageView img_info;
    TextView txt_info;
    int imgno = 0;
    int imgs[] = {R.drawable.info1,R.drawable.info2,R.drawable.info3,R.drawable.info4,R.drawable.info5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        img_info = findViewById(img_info);
    }
}