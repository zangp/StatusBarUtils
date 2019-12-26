package com.anybooks.status.bar.utils;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.anybooks.status.bar.utils.utils.StatusBarUtil;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStatusBar();

        if (getLayoutId() == 0) {
            throw new IllegalArgumentException("you must return a right resource id");
        }
        setContentView(getLayoutId());
    }

    /**
     * @return activity的布局文件
     */
    protected abstract int getLayoutId();

    private void setStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (isUseFullScreenMode()) {
                StatusBarUtil.transparencyBar(this);
            } else {
                StatusBarUtil.setStatusBarColor(this, getStatusBarColor());
            }

            if (isUseBlackFontWithStatusBar()) {
                StatusBarUtil.setLightStatusBar(this, true, isUseFullScreenMode());
            }
        }
    }

    /**
     * 是否设置成透明状态栏，即就是全屏模式
     */
    protected boolean isUseFullScreenMode() {
        return false;
    }

    /**
     * 更改状态栏颜色，只有非全屏模式下有效
     */
    protected int getStatusBarColor() {
        return R.color.white_1;
    }

    /**
     * 是否改变状态栏文字颜色为黑色，默认为黑色
     */
    protected boolean isUseBlackFontWithStatusBar() {
        return true;
    }

    public void jumpActivity(Class<?> clazz) {
        startActivity(new Intent(this, clazz));
    }
}
