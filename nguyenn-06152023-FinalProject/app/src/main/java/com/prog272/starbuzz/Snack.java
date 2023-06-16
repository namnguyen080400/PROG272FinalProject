package com.prog272.starbuzz;

public class Snack {
    private String name;
    private String description;
    private int imageResourceId;


//To get us started, snack is an array of three Snack.  R.drawable.. are file paths to the image files

    // TODO change pictures
    public static final Snack[] snacks = {
            new Snack("Chicken Nugget", "golden crispy chicken nugget $5.00",
                    R.drawable.chickennugget),
            new Snack("Chicken Fries", "6 large pieces chicken fries $8.15",
                    R.drawable.chickenfries),
            new Snack("Popcorn chicken", "40 pieces of popcorn chicken $20.00",
                    R.drawable.popcornchicken)
    };


//This is the Snack constructor

    private Snack(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }


// these get the the values for the private variables

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }

//The string representation of each snack is its name

    public String toString() {
        return this.name;
    }
}
