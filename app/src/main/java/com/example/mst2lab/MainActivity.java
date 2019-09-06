package com.example.mst2lab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,frame;
    Button button1;
    int cnt =-1;
    int frames[]={R.drawable.s1,R.drawable.ss};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button1 = findViewById(R.id.button1);
       img1=findViewById(R.id.img1);
       frame=findViewById(R.id.frame);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cnt<frames.length-1)
                {
                    cnt++;
                    img1.setImageResource(frames[cnt]);
                }
                else
                {
                    cnt =0;
                    img1.setImageResource(frames[cnt]);
                }
            }
        });
    }

}
