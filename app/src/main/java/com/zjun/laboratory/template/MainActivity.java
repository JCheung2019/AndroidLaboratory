package com.zjun.laboratory.template;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onInitView() {

    }

    public void test(View view) {
        Toast.makeText(this, "我是Button", Toast.LENGTH_SHORT).show();
    }
}
