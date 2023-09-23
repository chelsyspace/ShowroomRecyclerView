package com.example.showroomrecyclerview_a187991;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowroomDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showroom_detail);

        Intent intent = getIntent();

        TextView tvName = findViewById(R.id.tv_showroom_name_detail);
        tvName.setText(intent.getStringExtra("showroomName"));
    }
}