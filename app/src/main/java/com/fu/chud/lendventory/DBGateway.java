package com.fu.chud.lendventory;

import java.util.ArrayList;

/**
 * Created by Chad on 9/26/2015.
 */
public class DBGateway {
    private static DBGateway thisDBGateway = null;

    private ArrayList<Item> items = null;
    private ArrayList<Contact> contacts = null;

    public static DBGateway getThisDBGateway()
    {
        if (thisDBGateway == null){
            thisDBGateway = new DBGateway();
            thisDBGateway.items = new ArrayList<Item>();
        }
        return thisDBGateway;
    }

    private DBGateway(){
    }

    public void addI(Item i){
        items.add(i);
    }

    public void addC(Contact c){
        contacts.add(c);
    }

}
/*
 public class ItemGateway {
    private static ItemGateway ourInstance = null;

    private ArrayList<Item> items = null;

    public static ItemGateway getInstance()
    {
        if (ourInstance == null) {
            ourInstance = new ItemGateway();
            ourInstance.items = new ArrayList<Item>();
        }
        return ourInstance;
    }

    private ItemGateway() {
    }

    public void add(Item i) {
        items.add(i);
    }

    public String getImageFileName(String label) {
        for (Item i : items) {
            if (i.imageLabel.equals(label))
                return i.imageFileName;
        }
        // Probably better to throw an exception here, but I want
        //   to keep the example simple.
        return "<not found>";
    }
}
 */