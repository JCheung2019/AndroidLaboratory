package com.zjun.laboratory.template;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    /**
     * 初始化
     */
    private void initialize() {

    }

    public void test(View view) {
        Toast.makeText(this, "我是Button", Toast.LENGTH_SHORT).show();
    }
}
