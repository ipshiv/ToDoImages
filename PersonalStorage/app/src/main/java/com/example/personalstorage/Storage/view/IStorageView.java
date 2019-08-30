package com.example.personalstorage.Storage.view;

import android.view.View;

import com.example.personalstorage.Item.model.ItemModel;

import java.util.List;

public interface IStorageView {

    void showLoading();
    void hideLoading();
    void onCreateItemResult(String message);
    void onDeleteItemResult(String message);
    void showEditItemDialog(ItemModel item);

}
