package com.example.execptions;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List <String> list=new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");
        for (int i=0;i<5;i++){
            try {
                list.get(i);

            } catch (Exception e) {
                Toast.makeText(this,"rxception caught",Toast.LENGTH_LONG).show();
            }
        }

    }

    }
