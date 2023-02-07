package com.guptaart.a1stmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class words extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        button=findViewById(R.id.Wbutton);
        textView = findViewById(R.id.Wprint);
        editText = findViewById(R.id.wnum);
        StringBuilder t1=new StringBuilder();
        String onetwo[]={"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY","HUNDRED","THOUSAND"};
        t1.append("1. ONE\n2. TWO\n3. THREE\n4. FOUR\n5. FIVE\n6. SIX\n7. SEVEN\n8. EIGHT\n9. NINE\n10. TEN\n11. ELEVEN\n12. TWELVE\n13. THIRTEEN\n14. FOURTEEN\n15. FIFTEEN\n16. SIXTEEN\n17.SEVENTEEN\n18. EIGHTEEN\n19. NINETEEN\n");
        int h=1;
        int m=1;
        int k=20;
        String twoone[]={"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
        while(k<100)
        {
            if(k%10==0)
            {
                m++;
                t1.append(k+". "+onetwo[8+m]+"\n");
                h=0;
            }
            else
            {
                t1.append(k+". "+onetwo[8+m]+"-"+onetwo[h]+"\n");
                h++;
            }
            k++;
        }
        t1.append("100. HUNDRED");
        textView.setText(t1.toString());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editText.getText().toString();
                int n=Integer.parseInt(s);
                StringBuilder t=new StringBuilder();
                if(n==0)
                {
                    t.append("0. ZREO");
                }
                else if(n<=10)
                {
                    t.append(n+". "+onetwo[n-1]);
                }
                else if(n<=100)
                {
                    int q=n%10;
                    int w=n/10;
                    if(w==1)
                    {
                        t.append(n+". "+twoone[q-1]);
                    }
                    else if(n%10==0)
                    {
                        t.append(n+". "+onetwo[8+w]);
                    }
                    else if(n==100)
                    {
                        t.append("100. HUNDRED");
                    }
                    else
                    {
                        t.append(n).append(". ").append(onetwo[8 + w]).append("-").append(onetwo[q - 1]);
                    }
                }
                else if(n<1000)
                {
                    int q=n%10;
                    int m=n/10;
                    int w=m%10;
                    int e=m/10;
                    if(w==0)
                    {
                        if(q==0)
                        {
                            t.append(n).append(". ").append(onetwo[e - 1]).append(" HUNDRED ");
                        }
                        else
                        {
                            t.append(n).append(". ").append(onetwo[e - 1]).append(" HUNDRED ").append(onetwo[q - 1]);
                        }

                    }
                    else if(w==1)
                    {
                        if(q==0)
                        {
                            t.append(n).append(". ").append(onetwo[e - 1]).append(" HUNDRED TEN");
                        }
                        else
                        {
                            t.append(n).append(". ").append(onetwo[e - 1]).append(" HUNDRED ").append(twoone[q - 1]);
                        }
                    }
                    else if(n%10==0)
                    {
                        t.append(n).append(". ").append(onetwo[e - 1]).append(" HUNDRED ").append(onetwo[8+w]);
                    }
                    else
                    {
                        t.append(n).append(". ").append(onetwo[e-1]).append(" HUNDRED ").append(onetwo[8+w]).append("-").append(onetwo[q-1]);
                    }
                }
                else if(n<10000)
                {
                    int r=n/1000;
                    int n1=n;
                    n=n%1000;
                    int q=n%10;
                    int m=n/10;
                    int w=m%10;
                    int e=m/10;
                    if(e==0)
                    {
                        if(w==0 && q==0)
                        {
                            t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n");
                        }
                        else if(w==0)
                        {
                            t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND ").append(onetwo[q-1]);
                        }
                        else if(w==1)
                        {
                            if(q==0)
                            {
                                t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n").append(" TEN");
                            }
                            else
                            {
                                t.append(n1).append(". ").append(onetwo[r - 1] + " THOUSAND\n").append(twoone[q - 1]);
                            }
                        }
                        else if(q==0)
                        {
                            t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND ").append(onetwo[8+w]);
                        }
                        else
                        {
                            t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n").append(onetwo[8+w]).append("-").append(onetwo[q-1]);
                        }
                    }
                    else if(w==0)
                    {
                        if(q==0)
                        {
                            t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n").append(onetwo[e - 1]).append(" HUNDRED ");
                        }
                        else
                        {
                            t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n").append(onetwo[e - 1]).append(" HUNDRED ").append(onetwo[q - 1]);
                        }

                    }
                    else if(w==1)
                    {
                        if(q==0)
                        {
                            t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n").append(onetwo[e - 1]).append(" HUNDRED TEN");
                        }
                        else
                        {
                            t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n").append(onetwo[e - 1]).append(" HUNDRED ").append(twoone[q - 1]);
                        }
                    }
                    else if(n%10==0)
                    {
                        t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n").append(onetwo[e - 1]).append(" HUNDRED ").append(onetwo[8+w]);
                    }
                    else
                    {
                        t.append(n1).append(". ").append(onetwo[r-1]+" THOUSAND\n").append(onetwo[e-1]).append(" HUNDRED ").append(onetwo[8+w]).append("-").append(onetwo[q-1]);
                    }
                }
                else
                {
                    t.append("First learn till 10,000");
                }
                textView.setText(t.toString());
            }
        });
    }
}