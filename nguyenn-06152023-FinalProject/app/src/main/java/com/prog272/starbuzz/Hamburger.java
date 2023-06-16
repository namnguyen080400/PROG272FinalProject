package com.prog272.starbuzz;

// Attributes of the class Hamburger.  The imageResourceId point to pictures that we'll add in the next step

public class Hamburger {
    private String name;
    private String description;
    private int imageResourceId;


//To get us started, Hamburger is an array of three Hamburger.  R.drawable.. are file paths to the image files

    public static final Hamburger[] hamburgers = {
            new Hamburger("CheeseBurger", "Beef patty, slice of cheddar cheese, tomato, lettuce and pickle $10.00",
                    R.drawable.cheeseburger),
            new Hamburger("DoubleBurger", "Two beef patty, slice of cheddar cheese, tomato, lettuce, pickle and mayo $15.00",
                    R.drawable.doubleburger),
            new Hamburger("Smoked Bacon Burger", "Beef patty, two smoked bacon, cheese, caramelized onion, and pickle $20.00",
                    R.drawable.smokedbaconburger)
    };


//This is the Hamburger constructor

    private Hamburger(String name, String description, int imageResourceId) {
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

//The string representation of each Hamburger is its name

    public String toString() {
        return this.name;
    }
}