package com.example.personalstorage.Storage.presenter;

import android.content.ClipData;
import android.util.Log;
import android.view.View;

import com.example.personalstorage.Item.model.ItemModel;
import com.example.personalstorage.Storage.model.StorageModel;
import com.example.personalstorage.Storage.presenter.SupplyMethods.SupplyMethods;
import com.example.personalstorage.Storage.view.IStorageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Storage implements IStorage {

    private static final String TAG = "Storage";

    IStorageView storageView;
    SupplyMethods supplyMethods;
    StorageModel currentStorage;


    public Storage(IStorageView storageView, SupplyMethods supplyMethods) {
        this.storageView = storageView;
        this.supplyMethods = supplyMethods;
    }

    @Override
    public void loadData(String title) {
        String id = "ASDFGHJIU11";
        List<ItemModel> items = new ArrayList<>();
        for(int i =0; i < 5; i++) {
            Deque<HashMap<String, String>> deque = new LinkedList<HashMap<String, String>>();
            ItemModel newItem = new ItemModel(id + i, "Item #" + i, deque);
            items.add(newItem);
        }

        currentStorage = new StorageModel(title, id, items);
    }

    @Override
    public void onCreateItem(String itemTitle) {
        String id = UUID.randomUUID().toString();
        Deque<HashMap<String, String>> deque = new LinkedList<HashMap<String, String>>();
        Log.d(TAG, "onCreateItem: " + itemTitle + " " + id);
        ItemModel newItem = new ItemModel(id, itemTitle, deque);
        currentStorage.addItem(newItem);

    }

    @Override
    public ArrayList<String> showItems() {
        List<ItemModel> items = currentStorage.getItems();
        ArrayList<String> toReturnList = new ArrayList<String>();
        for (int i = 0; i < items.size(); i++) {
            toReturnList.add(items.get(i).getTitle());
        }
        return toReturnList;
    }

    @Override
    public void onDeleteItem(int pos) {

    }

    @Override
    public void onEditItem(int pos) {

    }
}
