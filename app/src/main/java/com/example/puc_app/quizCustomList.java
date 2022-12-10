package com.example.puc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class quizCustomList extends AppCompatActivity {

    ListView lv;
    CustomListAdapter adapter;
    public ArrayList<CustomListPOJO> arr_bean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_custom_list);

        lv= (ListView) findViewById(R.id.list2);
        arr_bean=new ArrayList<CustomListPOJO>();

        arr_bean.add(new CustomListPOJO(R.drawable.array,"Array"));
        arr_bean.add(new CustomListPOJO(R.drawable.string,"Strings"));
        arr_bean.add(new CustomListPOJO(R.drawable.pointers,"Pointers"));
        arr_bean.add(new CustomListPOJO(R.drawable.recursion,"Recursion"));
        arr_bean.add(new CustomListPOJO(R.drawable.structure,"Structure"));
        arr_bean.add(new CustomListPOJO(R.drawable.looping,"Looping"));
        arr_bean.add(new CustomListPOJO(R.drawable.union,"Union"));

        adapter = new CustomListAdapter(arr_bean,this);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Loading "+ getTitle(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}