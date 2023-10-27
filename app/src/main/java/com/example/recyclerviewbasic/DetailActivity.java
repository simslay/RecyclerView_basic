package com.example.recyclerviewbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView, textView2;

    private void init() {
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        String intern = intent.getStringExtra("intern");
        String description = intent.getStringExtra("description");
        int avatar = intent.getIntExtra("avatar", 0);

        imageView.setImageResource(avatar);
        textView.setText(intern);
        textView2.setText(description);
    }
}