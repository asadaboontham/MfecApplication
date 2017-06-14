package com.example.asadaboomtham.mfecapplication;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SigupActivity extends AppCompatActivity {
    private EditText name;
    private EditText surname;
    private EditText mail;
    private EditText tel;
    private Button sigup;
    private String mailForRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigup);
        getValue();
        initView();
        mail.setText(mailForRegister);
    }

    private void initView() {
        name = (EditText) findViewById(R.id.et_name);
        surname = (EditText) findViewById(R.id.et_surname);
        mail = (EditText) findViewById(R.id.et_mail);
        tel = (EditText) findViewById(R.id.et_tel);
        sigup = (Button) findViewById(R.id.btn_sigup);


    }

    private void getValue() {
        mailForRegister = getIntent().getStringExtra("mail");
    }
}
