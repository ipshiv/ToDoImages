package com.example.personalstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.personalstorage.Item.model.ItemModel;
import com.example.personalstorage.Storage.model.StorageModel;
import com.example.personalstorage.Storage.presenter.IStorage;
import com.example.personalstorage.Storage.presenter.Storage;
import com.example.personalstorage.Storage.presenter.SupplyMethods.FifoSupplyMethod;
import com.example.personalstorage.Storage.presenter.SupplyMethods.SupplyMethods;
import com.example.personalstorage.Storage.view.IStorageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IStorageView {

    private static final String TAG = "Main";

    EditText etNewItem;
    Button addButton;
    ListView lvItems;
    ArrayAdapter<String> itemsAdapter;
    ArrayList<String> items;

    IStorage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button)findViewById(R.id.btnAddItem);
        etNewItem = (EditText)findViewById(R.id.etNewItem);

        storage = new Storage(this, new FifoSupplyMethod());
        storage.loadData("Current storage");

        lvItems = (ListView) findViewById(R.id.lvItems);
        items = storage.showItems();
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storage.onCreateItem(etNewItem.getText().toString());
                items.add(etNewItem.getText().toString());
                etNewItem.setText("");
            }
        });

    }


    @Override
    public void showLoading() {
        Log.d(TAG, "showLoading: Loading...");

    }

    @Override
    public void hideLoading() {
        Log.d(TAG, "showLoading: Data loaded");

    }

    @Override
    public void onCreateItemResult(String message) {

    }

    @Override
    public void onDeleteItemResult(String message) {

    }

    @Override
    public void showEditItemDialog(ItemModel item) {

    }
}
