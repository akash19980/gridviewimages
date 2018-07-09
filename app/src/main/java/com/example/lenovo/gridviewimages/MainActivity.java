package com.example.lenovo.gridviewimages;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
GridView imageview;

int imagearray[]={R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.download4,R.drawable.download5,R.drawable.download6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    imageview=(GridView)findViewById(R.id.imageview);
        ArrayList<HashMap<String ,String>> arraylist =new ArrayList<>();
        for(int i=0;i<imagearray.length;i++)
        {
            HashMap<String, String>hashmap=new HashMap<>();

            hashmap.put("images",imagearray[i]+"");
            arraylist.add(hashmap);

        }
        String[] from ={"images"};
        int[] to = {R.id.icon};

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arraylist,R.layout.textimage,from,to);
        listView.setAdapter(simpleAdapter);
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
