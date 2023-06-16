package com.prog272.starbuzz;

public class Dessert {
    private String name;
    private String description;
    private int imageResourceId;


//To get us started, dessert is an array of three Dessert.  R.drawable.. are file paths to the image files

    // TODO change pictures
    public static final Dessert[] dessert = {
            new Dessert("Ice cream Sundae", "Vanilla ice cream with sprinkles, caramel, and maraschino cherries on top $4.20",
                    R.drawable.icecreamsundae),
            new Dessert("Strawberry MilkShakes", "Strawberry flavor with sprinkles and maraschino cherries on top $6.38",
                    R.drawable.strawberrymilksake),
            new Dessert("Fudge Brownies", "6 pieces of fudge brownies $10.98",
                    R.drawable.fudgebrownies)
    };


//This is the dessert constructor

    private Dessert(String name, String description, int imageResourceId) {
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

//The string representation of each dessert is its name

    public String toString() {
        return this.name;
    }
}

