package com.example.baitap_chuyenactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;          // ⬅️ đừng quên import View
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        tvPhone = findViewById(R.id.tvPhoneNumber);
        ImageView settingIcon = findViewById(R.id.imageViewSetting);

        settingIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về màn hình Login
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Nhận dữ liệu từ Login
        String phone = getIntent().getStringExtra("PHONE_NUMBER");
        if (phone != null) {
            tvPhone.setText(phone);
        }
    }
}
