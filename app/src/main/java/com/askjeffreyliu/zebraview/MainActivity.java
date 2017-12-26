package com.askjeffreyliu.zebraview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ZebraView zebraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zebraView = findViewById(R.id.zebraview);
    }

    public void setNewColor(View view) {
        zebraView.setColors(
                ContextCompat.getColor(this, android.R.color.secondary_text_dark),
                ContextCompat.getColor(this, android.R.color.holo_red_dark));
        zebraView.setBarWidth(200);
    }
}
