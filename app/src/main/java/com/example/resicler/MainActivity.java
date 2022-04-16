package com.example.resicler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  private   ArrayList<String>list;
  private RecyclerView recyclerView;
  private PersonaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        recyclerView=findViewById(R.id.recycler);
        adapter= new PersonaAdapter(list);
        recyclerView.setAdapter(adapter);

    }
    private void loadData() {
        list=new ArrayList<>();
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
        list.add("fjkgfhgjfhkkf");
    }
}