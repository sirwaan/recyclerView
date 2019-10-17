package com.sirwansoft.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ModelRecycler> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItems = new ArrayList<>();

        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));
        listItems.add(new ModelRecycler("BBC sport",R.drawable.download));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycler_in_mainActivity);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, listItems);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);


    }
}
//it need material library     implementation 'com.google.android.material:material:1.0.0'