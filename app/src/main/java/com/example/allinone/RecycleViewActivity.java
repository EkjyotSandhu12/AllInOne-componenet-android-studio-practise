package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.allinone.Adapter.RecycleViewAdapter;
import com.example.allinone.ModelClass.RecycleViewModel;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RecycleViewModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerView = findViewById(R.id.RecycleView);

        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));
        list.add(new RecycleViewModel(R.drawable.test_icon,"ekjyot","AndroidDeveloper"));

        RecycleViewAdapter adapter = new RecycleViewAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

      /*  GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3,GridLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(manager);*/
    }
}