package ru.yrli.test.todoimage;

import java.util.ArrayList;

public abstract class Storage {

    public int id;
    public int title;
    public int total;

   // private ArrayList<Object> SupplyChains;

    private ArrayList<Object> Items;

    SupplyMethods supplyMethods;

    private void markExpired() {}
    private void calcTotalItemValue() {}

    public void popSupply() {
        supplyMethods.popSupply();
    }

    public void pushSupply(Object supply) {
        supplyMethods.pushSupply(supply);
    }

    public void changeItemValue(Object Item, int delta) {

    }

    public void popItem(int pos, Object item) {

    }

    public void pushItem(Object item) {

    }

    public void loadItems() {}

    public void checkOverBudget() {}


}
