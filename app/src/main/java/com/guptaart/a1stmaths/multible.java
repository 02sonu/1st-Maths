package com.guptaart.a1stmaths;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class multible extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multible);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editText.getText().toString();
                int n=Integer.parseInt(s);
                StringBuilder t=new StringBuilder();
                Toast.makeText(multible.this, "Table of "+n, Toast.LENGTH_SHORT).show();
                for (int i = 1; i <= 10; i++)
                {
                    t.append(n + " x "+i+" = "+n*i);
                    t.append("\n");
                }
                textView.setText(t.toString());
            }
        });

    }
}