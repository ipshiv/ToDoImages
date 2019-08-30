package ru.yrli.test.todoimage;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class Storage {

    private static final String TAG = "Storage";
    

    public String id;
    public String title;

    private Product product;

    private ArrayList<Product> Products;

    private SupplyMethods supplyMethods;

    @Inject
    public Storage(SupplyMethods supplyMethods) {
        //this.id = id;
        //this.title = title;
        this.supplyMethods = supplyMethods;

    }

    private boolean checkdate(String sDate) {

        Date dateProduct = null;
        try {
            dateProduct=new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date dateCurrent = new Date();
        return dateCurrent.before(dateProduct);

    }

    // private void calcTotalItemValue() {}

    public void popSupply() {
        supplyMethods.popSupply();
    }

    public void pushSupply(Object supply) {
        supplyMethods.pushSupply(supply);
    }

    public void changeItemValue(Object Item, int delta) {
        supplyMethods.changeItemValue(Item, delta);

    }

    public void popItem(int pos, Object item) {

    }

    public void pushItem(Object item) {

    }

    public void loadItems() {

        Log.d(TAG, "loadItems: Data loaded...");

        /*
        List<String> titles = uplodaItemTiteslFromDB();
        for(String title : titles) {
            ArrayList<String[]> supplies = uploadSuppliesFromDB(title);
            boolean overBudget = checkOverBudget();
            Map<String, String> supplyData = new HashMap<String, String>();
            int totalQuantity = 0;
            Iterator<String[]> iter = supplies.iterator();
            boolean expired = false;
            while (iter.hasNext()){
                String[] supply = iter.next();
                supplyData.put("date", supply[0]);
                expired |= checkdate(supply[0]);
                supplyData.put("quantity", supply[1]);
                totalQuantity += Integer.parseInt(supply[1]);
                supplyData.put("price", supply[2]);
            Object[] itemData = new Object[]{title, totalQuantity, supplyData, overBudget, expired};
            this.Items.add(itemData);

            }
        }

         */



    }

    public boolean checkOverBudget() {
        return false;
    }


}
