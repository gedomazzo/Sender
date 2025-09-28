package com.example.sender;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button random;
    Button see;
    EditText inpa;
    EditText inpb;
    EditText inpc;

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


}