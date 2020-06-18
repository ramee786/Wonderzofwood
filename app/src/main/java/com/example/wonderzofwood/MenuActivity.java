package com.example.wonderzofwood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapters.MenuRecyclerAdapter;

public class MenuActivity extends AppCompatActivity {
    RecyclerView menuRecyclerView;
    //temp vals
    List<String> heading;
    List<String> description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initViews();
        loadRecyclerView();
        loadDummyDataInMenuList();


    }

    private void loadDummyDataInMenuList() {
        heading = new ArrayList<>();
        description = new ArrayList<>();
        heading.add("Bowls set");
        heading.add("Attractive Key chain");
        heading.add("Wooden Spoons");
        heading.add("Classy Pen stand");
        heading.add("Wooden Water Bottel");
        heading.add("Clock");
        heading.add("Hangers");
        heading.add("Photo Frames");
        heading.add("Wooden Toys");
        heading.add("Cricket Bats");

        description.add("Set of six Bowls with hand made anscient design.");
        description.add("Stylish Key Chains.");
        description.add("Set of 6 Wooden Spoons with finest quality.");
        description.add("Stylish Pan Stand.");
        description.add("Completely natural water bottle with perfect finish.");
        description.add("Stylish wall clock.");
        description.add("Multipurpose wooden hangers set of 12.");
        description.add("Attractive photo frame.");
        description.add("Toys for childrens below 10 years of age.");
        description.add("Finest quality cricket bats.");
    }

    private void loadRecyclerView() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        menuRecyclerView.setLayoutManager(mLayoutManager);
        loadDummyDataInMenuList();
        MenuRecyclerAdapter menuRecyclerAdapter = new MenuRecyclerAdapter(heading, description);
        menuRecyclerView.setAdapter(menuRecyclerAdapter);

    }

    private void initViews() {
        menuRecyclerView = findViewById(R.id.recylerViewMenu);
    }
}