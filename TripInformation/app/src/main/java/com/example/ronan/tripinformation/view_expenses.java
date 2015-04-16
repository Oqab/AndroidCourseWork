package com.example.ronan.tripinformation;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class view_expenses extends ActionBarActivity {

    private TextView currentTrip;
    private Button createTButton;
    private Button tripEndBut;
    private Button addExpButton;
    private TextView totalExpText;
    private ListView dataDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_expenses);

        createTButton = (Button) findViewById(R.id.createTripBut);
        tripEndBut = (Button) findViewById(R.id.endTripButton);
        addExpButton = (Button) findViewById(R.id.addEbutton);
        totalExpText = (TextView) findViewById(R.id.cost);
        currentTrip = (TextView) findViewById(R.id.tripName);
        dataDisplay = (ListView) findViewById(R.id.databaseDisplay);


        //setting the add expense button to switch to the add expense activity
        addExpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addEIntent = new Intent(getApplicationContext(), add_expense.class);
                startActivity(addEIntent);
            }
        });

        //setting the create a new trip button to return the user to the MainActivity
        createTButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent createTIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(createTIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_expenses, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
