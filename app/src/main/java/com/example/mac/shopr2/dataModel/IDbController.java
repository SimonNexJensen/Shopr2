package com.example.mac.shopr2.dataModel;


import com.firebase.client.ValueEventListener;

/**
 * @author Christian on 29-10-2015.
 */
public interface IDbController {

   ShopList newShopList(String name);
    void setActiveShopList(ShopList shopList);
    void testDB(String testString);

    //Low level access
    void setValueforKey(String key, Object object);
    void listenToKey(String key, ValueEventListener listener);
}
