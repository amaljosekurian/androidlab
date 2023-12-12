package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView view1=findViewById(R.id.img1);
        ImageView view2=findViewById(R.id.img2);
        ImageView like=findViewById(R.id.like);
        ImageView msg=findViewById(R.id.msg);
        ImageView like1=findViewById(R.id.like1);
        ImageView msg1=findViewById(R.id.msg1);
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"liked",Toast.LENGTH_LONG).show();
            }
        });

        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"message",Toast.LENGTH_LONG).show();
            }
        });
    }

}