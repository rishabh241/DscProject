package com.example.dscproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView0,textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    ImageView textBack0,textBack1,textBack2,textBack3,textBack4,textBack5,textBack6,textBack7,textBack8;
    TextView lives;
    GridLayout grid;
    int con = 3;
    boolean gameActive = true;
    int[] gameState = {2,2,2,2,2,2,2,2,2 };
    ArrayList<Integer> num = new ArrayList<>();
    Random rand = new Random();
    int a,b,c,d,e,f,g,h,j;
    public void randG(View view){
        con = 3;
        lives.setText("Life remaining: "+Integer.toString(con));
        fun1();
        fun3(textBack0);
        fun3(textBack1);
        fun3(textBack2);
        fun3(textBack3);
        fun3(textBack4);
        fun3(textBack5);
        fun3(textBack6);
        fun3(textBack7);
        fun3(textBack8);
//        textBack0.animate().rotationY(180).alpha(1).setDuration(1);
        textView0.setText(Integer.toString(num.get(a)));
        textView1.setText(Integer.toString(num.get(b)));
        textView2.setText(Integer.toString(num.get(c)));
        textView3.setText(Integer.toString(num.get(d)));
        textView4.setText(Integer.toString(num.get(e)));
        textView5.setText(Integer.toString(num.get(f)));
        textView6.setText(Integer.toString(num.get(g)));
        textView7.setText(Integer.toString(num.get(h)));
        textView8.setText(Integer.toString(num.get(j)));
    }
    public void  fun3(ImageView imag2){
        imag2.animate().rotationY(360).alpha(1).setDuration(1);

    }
    public void fun2(ImageView img, TextView txt) {

//

//        int tappedCount = Integer.parseInt(img.getTag().toString());
//        if (gameState[tappedCount] == 2) {
//            gameState[tappedCount] =1;


            img.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void onClick(View view) {
                    img.animate().rotationY(180).alpha(0).setDuration(1000);
                    con--;
                    if(con<=0){
                        new  AlertDialog.Builder(MainActivity.this)
                                .setIcon(android.R.drawable.ic_lock_lock)
                                .setTitle("Ooops You Loose")
                                .setMessage("Wants to play again?")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        fun1();
                                        fun3(textBack0);
                                        fun3(textBack1);
                                        fun3(textBack2);
                                        fun3(textBack3);
                                        fun3(textBack4);
                                        fun3(textBack5);
                                        fun3(textBack6);
                                        fun3(textBack7);
                                        fun3(textBack8);
//                                        textBack0.animate().rotationY(180).alpha(1).setDuration(1);
                                        textView0.setText(Integer.toString(num.get(a)));
                                        textView1.setText(Integer.toString(num.get(b)));
                                        textView2.setText(Integer.toString(num.get(c)));
                                        textView3.setText(Integer.toString(num.get(d)));
                                        textView4.setText(Integer.toString(num.get(e)));
                                        textView5.setText(Integer.toString(num.get(f)));
                                        textView6.setText(Integer.toString(num.get(g)));
                                        textView7.setText(Integer.toString(num.get(h)));
                                        textView8.setText(Integer.toString(num.get(j)));
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent intent = new Intent(MainActivity.this,strt_activity.class);
                                        startActivity(intent);
                                    }
                                })
                                .show();
                        con=3;
                    }else if(txt.getText().equals(7)){
                        new  AlertDialog.Builder(MainActivity.this)
                                .setIcon(android.R.drawable.ic_lock_lock)
                                .setTitle("You Won")
                                .setMessage("Wants to play again?")
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        fun1();
                                        fun3(textBack0);
                                        fun3(textBack1);
                                        fun3(textBack2);
                                        fun3(textBack3);
                                        fun3(textBack4);
                                        fun3(textBack5);
                                        fun3(textBack6);
                                        fun3(textBack7);
                                        fun3(textBack8);
//                                        textBack0.animate().rotationY(180).alpha(1).setDuration(1);
                                        textView0.setText(Integer.toString(num.get(a)));
                                        textView1.setText(Integer.toString(num.get(b)));
                                        textView2.setText(Integer.toString(num.get(c)));
                                        textView3.setText(Integer.toString(num.get(d)));
                                        textView4.setText(Integer.toString(num.get(e)));
                                        textView5.setText(Integer.toString(num.get(f)));
                                        textView6.setText(Integer.toString(num.get(g)));
                                        textView7.setText(Integer.toString(num.get(h)));
                                        textView8.setText(Integer.toString(num.get(j)));
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent intent = new Intent(MainActivity.this,strt_activity.class);
                                        startActivity(intent);
                                    }
                                })
                                .show();
                    }
                    lives.setText("Life remaining: "+Integer.toString(con));
