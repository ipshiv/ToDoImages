package ru.yrli.test.todoimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private ListView lView;
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        lView = (ListView) findViewById(R.id.lView);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        lView.setAdapter(itemsAdapter);

        items.add("1. " + message);
        items.add("2. " + message);
        items.add("3. " + message);

        textView.setText("" + message);
        textView2.setText("Description:  " + message + message + message + message + message);


    }
}
