package com.guptaart.a1stmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class division extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView1;
    TextView textView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        button = findViewById(R.id.divbutton);
        editText1 = findViewById(R.id.divinput1);
        editText2 = findViewById(R.id.divinput2);
        textView1 = findViewById(R.id.divprint1);
        textView2 = findViewById(R.id.divprint2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= editText1.getText().toString();
                int n1=Integer.parseInt(s1);
                String s2= editText2.getText().toString();
                int n2=Integer.parseInt(s2);
                StringBuilder t=new StringBuilder();
                if(n2!=0) {
                    t.append(n1 / n2);
                    textView1.setText(t.toString());
                    StringBuilder y = new StringBuilder();
                    if ((n1 == 1 || n1 == 0) && n2 == 1) {
                        y.append("Suppose you have " + n1 + " Chocolate \nand you have no friend\nthen you will have " + (n1 / n2) + " Chocolate");
                    } else if (n1 == 0 || n1 == 1) {
                        y.append("Suppose you have " + n1 + " Chocolate \nand you have "+n2+" friends \nthen each of you will get " + (n1 / n2) + " Chocolates");
                    } else if (n2 == 1) {
                        y.append("Suppose you have " + n1 + " Chocolates \nand you have no friend \nthen you will have " + (n1 / n2) + " Chocolates");
                    } else {
                        y.append("Suppose you have " + n1 + " Chocolates \nand you have "+n2+" friends \nthen each of you will get " + (n1 / n2) + " Chocolates");
                    }
                    textView2.setText(y.toString());
                }
                else
                {
                    t.append("Undefind");
                    textView1.setText(t.toString());
                    StringBuilder y = new StringBuilder();
                    y.append("you cannot divide with 0");
                    textView2.setText(y.toString());
                }

            }
        });
    }
}