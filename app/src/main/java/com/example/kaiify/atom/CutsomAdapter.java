package com.example.kaiify.atom;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kaiify on 7/15/2017.
 */

public class CutsomAdapter extends ArrayAdapter<User> {
    Context context;
    int resource;
    ArrayList<User> userList;
    public CutsomAdapter(  Context context,  int resource,   ArrayList<User> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
         userList=objects;

    }

    @NonNull
    @Override
    public View getView(int position,   View convertView,  ViewGroup parent) {
         View view=null;

        view= LayoutInflater.from(context).inflate(resource,parent,false);


        ImageView imageView=(ImageView)view.findViewById(R.id.imageView1);
        TextView textView1=(TextView) view.findViewById(R.id.textView1);
        TextView textView2=(TextView)view.findViewById(R.id.textView2);

        User user=userList.get(position);
        imageView.setBackgroundResource(user.getIcon());
        textView1.setText(user.getName());
        textView2.setText(user.getDescription());

        return view;
    }
}
