package com.example.kaiify.atom;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<User> userlist;
    CutsomAdapter adapter;

    void initList() {
        listView = (ListView) findViewById(R.id.listView);
        User u1 = new User(R.drawable.bbc1, "BBC NEWS", "www.bbcnews.com");
        User u2 = new User(R.drawable.cnn1, "CNN NEWS", "www.cnn.com");
        User u3 = new User(R.drawable.euro, "EURO NEWS", "www.euronews.com");
        User u4 = new User(R.drawable.fox1, "FOX NEWS", "www.foxnews.com");
        User u5 = new User(R.drawable.sky1, "SKY NEWS", "www.skynews.com");

        userlist = new ArrayList<User>();
        userlist.add(u1);
        userlist.add(u2);
        userlist.add(u3);
        userlist.add(u4);
        userlist.add(u5);

        adapter=new CutsomAdapter(this,R.layout.listitem,userlist);
          listView.setAdapter(adapter);

    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show();
    }
}
