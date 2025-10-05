package com.example.baitap_chuyenactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText edtPhone, edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);  // file login.xml của bạn

        edtPhone = findViewById(R.id.editTextText5);
        edtPassword = findViewById(R.id.editTextText6);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = edtPhone.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (phone.isEmpty() || password.isEmpty()) {
                    edtPhone.setError("Nhập đầy đủ thông tin!");
                    return;
                }

                // 👉 Tạo Intent sang ProfileActivity
                Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                intent.putExtra("PHONE_NUMBER", phone);
                startActivity(intent);
            }
        });
    }
}
