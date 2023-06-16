package com.prog272.starbuzz;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class HamburgerActivity extends Activity {
    public static final String EXTRA_HAMBURGER_ID = "hamburgerId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburger);


//Get the Hamburger from the intent

        int hamburgerId = (Integer)getIntent().getExtras().get(EXTRA_HAMBURGER_ID);
        Hamburger hamburger = Hamburger.hamburgers[hamburgerId];


//Populate the Hamburger name

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(hamburger.getName());


//Populate the Hamburger description

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(hamburger.getDescription());


//Populate the Hamburger image

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(hamburger.getImageResourceId());
        photo.setContentDescription(hamburger.getName());
    }
}