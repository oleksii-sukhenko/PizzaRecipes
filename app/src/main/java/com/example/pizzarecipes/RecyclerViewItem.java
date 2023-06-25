package com.example.pizzarecipes;

import java.io.Serializable;

public class RecyclerViewItem implements Serializable {
    private final int imageResource;
    private final String pizzaName;
    private final String pizzaDescription;
    private final String pizzaRecipe;

    public RecyclerViewItem(int imageResource, String pizzaName, String pizzaDescription, String pizzaRecipe) {
        this.imageResource = imageResource;
        this.pizzaName = pizzaName;
        this.pizzaDescription = pizzaDescription;
        this.pizzaRecipe = pizzaRecipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getPizzaDescription() {
        return pizzaDescription;
    }
    public String getPizzaRecipe() {
        return pizzaRecipe;
    }


}
