package com.example.formulaire;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText et_username, et_password;
    Button btn_login;
    Text recup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    @SuppressLint("WrongViewCast")
    private void login() {
        et_username = (EditText)findViewById(R.id.et_username);
        et_password = (EditText)findViewById(R.id.et_password);
        btn_login = (Button)findViewById(R.id.btn_login);
        String login="";

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_username.getText().toString().equals("admin") && et_password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Username et Password correct", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),user.class);
                    finish();
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Username ou Password incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}