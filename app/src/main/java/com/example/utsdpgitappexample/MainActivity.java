package com.example.utsdpgitappexample;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    // Array of strings...
    String[] classNames = {"Christine Julien", "Yosef"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.activity_listview, classNames);

        ListView listView = (ListView) findViewById(R.id.roster);
        listView.setAdapter(adapter);
    }
}
