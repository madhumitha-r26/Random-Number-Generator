package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
               EditText f=(EditText) findViewById(R.id.editTextNumber);
               TextView res=(TextView) findViewById(R.id.textView2);
               int range=Integer.parseInt((f.getText().toString()));
               Random r=new Random();
               int rand_no=r.nextInt(range-0)+0;
               res.setText(rand_no+"");
            }
        });
    }
}
