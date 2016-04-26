package com.ademo.ademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.rebound.SimpleSpringListener;
import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringSystem;


public class MainActivity extends AppCompatActivity {
    Spring spring;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = (TextView) findViewById(R.id.tv);
        // Create a system to run the physics loop for a set of springs.
        SpringSystem springSystem = SpringSystem.create();

// Add a spring to the system.
         spring = springSystem.createSpring();

// Add a listener to observe the motion of the spring.
        spring.addListener(new SimpleSpringListener() {

            @Override
            public void onSpringUpdate(Spring spring) {
                // You can observe the updates in the spring
                // state by asking its current value in onSpringUpdate.
//                float value = (float) spring.getCurrentValue();
//                float scale = 1f - (value * 0.5f);
//                tv.setScaleX(scale);
//                tv.setScaleY(scale);
                tv.setTranslationY((float)spring.getCurrentValue());
            }
        });

        test();
    }

    public void test(){
        int abc = 23;
    }

    public void downOnclick(View view){

        // Set the spring in motion; moving from 0 to 1
        spring.setCurrentValue(0);
        spring.setEndValue(400);
    }
    public void upOnclick(View view){

        // Set the spring in motion; moving from 0 to 1
        spring.setCurrentValue(400);
        spring.setEndValue(0);
    }
}
