package com.example.cice.activitytransitions;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_in, R.anim.left_out); //La primera animacion es de la segunda actividad, la segunda de la primera


            }
        });
        //PARA VERSIONES POSTERIORES A LOLLIPOP
        Button button1 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Transition transition = TransitionInflater.from(MainActivity.this).inflateTransition(R.transition.slide_left);
                getWindow().setExitTransition(transition);

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this);
                startActivity(intent, optionsCompat.toBundle());
            }
        });
    }
}
