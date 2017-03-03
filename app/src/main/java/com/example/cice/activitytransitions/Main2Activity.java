package com.example.cice.activitytransitions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Transition transition = TransitionInflater.from(Main2Activity.this).inflateTransition(R.transition.slide_right);
        getWindow().setEnterTransition(transition);
    }
}
