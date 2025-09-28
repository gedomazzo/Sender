package com.example.sender;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button returno;
    TextView note;
    TextView x1;
    TextView x2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        returno = findViewById(R.id.returno);
        note = findViewById(R.id.note);
        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);




    }
}