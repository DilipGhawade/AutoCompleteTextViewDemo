package com.meteorsoftech.autocompletetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
    String  []StateName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actv = (AutoCompleteTextView)findViewById(R.id.autoComTV);
        StateName = getResources().getStringArray(R.array.SelectState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,StateName);
        actv.setAdapter(adapter);
        //Run the program and sea the output
        //wait it will take a some time
        //it work fine
        // hope it helpful for you thamks for watching my video...


    }
}
