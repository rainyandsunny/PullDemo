package com.yuntu.demo.pulldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {


    private ListView mDataListView;
    private View mHeaderView;
    private View mFootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
