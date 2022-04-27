package com.example.formulaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class user extends AppCompatActivity {
    private TextView recup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        recup=(TextView)findViewById(R.id.textView2);
        Intent intent=getIntent();
        recup.setText(intent.getStringExtra("login"));
    }
}