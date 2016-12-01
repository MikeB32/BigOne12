package com.example.mike.bigone12;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mike.bigone12.DataBaseHelper;

import java.io.ByteArrayOutputStream;

public class Information extends AppCompatActivity {

    EditText text1, text2;
    Button btn;
    Integer flag;
    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        text1 = (EditText) findViewById(R.id.txt1);
        text2 = (EditText) findViewById(R.id.txt2);
        ImageView oo = (ImageView) findViewById(R.id.imageView99);

        btn = (Button) findViewById(R.id.btn1);
        Log.d("CLick", "123 INFO SAVED");

        dataBaseHelper = new DataBaseHelper(this);


        Bundle extras = getIntent().getExtras();
        Bitmap bmp = (Bitmap) extras.getParcelable("Bitmap");
        flag = extras.getInt("flag");
        oo.setImageBitmap(bmp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataBaseHelper.insertentry(text1.getText().toString(), text2.getText().toString(), flag);
                Toast.makeText(getApplicationContext(), "doneeeee",
                        Toast.LENGTH_LONG).show();
                Intent b = new Intent(Information.this, MainActivity.class);
                startActivity(b);
            }
        });


    }
}