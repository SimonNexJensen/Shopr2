package com.example.mac.shopr2.dataModel;

/**
 * Created by Christian on 29-10-2015.
 */
public class ShopListItem {


    private String name;
    private String brand;
    private int quantity;

    /**
     * Default Constructor for deserialization
     */
    public ShopListItem(){

    }

    public ShopListItem(String name, int quantity)
    {
        this.name=name;
        this.quantity=quantity;
    }
    //Mutators
    public int increase(){
        return ++quantity;
    }

    public int decrease(){
        return --quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
