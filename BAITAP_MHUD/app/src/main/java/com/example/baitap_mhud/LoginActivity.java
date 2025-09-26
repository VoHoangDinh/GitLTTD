package com.example.baitap_mhud;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // TextView này trong giao diện login.xml
        TextView tvRegister = findViewById(R.id.tvRegister);

        // Khi bấm "Đăng ký ngay" thì mở sang MainActivity (đăng ký)
        tvRegister.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
