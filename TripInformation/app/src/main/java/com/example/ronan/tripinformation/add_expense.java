package com.example.ronan.tripinformation;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class add_expense extends ActionBarActivity {

    private Button viewExp;
    private Button createTripB;
    private Button enterExpB;
    private Spinner expType;
    private Spinner expSubtype;
    private Spinner currSpin;
    private TextView tripName;
    private EditText setCost;
    private EditText setDCost;
    private CheckBox reciptCheckBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);
        viewExp = (Button) findViewById(R.id.viewExpButton);
        createTripB = (Button) findViewById(R.id.newTripButton);
        enterExpB = (Button) findViewById(R.id.submitButton);
        expType = (Spinner) findViewById(R.id.typeSpin);
        expSubtype = (Spinner) findViewById(R.id.subtypeSpin);
        currSpin = (Spinner) findViewById(R.id.currencySpin);
        tripName = (TextView) findViewById(R.id.tripTitle);
        setCost = (EditText) findViewById(R.id.currEditText);
        setDCost = (EditText) findViewById(R.id.currDEditText);
        reciptCheckBox = (CheckBox) findViewById(R.id.reciptcheck);


        //setting the view expense button to switch to the view expense activity
        viewExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vExpIntent = new Intent(getApplicationContext(), view_expenses.class);
                startActivity(vExpIntent);
            }
        });

        //setting the create a new trip button to return the user to the MainActivity
        createTripB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent createTripIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(createTripIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_expense, menu);
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
