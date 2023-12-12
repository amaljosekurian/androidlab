package com.example.crud;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText edit1,edit2,edit3;
Button insert,read,update,delete;
String rno,name,dept;
SQLiteDatabase db;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        edit3=findViewById(R.id.edit3);
        insert=findViewById(R.id.insert);
        read=findViewById(R.id.read);
        update=findViewById(R.id.update);
        delete=findViewById(R.id.delete);
        DBHelper dbHelper= new DBHelper(this);
        db = dbHelper.getReadableDatabase();
        db=dbHelper.getWritableDatabase();
    }
    public void onInsert(View view){
        rno=edit2.getText().toString();
        name=edit1.getText().toString();
        dept=edit3.getText().toString();
        if (rno.equals("")||name.equals("")||dept.equals("")){
            Toast.makeText(this,"enter the contents",Toast.LENGTH_LONG).show();
        }
        else {
            ContentValues values=new ContentValues();
            values.put("rollno",rno);
            values.put("name",name);
            values.put("dept",dept);
            db.insert("student",null,values);
            Toast.makeText(this,"inserted",Toast.LENGTH_LONG).show();
        }

    }
    public void onUpdate(View view){
        rno=edit2.getText().toString();
        name=edit1.getText().toString();
        dept=edit3.getText().toString();
        if (rno.equals("")||name.equals("")||dept.equals("")){
            Toast.makeText(this,"no contents to display",Toast.LENGTH_LONG).show();
        }
        else {
            ContentValues values=new ContentValues();
            values.put("rollno",rno);
            values.put("name",name);
            values.put("dept",dept);
            db.update("student",values,"rollno="+rno,null);
            Toast.makeText(this,"values",Toast.LENGTH_LONG).show();
            Toast.makeText(this,"Updated",Toast.LENGTH_LONG).show();
        }
    }

    public  void onDelete(View view){
        rno=edit2.getText().toString();
        name=edit1.getText().toString();
        dept=edit3.getText().toString();
        if (rno.equals("")||name.equals("")||dept.equals("")){
            Toast.makeText(this,"no contents to display",Toast.LENGTH_LONG).show();
        }
        else {
            db.delete("student","rollno="+rno,null);
            Toast.makeText(this,"deleted",Toast.LENGTH_LONG).show();
        }
    }

    public  void onRead(View view){
        StringBuffer buffer=new StringBuffer();
        Cursor c=db.rawQuery("select * from student",null);
        while (c.moveToNext()){
            buffer.append("\n"+c.getString(0));
            buffer.append("\n"+c.getString(1));
            buffer.append("\n"+c.getString(2));
        }
        Toast.makeText(this,buffer.toString(),Toast.LENGTH_LONG).show();
    }

}

