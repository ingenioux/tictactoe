package com.example.tictactoe;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    int flag=0; int count=0;
    String a1,a2,a3,a4,a5,a6,a7,a8,a9,game="ON";
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,clear,lock;
    TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        clear=findViewById(R.id.clear);
        lock=findViewById(R.id.lock);

        tv1=findViewById(R.id.tv1);




    }

    public void check(View view) {
        Button btncurrent =(Button) view ;
        String temp = btncurrent.getText().toString();
if (temp=="" && game=="ON") {
    count++;

    if (flag == 0) {
        btncurrent.setText("X");
        flag = 1;
        tv1.setText("0");
    } else {
        btncurrent.setText("0");
        flag = 0;
        tv1.setText("X");
    }

    if (count > 2) {
        a1 = btn1.getText().toString();
        a2 = btn2.getText().toString();
        a3 = btn3.getText().toString();
        a4 = btn4.getText().toString();
        a5 = btn5.getText().toString();
        a6 = btn6.getText().toString();
        a7 = btn7.getText().toString();
        a8 = btn8.getText().toString();
        a9 = btn9.getText().toString();

        if (Objects.equals(a1, a2) && a2 == a3 && !Objects.equals(a1, "")) {
            Toast.makeText(this, "Winner is " + a1, Toast.LENGTH_LONG).show();
            game = "OFF";
        } else if (Objects.equals(a4, a5) && a5 == a6 && !Objects.equals(a4, "")) {
            Toast.makeText(this, "Winner is " + a4, Toast.LENGTH_LONG).show();
            game = "OFF";
        } else if (Objects.equals(a7, a8) && a8 == a9 && !Objects.equals(a7, "")) {
            Toast.makeText(this, "Winner is " + a7, Toast.LENGTH_LONG).show();
            game = "OFF";
        } else if (Objects.equals(a1, a4) && a4 == a7 && !Objects.equals(a1, "")) {
            Toast.makeText(this, "Winner is " + a1, Toast.LENGTH_LONG).show();
            game = "OFF";
        } else if (Objects.equals(a2, a5) && a5 == a8 && !Objects.equals(a5, "")) {
            Toast.makeText(this, "Winner is " + a5, Toast.LENGTH_LONG).show();
            game = "OFF";
        } else if (Objects.equals(a3, a6) && a6 == a9 && !Objects.equals(a3, "")) {
            Toast.makeText(this, "Winner is " + a3, Toast.LENGTH_LONG).show();
            game = "OFF";
        } else if (Objects.equals(a1, a5) && a5 == a9 && !Objects.equals(a1, "")) {
            Toast.makeText(this, "Winner is " + a1, Toast.LENGTH_LONG).show();
            game = "OFF";
        } else if (Objects.equals(a3, a5) && a5 == a7 && !Objects.equals(a3, "")) {
            Toast.makeText(this, "Winner is " + a3, Toast.LENGTH_LONG).show();
            game = "OFF";
        }


    }
}


    }

    public void clear(View view) {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;
        game="ON";
        tv1.setText("X");
        lock.setText("LOCK");


    }

    public void lock(View view) {
        if (lock.getText().toString()=="LOCK"){
            game="OFF";
            lock.setText("UNLOCK");
        }
        else {
            game="ON";
            lock.setText("LOCK");
        }



    }



}