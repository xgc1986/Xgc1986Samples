package com.xgc1986.xgc1986samples;

import android.app.Activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.xgc1986.xgc1986samples.R;
import com.xgc1986.xgc1986samples.adapter.DemoAdapter;
import com.xgc1986.xgc1986samples.helper.ActivityHelper;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ActivityHelper[] myDataset = {
                null,
                ActivityHelper.rippleButtonDemo,
                ActivityHelper.rippleImageButtonDemo,
                ActivityHelper.parallaxDemo
        };

        // specify an adapter (see also next example)
        RecyclerView.Adapter mAdapter = new DemoAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
