package com.example.personalstorage.Storage.model;

import com.example.personalstorage.Item.model.ItemModel;

import java.util.List;

public class StorageModel implements IStorageModel {

    private String title, id;
    private List<ItemModel> items;

    public StorageModel(String title, String id, List<ItemModel> items) {
        this.title = title;
        this.id = id;
        this.items = items;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public List<ItemModel> getItems() {
        return items;
    }

    @Override
    public void addItem(ItemModel item) {
        items.add(item);
    }
}
