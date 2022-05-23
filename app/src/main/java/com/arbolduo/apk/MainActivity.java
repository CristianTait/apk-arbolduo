package com.arbolduo.apk;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends  AppCompatActivity  {


    Button btn_link, btn_link_somostierra, btn_certificacion, btn_link_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_link_web = findViewById(R.id.btn_link_web);
        btn_link = findViewById(R.id._btn_link);
        btn_link_somostierra = findViewById(R.id.btn_link_somostierra);
        btn_certificacion= findViewById(R.id.btn_certificacion);

        btn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_link.setBackgroundColor(Color.BLUE);
                gotoUrl("https://arbolduo.com");
            }
        });

        btn_link_somostierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               btn_link_somostierra.setBackgroundColor(Color.BLUE);
                gotoUrl("https://arbolduo.com/somos-tierra");
            }
        });

        btn_certificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_certificacion.setBackgroundColor(Color.BLUE);
                gotoUrl("https://arbolduo.com/certificacion");
           }
        });

        btn_link_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityWeb();
            }
        });


    }

    public void openActivityWeb(){
        Intent intent = new Intent(this, WebViewHome.class);
        startActivity(intent);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}