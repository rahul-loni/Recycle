package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Model>userlist;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initdata();
        initrecycler();



    }

    private void initdata() {

        userlist=new ArrayList<>();
        userlist.add(new Model(R.drawable.image3,"Rahul Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Rohan Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Rishu Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Rupak Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Ramu Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Rahul Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Rohan Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Rishu Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Rupak Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
        userlist.add(new Model(R.drawable.image3,"Ramu Kumar","11:00","Hello Rahul Kumar , How are you","-------"));
    }

    private void initrecycler() {

        recyclerView=findViewById(R.id.recycler);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userlist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


}