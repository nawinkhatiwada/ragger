package com.firfiretechnologies.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.firfiretechnologies.ragger.CircleView;

public class MainActivity extends AppCompatActivity {
private CircleView circleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        circleView = (CircleView) findViewById(R.id.circleView);
        circleView.setCircleColor(Color.GREEN);

        circleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circleView.showRandomColor();
            }
        });
    }
}
