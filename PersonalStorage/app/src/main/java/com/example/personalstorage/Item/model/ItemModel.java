package com.example.personalstorage.Item.model;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

public class ItemModel implements IItemModel {

    private String id, title;
    private Deque<HashMap<String, String>> supplyList;

    public ItemModel(String id, String title, Deque<HashMap<String, String>> supplyList) {
        this.id = id;
        this.title = title;
        this.supplyList = supplyList;
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
    public Deque<HashMap<String, String>> getSupplies() {
        return supplyList;
    }
}
