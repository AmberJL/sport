package com.example.sport.activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.sport.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.TreeMap;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button login_go;
    TextView sign_up;
    TextView forget_pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TreeMap m = new TreeMap();
    }
    public void initView() {
        login_go = findViewById(R.id.login_go);
        sign_up = findViewById(R.id.login_go_sign_up);
        forget_pwd = findViewById(R.id.login_go_revise_password);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_go:
                break;
            case R.id.login_go_revise_password:
                break;
            case R.id.login_go_sign_up:
                break;

        }
    }
}