package com.guptaart.a1stmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Subtract extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView;
    TextView textView1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtract);
        button= findViewById(R.id.buttonsub);
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
                t.append(n1-n2);
                textView.setText(t.toString());
                StringBuilder y=new StringBuilder();
                if(n1>n2)
                {
                    if(n1==1)
                    {
                        y.append("Suppose you have "+n1+" book \nand your friend take nothing from you\n then you are left with "+(n1-n2)+" book");
                    }
                    else if(n2==0)
                    {
                        y.append("Suppose you have "+n1+" books \nand your friend take nothing from you\n then you are left with "+(n1-n2)+" books");
                    }
                    else
                    {
                        y.append("Suppose you have "+n1+" books \nand your friend take "+n2+" books from you\n then you are left with "+(n1-n2)+" books");
                    }
                }
                else if(n1<n2)
                {
                    if(n1==0 && n2>1)
                    {
                        y.append("Suppose you have "+n1+" book \nand your friend want "+n2+" books from you\n then you have to take "+(n2-n1)+" books\n from some other friend and then give to your friend\nso "+(n1-n2));
                    }
                    else if(n1==0)
                    {
                        y.append("Suppose you have "+n1+" book \nand your friend want "+n2+" book from you\n then you have to take "+(n2-n1)+" book\n from some other friend and then give to your friend\nso "+(n1-n2));
                    }
                    else
                    {
                        y.append("Suppose you have "+n1+" books \nand your friend want "+n2+" books from you\n then you have to take "+(n2-n1)+" books\n from some other friend and then give to your friend\nso "+(n1-n2));
                    }
                    }
                textView1.setText(y.toString());
            }
        });
    }
}