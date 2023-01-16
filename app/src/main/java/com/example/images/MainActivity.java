package com.example.images;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;
    Random rnd=new Random();
    int num;
    int[] img=new int[3];
    String nStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        iv=findViewById(R.id.iv);
        img[0]= R.drawable.one;
        img[1]=R.drawable.two;
        img[2]=R.drawable.three;
        }
        public void onClick(View view)
        {
            num=rnd.nextInt(3)+1;
            nStr=Integer.toString(num);
            btn.setText(nStr);
            iv.setImageResource(img[num-1]);
        }
    }