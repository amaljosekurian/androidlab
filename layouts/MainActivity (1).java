package com.example.uicontrols;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;




    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        // This method is called when the button with onClick="onDigitClick" is clicked.
        public void onDigitClick(View view) {
            Button button = (Button) view;
            String buttonText = button.getText().toString();
            Toast.makeText(this, "linearlayout " + buttonText + " clicked", Toast.LENGTH_SHORT).show();
        }
        public void onGrid(View view) {
            Button button = (Button) view;
            String buttonText = button.getText().toString();
            Toast.makeText(this, "Grid " + buttonText + " clicked", Toast.LENGTH_SHORT).show();
        }
        public void onRelative(View view) {
            Button button = (Button) view;
            String buttonText = button.getText().toString();
            Toast.makeText(this, "Relative " + buttonText + " clicked", Toast.LENGTH_SHORT).show();
        }
        public void onTable(View view) {
            Button button = (Button) view;
            String buttonText = button.getText().toString();
            Toast.makeText(this, "table " + buttonText + " clicked", Toast.LENGTH_SHORT).show();
        }
        public void onFrame(View view) {
            Button button = (Button) view;
            String buttonText = button.getText().toString();
            Toast.makeText(this, "frame " + buttonText + " clicked", Toast.LENGTH_SHORT).show();
        }
        public void onconstrain(View view) {
            Button button = (Button) view;
            String buttonText = button.getText().toString();
            Toast.makeText(this, "constrain " + buttonText + " clicked", Toast.LENGTH_SHORT).show();
        }
    }
