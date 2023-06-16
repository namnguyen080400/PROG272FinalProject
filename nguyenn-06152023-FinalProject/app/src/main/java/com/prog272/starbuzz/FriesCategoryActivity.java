package com.prog272.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;

public class FriesCategoryActivity<itemClickListener> extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fries_category);

        //The following populates the list view with the data from the fries array
        //"this" refers to the current activity. The Activity class is a subset of Context
        //simple_list_item_1 is a built in layout resource that tells the array adapter to display each array item in a single text view
        //Fries.fries is the actual array
        ArrayAdapter<Fries> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Fries.fries);

        //Create the listener and attach it to the array using the ListView setAdapter() method
        ListView listFries = (ListView) findViewById(R.id.list_fries);
        listFries.setAdapter(listAdapter);


        //Create another OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            //Implement the onItemclick method, this time using the adapter
            public void onItemClick(AdapterView<?> listFries,
                                    View itemView,
                                    int position,
                                    long id) {

                //Pass the fries the user clicks on to FriesActivity
                //When a user clicks a fries its ID is passed to FriesActivity
                //We add FriesActivity next so ignore the does not exist message
                Intent intent = new Intent(FriesCategoryActivity.this,
                        FriesActivity.class);
                intent.putExtra(FriesActivity.EXTRA_FRIES_ID, (int) id);
                startActivity(intent);
            }
        };

        //Assign the listener to the list view
        listFries.setOnItemClickListener(itemClickListener);
    }
}
