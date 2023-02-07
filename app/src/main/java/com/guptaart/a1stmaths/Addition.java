package com.guptaart.a1stmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView;
    TextView textView1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        button =findViewById(R.id.buttonsub);
        editText1 = findViewById(R.id.sub1);
        editText2 = findViewById(R.id.sub2);
        textView = findViewById(R.id.subans);
        textView1 = findViewById(R.id.subword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= editText1.getText().toString();
                int n1=Integer.parseInt(s1);
                String s2= editText2.getText().toString();
                int n2=Integer.parseInt(s2);
                StringBuilder t=new StringBuilder();
                t.append(n1+n2);
                textView.setText(t.toString());
                StringBuilder y=new StringBuilder();
                if(n1>1&&n2>1)
                {
                    y.append("Suppose you have "+n1+" Apples \nand your friend give you "+n2+" Mangoes\n then total you have "+(n1+n2)+" fruits");
                }
                else if(n1==1 && n2!=1)
                {
                    y.append("Suppose you have "+n1+" Apple \nand your friend give you "+n2+" Mangoes\n then total you have "+(n1+n2)+" fruits");
                }
                else if(n2==1 && n1!=1)
                {
                    y.append("Suppose you have "+n1+" Apples \nand your friend give you "+n2+" Mango\n then total you have "+(n1+n2)+" fruits");
                }
                else if(n1==1  && n2==1)
                {
                    y.append("Suppose you have "+n1+" Apple \nand your friend give you "+n2+" Mango\n then total you have "+(n1+n2)+" fruits");
                }
                else if(n1==0)
                {
                    y.append("Suppose you have zero Apple \nand your friend give you "+n2+" Mangoes\n then total you have "+(n1+n2)+" fruits");
                }
                else if(n2==0)
                {
                    y.append("Suppose you have "+n1+" Apples \nand your poor friend give you nothing\n then total you have "+(n1+n2)+" fruits");
                }
                else
                {
                    y.append("Suppose you have "+n1+" Apples \nand your friend give you "+n2+" Mango\n then total you have "+(n1+n2)+" fruits");
                }
                textView1.setText(y.toString());

            }
        });

    }
}