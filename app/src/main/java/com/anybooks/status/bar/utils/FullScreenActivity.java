package com.anybooks.status.bar.utils;

public class FullScreenActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_full_screen;
    }

    @Override
    protected boolean isUseFullScreenMode() {
        return true;
    }
}
