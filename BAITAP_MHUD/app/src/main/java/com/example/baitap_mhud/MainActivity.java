package com.example.baitap_mhud;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextView "Đăng nhập ngay"
        TextView tvLogin = findViewById(R.id.tvLogin);
        tvLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // đóng màn hình đăng ký, tránh quay lại
        });

        // Button "Tạo tài khoản"
        Button btnRegister = findViewById(R.id.btn_Register);
        btnRegister.setOnClickListener(v -> {
            // Sau khi tạo tài khoản thì chuyển sang LoginActivity
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
