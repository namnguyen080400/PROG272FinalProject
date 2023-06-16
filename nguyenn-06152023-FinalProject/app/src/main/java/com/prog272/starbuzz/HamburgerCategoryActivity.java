package com.prog272.starbuzz;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;

public class HamburgerCategoryActivity<itemClickListener> extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburger_category);


//The following populates the list view with the data from the hamburger array
//"this" refers to the current activity. The Activity class is a subset of Context
//simple_list_item_1 is a built in layout resource that tells the array adapter to display each array item in a single text view
//Hamburger.hamburgers is the actual array

        ArrayAdapter<Hamburger> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Hamburger.hamburgers);

//Create the listener and attach it to the array using the ListView setAdapter() method

        ListView listHamburgers = (ListView) findViewById(R.id.list_hamburgers);
        listHamburgers.setAdapter(listAdapter);


//Create another OnItemClickListener

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

//Implement the onItemclick method, this time using the adapter

            public void onItemClick(AdapterView<?> listHamburgers,
                                    View itemView,
                                    int position,
                                    long id) {

//Pass the hamburger the user clicks on to HamburgerActivity
//When a user clicks a hamburger its ID is passed to HamburgerActivity
//We add HamburgerActivity next so ignore the does not exist message

                Intent intent = new Intent(HamburgerCategoryActivity.this,
                        HamburgerActivity.class);
                intent.putExtra(HamburgerActivity.EXTRA_HAMBURGER_ID, (int) id);
                startActivity(intent);
            }
        };

//Assign the listener to the list view

        listHamburgers.setOnItemClickListener(itemClickListener);
    }
}