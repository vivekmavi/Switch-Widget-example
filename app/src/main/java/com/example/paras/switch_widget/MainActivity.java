package com.example.paras.switch_widget;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Switch switch1,switch2;
    LinearLayout linearLayout;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 =(Switch) findViewById(R.id.switch1);
        switch2 =(Switch) findViewById(R.id.switch2);

        linearLayout = (LinearLayout) findViewById(R.id.LinearLayout_main_xml_root);

        textView = (TextView) findViewById(R.id.textView1);

        switch1.setOnCheckedChangeListener(this);
        switch2.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked)
    {
        if(isChecked)
        {
            if(compoundButton==switch1)
            {
                Toast.makeText(this,"switch1 on",Toast.LENGTH_SHORT).show();
            }
            if(compoundButton==switch2)
            {
                linearLayout.setBackgroundColor(Color.BLACK);
                textView.setTextColor(Color.WHITE);
            }
        }
        else if( isChecked == false)
        {
            if(compoundButton==switch1)
            {
                Toast.makeText(this,"switch1 off",Toast.LENGTH_SHORT).show();
            }
            if(compoundButton==switch2)
            {
                linearLayout.setBackgroundColor(Color.WHITE);
                textView.setTextColor(Color.BLACK);
            }

        }

    }
}
