package com.example.ronan.tripinformation;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Button addExpB;
    private Button viewExpB;
    private Button startTrip;
    private EditText nameTrip;
    private TextView currentTrip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addExpB = (Button) findViewById(R.id.addExpButton);
        viewExpB = (Button) findViewById(R.id.viewExpButton);
        startTrip = (Button) findViewById(R.id.newTripButton);
        nameTrip = (EditText) findViewById(R.id.newTripEditText);
        currentTrip = (TextView) findViewById(R.id.tripName);

        //setting the add expense button to switch to the add expense activity
        addExpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addExpIntent = new Intent(getApplicationContext(), add_expense.class);
                startActivity(addExpIntent);
            }
        });

        //setting the view expense button to switch to the view expense activity
        viewExpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewExpIntent = new Intent(getApplicationContext(), view_expenses.class);
                startActivity(viewExpIntent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
