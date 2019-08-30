package com.example.personalstorage.Item.model;

import java.util.Deque;
import java.util.HashMap;

public interface IItemModel {

    String getTitle();

    String getId();

    Deque<HashMap<String, String>> getSupplies();
}
