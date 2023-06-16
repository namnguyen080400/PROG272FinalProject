package com.prog272.starbuzz;

//Import all the required classes

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;


//This activity extends the Activity class

public class TopLevelActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        //Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            //Implement the onItemclick method
            public void onItemClick(AdapterView<?> listView,
                                    View itemView,
                                    int position,
                                    long id) {


                //Launch HamburgerCategoryActivity when a user clicks on the Hamburgers item, we'll create this next
                //Ignore Android Studio's message that it does not exist

                if (position == 0) {
                    Intent intent = new Intent(TopLevelActivity.this, HamburgerCategoryActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(TopLevelActivity.this, FriesCategoryActivity.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(TopLevelActivity.this, SnackCategoryActivity.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(TopLevelActivity.this, DessertCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}