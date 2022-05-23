package com.example.mylandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //멤버 변수 선언
    EditText userid, password;
    Button btn_login, btn_info, btn_guide, btn_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userid = findViewById(R.id.userid);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);
        btn_info = findViewById(R.id.btn_info);
        btn_guide = findViewById(R.id.btn_guide);
        btn_call = findViewById(R.id.btn_call);


        btn_guide.setOnClickListener(this);
        btn_info.setOnClickListener(this);
        btn_call.setOnClickListener(this);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_id = userid.getText().toString();
                String str_pw = password.getText().toString();
                Toast.makeText(MainActivity.this, str_id, Toast.LENGTH_SHORT).show();
                Log.d("TEST", str_id);
                Log.d("TEST", str_pw);
                if (str_id.length() < 5 || str_pw.length() < 8) {
                    Toast.makeText(MainActivity.this, "아이디와 비밀번호의 길이를 확인하세요", Toast.LENGTH_SHORT).show();
                } else {
                    if (str_id.equals("30407") && str_pw.equals(12345678)) {
                        Toast.makeText(MainActivity.this, "환영합니다", Toast.LENGTH_SHORT);
                    } else {
                        Toast.makeText(MainActivity.this, "아이디와 비번 확인 부탁", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_info:
                intent = new Intent(MainActivity.this, InfoActivity);
                break;
            case R.id.btn_guide:
                intent = new Intent(MainActivity.this, GuideActivity);
                break;
            case R.id.btn_call:
                intent = new Intent(MainActivity.this, CallActivity);
                break;
        }
        Intent
    }
}