package com.prog272.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SnackActivity extends Activity {
    public static final String EXTRA_SNACK_ID = "snackId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        //Get the snack from the intent
        int snackId = (Integer)getIntent().getExtras().get(EXTRA_SNACK_ID);
        Snack snack = Snack.snacks[snackId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(snack.getName());


//Populate the Hamburger description

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(snack.getDescription());


//Populate the Hamburger image

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(snack.getImageResourceId());
        photo.setContentDescription(snack.getName());
    }
}
