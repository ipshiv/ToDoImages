package com.example.personalstorage.Storage.model;

import com.example.personalstorage.Item.model.ItemModel;

import java.util.Deque;
import java.util.List;

public interface IStorageModel {

    String getTitle();

    String getId();

    List<ItemModel> getItems();

    void addItem(ItemModel item);
}
