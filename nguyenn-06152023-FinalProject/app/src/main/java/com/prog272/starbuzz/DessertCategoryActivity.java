package com.prog272.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;

public class DessertCategoryActivity<itemClickListener> extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_category);

        //The following populates the list view with the data from the dessert array
        //"this" refers to the current activity. The Activity class is a subset of Context
        //simple_list_item_1 is a built in layout resource that tells the array adapter to display each array item in a single text view
        //Dessert.dessert is the actual array
        ArrayAdapter<Dessert> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Dessert.dessert);

        //Create the listener and attach it to the array using the ListView setAdapter() method
        ListView listDessert = (ListView) findViewById(R.id.list_dessert);
        listDessert.setAdapter(listAdapter);


        //Create another OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            //Implement the onItemclick method, this time using the adapter
            public void onItemClick(AdapterView<?> listDessert,
                                    View itemView,
                                    int position,
                                    long id) {

                //Pass the dessert the user clicks on to DessertActivity
                //When a user clicks a dessert its ID is passed to DessertActivity
                //We add DessertActivity next so ignore the does not exist message
                Intent intent = new Intent(DessertCategoryActivity.this,
                        DessertActivity.class);
                intent.putExtra(DessertActivity.EXTRA_DESSERT_ID, (int) id);
                startActivity(intent);
            }
        };

        //Assign the listener to the list view
        listDessert.setOnItemClickListener(itemClickListener);
    }
}
