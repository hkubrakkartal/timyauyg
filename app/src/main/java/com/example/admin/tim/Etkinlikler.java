package com.example.admin.tim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Etkinlikler extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlikler);
        btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3=(Button)findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5=(Button)findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        btn6=(Button)findViewById(R.id.button6);
        btn6.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent=new Intent(Etkinlikler.this, Etkinlik_icerik.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2=new Intent(Etkinlikler.this, Etkinlik_icerik2.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3=new Intent(Etkinlikler.this, Etkinlik_icerik3.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4=new Intent(Etkinlikler.this, Etkinlik_icerik4.class);
                startActivity(intent4);
                break;

            case R.id.button5:
                Intent intent5=new Intent(Etkinlikler.this, Etkinlik_icerik5.class);
                startActivity(intent5);
                break;

            case R.id.button6:
                Intent intent6=new Intent(Etkinlikler.this, Etkinlik_icerik6.class);
                startActivity(intent6);
                break;


        }

    }
}
