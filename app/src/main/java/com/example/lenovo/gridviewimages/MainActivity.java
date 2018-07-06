package com.example.lenovo.gridviewimages;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class MainActivity extends AppCompatActivity {
GridView imageview;

int imagearray[]={R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.download4,R.drawable.download5,R.drawable.download6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    imageview=(GridView)findViewById(R.id.imageview);
    CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),imagearray);
    imageview.setAdapter(customAdapter);
    imageview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("Source",imagearray[i]);
            startActivity(intent);

        }
    });
    }

}
