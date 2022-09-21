package com.example.gyakorlo_feladat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private Button buttonNagy;
    private Button buttonKis;
    private Button buttonSzin;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttonNagy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String text = editText1.getText().toString();
             textView.setText(text.toUpperCase(Locale.ROOT));
            }
        });
        buttonKis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String text = editText1.getText().toString();;
             textView.setText(text.toLowerCase());
            }
        });
        buttonSzin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int blue = rnd.nextInt(255);
                int green = rnd.nextInt(255);
                int red = rnd.nextInt(255);
                textView.setBackgroundColor(Color.rgb(red,blue,red));
            }
        });


    }

    private void init(){
        editText1 = findViewById(R.id.editText);
        buttonNagy = findViewById(R.id.buttonNagy);
        buttonKis = findViewById(R.id.buttonKis);
        buttonSzin = findViewById(R.id.buttonSzin);
        textView = findViewById(R.id.TextView);
    }

}