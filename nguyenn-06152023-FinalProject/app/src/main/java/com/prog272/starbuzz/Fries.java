package com.prog272.starbuzz;

public class Fries {
    private String name;
    private String description;
    private int imageResourceId;


//To get us started, fries is an array of three Fries.  R.drawable.. are file paths to the image files

    public static final Fries[] fries = {
            new Fries("Regular Fries", "Plain Fries with salt $4.00",
                    R.drawable.regularfries),
            new Fries("Cheese Fries", "Cheese sauce with fries $5.15",
                    R.drawable.cheesefries),
            new Fries("Chili Cheese Fries", "Ground beef, onion, chili been, cheese with fries $9.18",
                    R.drawable.chilicheesefries)
    };


//This is the Fries constructor

    private Fries(String name, String description, int imageResourceId) {
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

//The string representation of each fries is its name

    public String toString() {
        return this.name;
    }
}

