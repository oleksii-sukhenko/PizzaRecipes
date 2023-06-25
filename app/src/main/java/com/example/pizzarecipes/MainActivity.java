package com.example.pizzarecipes;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<RecyclerViewItem> recyclerViewItems;
    public static final String NEXT_SCREEN = "content_screen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewItems = new ArrayList<>();
        fillList();


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(new RecyclerViewAdapter(recyclerViewItems,
                (position, item) -> {
                    Intent intent = new Intent(
                            MainActivity.this,
                            ContentActivity.class);
                    intent.putExtra(NEXT_SCREEN, item);
                    startActivity(intent);
                }));
        recyclerView.setLayoutManager(layoutManager);
    }


    void fillList(){
        recyclerViewItems.add(new RecyclerViewItem(
                R.drawable.first_pizza_content_image,
                getString(R.string.first_pizza_name),
                getString(R.string.first_pizza_description),
                getString(R.string.first_pizza_recipe)
        ));

        recyclerViewItems.add(new RecyclerViewItem(
                R.drawable.second_pizza_content_image,
                getString(R.string.second_pizza_name),
                getString(R.string.second_pizza_description),
                getString(R.string.second_pizza_recipe)
        ));

        recyclerViewItems.add(new RecyclerViewItem(
                R.drawable.third_pizza_content_image,
                getString(R.string.third_pizza_name),
                getString(R.string.third_pizza_description),
                getString(R.string.third_pizza_recipe)
        ));

        recyclerViewItems.add(new RecyclerViewItem(
                R.drawable.fourth_pizza_content_image,
                getString(R.string.fourth_pizza_name),
                getString(R.string.fourth_pizza_description),
                getString(R.string.fourth_pizza_recipe)
        ));

        recyclerViewItems.add(new RecyclerViewItem(
                R.drawable.fifth_pizza_content_image,
                getString(R.string.fifth_pizza_name),
                getString(R.string.fifth_pizza_description),
                getString(R.string.fifth_pizza_recipe)
        ));
    }


}