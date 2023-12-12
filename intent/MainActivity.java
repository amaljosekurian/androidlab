package com.example.intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editText1);
        age=findViewById(R.id.editText2);
    }
    public void switchActivity(View view){
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("user",name.getText().toString());
        intent.putExtra("age",age.getText().toString());
        startActivity(intent);
    }}

