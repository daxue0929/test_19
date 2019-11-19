package com.daxue.test_19.first;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.daxue.test_19.R;
import com.daxue.test_19.base.BaseActivity;

import java.util.HashMap;

public class FirstActovity extends BaseActivity implements View.OnClickListener {

    public EditText editText;
    public ProgressBar progressBar;
    public Button setProBtn_1;
    public Button setProBtn_2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("FirstActovity", "创建了当前FirstActovity");
        setContentView(R.layout.action_fitst);


        //init object elements within the page
        editText = findViewById(R.id.edit_text);
        progressBar = findViewById(R.id.progress_1);

        setProBtn_1 = findViewById(R.id.setPro_1);
        setProBtn_1.setOnClickListener(this);

        setProBtn_2 = findViewById(R.id.setPro_2);
        setProBtn_2.setOnClickListener(this);

    }

    public void btnClick(View view) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        SecondActivity.actionStart(this, hashMap);

    }

    public void getEdit(View view) {
        String inputText = editText.getText().toString();
        Toast.makeText(FirstActovity.this, inputText, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setPro_2:
                int progress2 = progressBar.getProgress();
                progress2 -= 10;
                progressBar.setProgress(progress2);
                break;
            case R.id.setPro_1:
                int progress = progressBar.getProgress();
                progress += 10;
                progressBar.setProgress(progress);
                break;
            default:
                break;
        }
    }
}
