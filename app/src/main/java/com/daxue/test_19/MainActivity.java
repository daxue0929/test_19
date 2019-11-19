package com.daxue.test_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.daxue.test_19.first.FirstActovity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainBtn = findViewById(R.id.main_btn);

        mainBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FirstActovity.class);
            startActivity(intent);
        });
    }
}
