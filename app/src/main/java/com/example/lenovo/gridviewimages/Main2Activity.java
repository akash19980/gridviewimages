package com.example.lenovo.gridviewimages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView view=(ImageView)findViewById(R.id.imageView);
        Intent intent=getIntent();
        view.setImageResource(intent.getIntExtra("Source",0));
    }
}
