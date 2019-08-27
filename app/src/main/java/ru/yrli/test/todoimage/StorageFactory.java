package ru.yrli.test.todoimage;

import java.util.ArrayList;
import java.util.UUID;

public class StorageFactory {

    private ArrayList<Storage> Storages;

    public Storage createStorage(StorageType type, String title) {
        Storage toReturn = null;
        switch (type) {
            case LIFO:
                toReturn = new LifoStorage();
                break;
            case FIFO:
            default:
                toReturn = new FifoStorage();
                break;
        }
        toReturn.id = UUID.randomUUID().toString();
        toReturn.title = title;
        this.Storages.add(toReturn);
        return toReturn;
    }

    public void destroyStorage() {}

    public void getAllStorages() {}

    public void getCurrentStorage() {}

    public void loadStoragesData() {
        ArrayList<Storage> storages = uploadStoragesFromDB();
        for Storage storage in storages:
            storage.loadItems();

    }




}