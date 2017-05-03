package com.example.admin.tim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Etkinlik_icerik extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlik_icerik);
        btn1=(Button)findViewById(R.id.androidBtn);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
