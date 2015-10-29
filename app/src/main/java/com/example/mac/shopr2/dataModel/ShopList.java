package com.example.mac.shopr2.dataModel;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Christian on 29-10-2015.
 */
public class ShopList {
    private String name;
    private LinkedList<ShopListItem> items;

    /**
     * Default Constructor for deserialization
     */
    public ShopList(){
    }
    public ShopList(String name){
        this.name=name;
        items = new LinkedList<>();
    }

    //Mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LinkedList<ShopListItem> getItems(){
        return items;
    }
    public void setItems(LinkedList<ShopListItem> items){
        this.items = items;
    }
    public void addItemLast(ShopListItem item){
        items.add(item);
    }
    public void addItemBeforeIndex(int index, ShopListItem item){
        items.add(index,item);
    }
    public void addItemAfter(ShopListItem item, ShopListItem itemBefore){
        items.add(items.indexOf(itemBefore),item);
    }
    public boolean removeItem(ShopListItem item){
        return items.remove(item);
    }

}
