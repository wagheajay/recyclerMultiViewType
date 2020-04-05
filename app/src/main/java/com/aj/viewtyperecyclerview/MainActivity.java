package com.aj.viewtyperecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<data_model> mydata;
    private MyAdapter adapter;

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_viewType);

        linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);

        recyclerView.setLayoutManager(linearLayoutManager);


       mydata = new ArrayList<data_model>();

       mydata.add(new data_model("heading one","desc1","article",null));
       mydata.add(new data_model("heading one","desc2","video",R.drawable.sample_image));
       mydata.add(new data_model("heading one","desc3","video",R.drawable.sample_image));
       mydata.add(new data_model("heading one","desc4","article",null));
       mydata.add(new data_model("heading one","desc5","article",null));
       mydata.add(new data_model("heading one","desc6","video",R.drawable.sample_image));
       mydata.add(new data_model("heading one","desc7","video",R.drawable.sample_image));
       mydata.add(new data_model("heading one","desc8","video",R.drawable.sample_image));


       adapter = new MyAdapter(mydata,this);

       recyclerView.setAdapter(adapter);

    }
}
