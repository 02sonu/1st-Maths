package com.guptaart.a1stmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.img1);
    }
    public void fun1(View v)
    {
        Intent i=new Intent(MainActivity.this,Counting.class);
        startActivity(i);
    }
    public void fun2(View v)
    {
        Intent i=new Intent(MainActivity.this,Bcounting.class);
        startActivity(i);
    }
    public void fun3(View v)
    {
        Intent i=new Intent(MainActivity.this,multible.class);
        startActivity(i);
    }
    public void fun4(View v)
    {
        Intent i=new Intent(MainActivity.this,words.class);
        startActivity(i);
    }
    public void fun5(View v)
    {
        Intent i=new Intent(MainActivity.this,Addition.class);
        startActivity(i);
    }
    public void fun6(View v)
    {
        Intent i=new Intent(MainActivity.this,Subtract.class);
        startActivity(i);
    }
    public void fun7(View v)
    {
        Intent i=new Intent(MainActivity.this,Multiply.class);
        startActivity(i);
    }
    public void fun8(View v)
    {
        Intent i=new Intent(MainActivity.this,division.class);
        startActivity(i);
    }






//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(MainActivity.this,Counting.class);
//                startActivity(i);
//            }
//        });
}