//                img.animate().scaleY(1).alpha(0).setDuration(100);
//                img.animate()
                }
            });
        }
//    }



            public void fun1() {
                a = rand.nextInt(9);
                b = rand.nextInt(9);
                c = rand.nextInt(9);
                d = rand.nextInt(9);
                e = rand.nextInt(9);
                f = rand.nextInt(9);
                g = rand.nextInt(9);
                h = rand.nextInt(9);
                j = rand.nextInt(9);
                while (b == a) {
                    b = rand.nextInt(9);
                }
                while (c == a || c == b) {
                    c = rand.nextInt(9);
                }
                while (d == a || d == c || d == b) {
                    d = rand.nextInt(9);
                }
                while (e == a || e == b || e == c || e == d) {
                    e = rand.nextInt(9);
                }
                while (f == a || f == b || f == c || f == d || f == e) {
                    f = rand.nextInt(9);
                }
                while (g == a || g == b || g == c || g == d || g == e || g == f) {
                    g = rand.nextInt(9);
                }
                while (h == a || h == b || h == c || h == d || h == e || h == f || h == g) {
                    h = rand.nextInt(9);
                }
                while (j == a || j == b || j == c || j == d || j == e || j == f || j == g || j == h) {
                    j = rand.nextInt(9);
                }


            }

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                getSupportActionBar().hide();
                lives = findViewById(R.id.chances);
                textView0 = findViewById(R.id.textView0);
                textView1 = findViewById(R.id.textView1);
                textView2 = findViewById(R.id.textView2);
                textView3 = findViewById(R.id.textView3);
                textView4 = findViewById(R.id.textView4);
                textView5 = findViewById(R.id.textView5);
                textView6 = findViewById(R.id.textView6);
                textView7 = findViewById(R.id.textView7);
                textView8 = findViewById(R.id.textView8);
                textBack0 = findViewById(R.id.textView0Back);
                textBack1 = findViewById(R.id.textViewBack1);
                textBack2 = findViewById(R.id.textViewBack2);
                textBack3= findViewById(R.id.textViewBack3);
                textBack4 = findViewById(R.id.textViewBack4);
                textBack5 = findViewById(R.id.textViewBack5);
                textBack6 = findViewById(R.id.textViewBack6);
                textBack7 = findViewById(R.id.textViewBack7);
                textBack8= findViewById(R.id.textViewBack8);
                grid = findViewById(R.id.grid);
                num.clear();
                fun1();
                fun2(textBack0,textView0);
                fun2(textBack1,textView1);
                fun2(textBack2,textView2);
                fun2(textBack3,textView3);
                fun2(textBack4,textView4);
                fun2(textBack5,textView5);
                fun2(textBack6,textView6);
                fun2(textBack7,textView7);
                fun2(textBack8,textView8);

                for (int i = 1; i < 10; i++) {
                    num.add(i);
                }
                textView0.setText(Integer.toString(num.get(a)));
//        textBack0.setImageResource(R.drawable.cube);
                textView1.setText(Integer.toString(num.get(b)));
                textView2.setText(Integer.toString(num.get(c)));
                textView3.setText(Integer.toString(num.get(d)));
                textView4.setText(Integer.toString(num.get(e)));
                textView5.setText(Integer.toString(num.get(f)));
                textView6.setText(Integer.toString(num.get(g)));
                textView7.setText(Integer.toString(num.get(h)));
                textView8.setText(Integer.toString(num.get(j)));
                lives.setText("Life remaining: "+Integer.toString(con));
                Log.i("tag",String.valueOf(num.get(a)));

            }
        }
