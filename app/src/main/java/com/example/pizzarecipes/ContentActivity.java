package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    ImageView pizzaContentImage;
    TextView pizzaName;
    TextView pizzaRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        pizzaContentImage = findViewById(R.id.pizzaContentImage);
        pizzaName = findViewById(R.id.pizzaName);
        pizzaRecipe = findViewById(R.id.pizzaRecipe);

        RecyclerViewItem item = null;

        if (getIntent().hasExtra(MainActivity.NEXT_SCREEN)){
            item = (RecyclerViewItem) getIntent().getSerializableExtra(MainActivity.NEXT_SCREEN);
        }
        if (item != null){
            pizzaContentImage.setImageResource(item.getImageResource());
            pizzaName.setText(item.getPizzaName());
            pizzaRecipe.setText(item.getPizzaRecipe());
        }
    }
}