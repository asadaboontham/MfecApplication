package com.example.asadaboomtham.mfecapplication;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.asadaboomtham.mfecapplication.R.id.et_mail;

public class MainActivity extends AppCompatActivity {
    private EditText mail;
    private EditText pass;
    private Button login;
    private Button sigup;
    private TextView notiMessage;
    private final String mailUser = "admin@gmail.com";
    private final String passworduser = "12345";

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //การเรียกใช้ layout
        initView();
        login.setOnClickListener(onLoginClickListener);
        sigup.setOnClickListener(onSigupClickListener);
    }

    private boolean checkUser(String id, String pass) {
        if (mailUser.equals(id) && passworduser.equals(pass)) {
            return true;
        } else
            return false;
    }

    private View.OnClickListener onSigupClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                navigateToSigup();
        }
    };
    private View.OnClickListener onLoginClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (mail.getText().toString().contains("gmail.com")) {
                boolean status = checkUser(mail.getText().toString(), pass.getText().toString());
                if (status) {
                    navigateToPage2();
                } else {
                    navigateToSigup();
                }
            } else {
                notiMessage.setText("Please input gmail");
            }
        }
    };

    private void navigateToSigup() {
        Intent intent = new Intent(MainActivity.this, SigupActivity.class);
        intent.putExtra("mailRegister", mail.getText().toString());
        startActivity(intent);

    }

    private void navigateToPage2() {
        Intent intent = new Intent(MainActivity.this, IActivity.class);
       // intent.putExtra("mailRegister",mail.getText().toString());
        startActivity(intent);
    }

    private void initView() {
        mail = (EditText) findViewById(R.id.et_mail);
        pass = (EditText) findViewById(R.id.et_pass);
        login = (Button) findViewById(R.id.btn_login);
        sigup = (Button) findViewById(R.id.btn_sigup);
        notiMessage = (TextView) findViewById(R.id.noti_Message);

    }

}



