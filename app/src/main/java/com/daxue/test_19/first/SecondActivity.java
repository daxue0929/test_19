package com.daxue.test_19.first;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.daxue.test_19.R;
import com.daxue.test_19.base.BaseActivity;

import java.util.HashMap;


public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity","创建了SecondActivity");
        setContentView(R.layout.activity_second);
    }

    /**
     *  in other activity start current activity
     */
    public static void actionStart(Context context, HashMap<String, String> hashMap) {
        Intent intent = new Intent(context, SecondActivity.class);
        hashMap.forEach((key,value) -> {
            intent.putExtra(key, value);
            Log.e("SecondActivity", key + "===>" + value);
        });
        context.startActivity(intent);
    }
}
