package com.prog272.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.AdapterView;

public class SnackCategoryActivity<itemClickListener> extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_category);

        //The following populates the list view with the data from the snack array
        //"this" refers to the current activity. The Activity class is a subset of Context
        //simple_list_item_1 is a built in layout resource that tells the array adapter to display each array item in a single text view
        //Snack.snack is the actual array
        ArrayAdapter<Snack> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Snack.snacks);

        //Create the listener and attach it to the array using the ListView setAdapter() method
        ListView listSnack = (ListView) findViewById(R.id.list_snack);
        listSnack.setAdapter(listAdapter);


        //Create another OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            //Implement the onItemclick method, this time using the adapter
            public void onItemClick(AdapterView<?> listSnack,
                                    View itemView,
                                    int position,
                                    long id) {

                //Pass the snack the user clicks on to SnackActivity
                //When a user clicks a snack its ID is passed to SnackActivity
                //We add SnackActivity next so ignore the does not exist message
                Intent intent = new Intent(SnackCategoryActivity.this,
                        SnackActivity.class);
                intent.putExtra(SnackActivity.EXTRA_SNACK_ID, (int) id);
                startActivity(intent);
            }
        };

        //Assign the listener to the list view
        listSnack.setOnItemClickListener(itemClickListener);
    }
}
