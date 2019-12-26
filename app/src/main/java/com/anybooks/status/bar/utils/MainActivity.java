package com.anybooks.status.bar.utils;

import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected int getStatusBarColor() {
        return R.color.colorAccent;
    }

    public void tvClick(View view) {
        jumpActivity(FullScreenActivity.class);
    }
}
