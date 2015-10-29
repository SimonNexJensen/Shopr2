package com.example.mac.shopr2.dataModel;


/**
 * @author Christian on 29-10-2015.
 */
public interface IDbController {

   ShopList newShopList(String name);
    void setActiveShopList(ShopList shopList);

    void testDB();
}
