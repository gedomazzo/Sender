package com.example.sender;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private Button random;
    private Button see;
    private EditText inpa;
    private EditText inpb;
    private EditText inpc;

    private int a;
    private int b;
    private int c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = findViewById(R.id.random);
        see = findViewById(R.id.see);

        inpa = findViewById(R.id.inpa);
        inpb = findViewById(R.id.inpb);
        inpc = findViewById(R.id.inpc);

    }

    public void set_values() {
        String a1 = inpa.getText().toString();
        if (!a1.isEmpty()) a = Integer.parseInt(a1);
        else a = 0;

        String b1 = inpb.getText().toString();
        if (!b1.isEmpty()) b = Integer.parseInt(b1);
        else b = 0;

        String c1 = inpc.getText().toString();
        if (!c1.isEmpty()) c = Integer.parseInt(c1);
        else c = 0;
    }



    public void send(View view) {
        set_values();
    }

    public void put(View view) {
        Random far = new Random();
        a = far.nextInt();
        b = far.nextInt();
        c = far.nextInt();

        inpa.setText(String.valueOf(a));
        inpb.setText(String.valueOf(b));
        inpc.setText(String.valueOf(c));

    }
}