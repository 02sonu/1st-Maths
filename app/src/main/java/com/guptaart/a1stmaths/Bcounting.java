package com.guptaart.a1stmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bcounting extends AppCompatActivity {
    private Button button;
    EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcounting);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.BCno);
        textView = findViewById(R.id.BCprint);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editText.getText().toString();
                int n=Integer.parseInt(s);
                StringBuilder t=new StringBuilder();
                if(n>100)
                {
                    t.append("First learn upto 100");
                }
                else {
                    Toast.makeText(Bcounting.this, "Backward counting from "+n+" to 1", Toast.LENGTH_SHORT).show();
                    for (int i = n; i >= 1; i--) {
                        if (i <= 9) {
                            t.append(i + "    ");
                        } else if (i <= 19) {
                            t.append(i + "   ");
                        } else {
                            t.append(i + "  ");
                        }
                        if (i % 10 == 0) {
                            t.append("\n\n");
                        }
                    }
                }
                textView.setText(t.toString());
            }
        });
    }
}