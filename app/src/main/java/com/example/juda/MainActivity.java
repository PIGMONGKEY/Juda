package com.example.juda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.juda.FindMenteeList.FindMenteeList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
    }

    private void Init() {
        toolbar = findViewById(R.id.basic_tool_bar_MainActivity);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

//        FindMenteeList로 이동하기 위한 테스트 리스너
        testListener();
    }

    private void testListener() {
        test = findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FindMenteeList.class);
                startActivity(intent);
            }
        });
    }
}