package com.example.mike.bigone12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        a = (ImageView)findViewById(R.id.img99);
        b = (ImageView)findViewById(R.id.img88);
        c= (ImageView)findViewById(R.id.img77);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(MainActivity.this,Layout1.class);
                startActivity(z);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(MainActivity.this,Layout2.class);
                startActivity(x);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(MainActivity.this,Layout3.class);
                startActivity(v);
            }
        });

    }





}
