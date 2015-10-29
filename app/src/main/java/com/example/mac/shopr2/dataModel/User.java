package com.example.mac.shopr2.dataModel;

import java.util.LinkedList;

/**
 * Created by Christian on 29-10-2015.
 */
public class User {
    private String name;
    private String userId;
    private LinkedList<ShopList> ownShoppingLists;

    public User(){

    }
    public User(String userId){
        this.userId=userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LinkedList<ShopList> getOwnShoppingLists() {
        return ownShoppingLists;
    }

    public void setOwnShoppingLists(LinkedList<ShopList> ownShoppingLists) {
        this.ownShoppingLists = ownShoppingLists;
    }
}
