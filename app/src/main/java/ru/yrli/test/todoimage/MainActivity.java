package ru.yrli.test.todoimage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView lvItems;
    private int duration = Toast.LENGTH_SHORT;


    private float x1,x2;
    static final int MIN_DISTANCE = 150;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ADD HERE
        lvItems = (ListView) findViewById(R.id.lvItems);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        lvItems.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this, lvItems) {
            public void onSwipeRight(int pos) {
                Log.d("MAIN", "Swipe right "+ pos);

            }
            public void onSwipeLeft(int pos) {
                Log.d("MAIN", "Swipe left "+ pos);
                Context context = getApplicationContext();
                CharSequence text = "Deleted: " + items.get(pos);
                Toast.makeText(context, text, duration).show();

                items.remove(pos);
                itemsAdapter.notifyDataSetChanged();


                // writeItems(); // <---- Add this line


            }
            public void onDTap(int pos) {
                Log.d("DTAP", "Double tap at pos " + pos);
                Intent intent = new Intent(MainActivity.this, ItemActivity.class);
                intent.putExtra("message", items.get(pos));
                startActivity(intent);
            }
        });
        //lvItems.setOnClickListener();
        items.add("First Item");
        items.add("Second Item");
        // setupListViewListener();
    }

    public void onAddItem(View v) {
        EditText etNewItem = findViewById(R.id.etNewItem);
        String itemText = etNewItem.getText().toString();
        itemsAdapter.add(itemText);
        etNewItem.setText("");
    }




}