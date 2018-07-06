package com.example.lenovo.gridviewimages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

class CustomAdapter extends BaseAdapter{

    Context context;
    int images[];
    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext, int[] imagearray) {
                this.context=applicationContext;
                this.images=imagearray;
                inflater=(LayoutInflater.from(applicationContext));


    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.jomarji,null);
        ImageView icon=(ImageView)view.findViewById(R.id.icon);
        icon.setImageResource(images[i]);

        return view;
    }


}
