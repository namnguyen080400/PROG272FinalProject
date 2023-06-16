package com.prog272.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DessertActivity extends Activity {
    public static final String EXTRA_DESSERT_ID = "dessertId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        //Get the dessert from the intent
        int dessertId = (Integer)getIntent().getExtras().get(EXTRA_DESSERT_ID);
        Dessert dessert = Dessert.dessert[dessertId];

        //Populate the dessert name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(dessert.getName());

        //Populate the dessert description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(dessert.getDescription());

        //Populate the dessert image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(dessert.getImageResourceId());
        photo.setContentDescription(dessert.getName());
    }
}
