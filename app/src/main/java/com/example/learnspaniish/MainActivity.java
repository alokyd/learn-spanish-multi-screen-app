package com.example.learnspaniish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView   tvnumbers= (TextView) findViewById(R.id.tvnumbers);
        TextView  tvcolors=(TextView) findViewById(R.id.tvcolors);
        TextView  tvfamily=(TextView) findViewById(R.id.tvfamily);
        TextView tvphrase=(TextView) findViewById(R.id.tvphrase);

        tvnumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,numbers.class);
                startActivity(intent);
            }
        });

        tvcolors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,colors.class);
                startActivity(intent);
            }
        });
        tvfamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,familymember.class);
                startActivity(intent);
            }
        });
        tvphrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,phrase.class);
                startActivity(intent);
            }
        });
    }
}