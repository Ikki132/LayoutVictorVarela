package com.example.layoutvictorvarela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Text1 = (TextView) findViewById(R.id.Etiqueta);
        Text1.setText("Text view 1");
        TextView Text2 = (TextView) findViewById(R.id.Etiqueta2);
        Text2.setText("Text view 2");
        TextView Text3 = (TextView) findViewById(R.id.Etiqueta3);
        Text3.setText("Text view 3");
    }
}
