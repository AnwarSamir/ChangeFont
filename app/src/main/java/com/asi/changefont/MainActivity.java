package com.asi.changefont;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetFont setFont=new SetFont();
        setFont.changeFonts(MainActivity.this,(RelativeLayout)findViewById(R.id.mainRoot));
    }
}
