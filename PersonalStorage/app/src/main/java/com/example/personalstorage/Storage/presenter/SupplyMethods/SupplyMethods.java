package com.example.personalstorage.Storage.presenter.SupplyMethods;

public interface SupplyMethods {

    void popSupply();

    void pushSupply(Object supply);

    void changeItemValue(Object Supply, int delta);
}
