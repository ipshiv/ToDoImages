package com.example.personalstorage.Storage.presenter;

import android.view.View;

import com.example.personalstorage.Item.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public interface IStorage {

    void loadData(String title);
    void onCreateItem(String itemTitle);
    ArrayList<String> showItems();
    void onDeleteItem(int pos);
    void onEditItem(int pos);
}
