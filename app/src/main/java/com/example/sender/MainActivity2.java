package com.example.sender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button returno;
    TextView note;
    TextView x1;
    TextView x2;
    ImageView grath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        returno = findViewById(R.id.returno);
        note = findViewById(R.id.note);
        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);
        grath = findViewById(R.id.graph);

        Intent git_gud = getIntent();

        int a = git_gud.getIntExtra("a", 0);
        int b = git_gud.getIntExtra("b", 0);
        int c = git_gud.getIntExtra("c", 0);

        int des = b*b - 4 * a * c;

        if (des < 0){
            x1.setText("error");
            x2.setText("error");
            note.setText("there no solution");

            if (a + b + c > 0){
                grath.setImageResource(R.drawable.no_up);
            } else {
                grath.setImageResource(R.drawable.no_down);
            }

        } else if (des > 0){
            double s1 = (-b + Math.sqrt(des))/(4*a);
            x1.setText("x1 = " + String.valueOf(s1));
            double s2 = (-b - Math.sqrt(des))/(4*a);
            x1.setText("x2 = " + String.valueOf(s2));
            note.setText("theres two answers");

            double middle = (s1 + s2)/2;
            if (a*middle + b*middle + c < 0){
                grath.setImageResource(R.drawable.two_up);
            } else {
                grath.setImageResource(R.drawable.two_down);
            }

        } else {
            double s1 = (-b + Math.sqrt(des))/(4*a);
            x1.setText("x = " + String.valueOf(s1));
            x2.setText("error");
            note.setText("theres one answer");

            if (s1 + 1 > 0){
                grath.setImageResource(R.drawable.one_up);
            } else {
                grath.setImageResource(R.drawable.one_dwon);
            }

        }


    }

    public void go_back(View view) {
        finish();
    }
}