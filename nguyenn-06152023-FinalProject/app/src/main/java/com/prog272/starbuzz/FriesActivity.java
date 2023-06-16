package com.prog272.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FriesActivity extends Activity {
    public static final String EXTRA_FRIES_ID = "friesId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fries);

        //Get the fries from the intent
        int friesId = (Integer)getIntent().getExtras().get(EXTRA_FRIES_ID);
        Fries fries = Fries.fries[friesId];

        //Populate the fries name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(fries.getName());

        //Populate the fries description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(fries.getDescription());

        //Populate the fries image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(fries.getImageResourceId());
        photo.setContentDescription(fries.getName());
    }
}
