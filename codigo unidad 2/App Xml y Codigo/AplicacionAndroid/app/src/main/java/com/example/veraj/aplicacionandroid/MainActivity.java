package com.example.veraj.aplicacionandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout mainLayout = new RelativeLayout(this);
        TextView texto = new TextView(this);
        texto.setText("Hello World!");
        mainLayout.addView(texto);
        setContentView(mainLayout);


    }
}
