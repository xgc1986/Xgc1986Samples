package com.xgc1986.xgc1986samples.demoV19;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;

import com.xgc1986.ripplebutton.widget.RippleButton;
import com.xgc1986.xgc1986samples.R;


public class RippleButtonDemoV19Activity extends ActionBarActivity {

    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_activity_ripple_button);

        final int[] colors = {
                0xff33b5e5,
                0xffff4444,
                0xff99cc00
        };
        final String[] texts = {"AWESOME", "THIS", "IS"};

        RippleButton rb = (RippleButton) findViewById(R.id.btn3);
        rb.setColors(colors[0], colors[2]);

        final RippleButton rb2 = (RippleButton) findViewById(R.id.btn4);
        rb2.setColors(colors[1], colors[2]);
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = (i + 1) % 3;
                rb2.setColors(colors[(i) % 3], colors[(i + 1) % 3]);
                rb2.setText(texts[i]);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();

        return super.onOptionsItemSelected(item);
    }
}