package com.example.mac.shopr2.dataModel;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

/**
 * @author Christian on 29-10-2015.
 */
public class DbController implements IDbController {
    public static final String ACTIVE_SHOP_LIST = "activeShopList";
    public static final String USERS = "Users";
    private static final String SHOPPINGLISTS = "ShopLists";
    private final SharedPreferences prefs;
    private Firebase fireBase;
    private ShopList activeShopList;
    private User user;

    private static DbController instance;




    /**
     * Singleton - Get Singleton Instance
     * @return SingleTon instance
     */
    public synchronized static DbController getI(Activity a){
        if (instance == null) instance = new DbController(a);
        return instance;
    }
    //Support for old android versions
    public synchronized static DbController getI(AppCompatActivity a) {
        if (instance == null) instance = new DbController(a);
        return instance;
    }

    /**
     * Private Constructor - Singleton class
     */
    public DbController(Activity a) {
        prefs = PreferenceManager.getDefaultSharedPreferences(a);
        init(a);
    }
    //Support for OLD android versions
    private DbController(AppCompatActivity a){
        prefs = PreferenceManager.getDefaultSharedPreferences(a);
        init(a);
    }
    private void init(Activity a) {
        Firebase.setAndroidContext(a);
        fireBase= new Firebase("https://shop-r.firebaseio.com/");
        //resolve User
        AccountManager manager = (AccountManager) a.getSystemService(Context.ACCOUNT_SERVICE);
        Account[] list = manager.getAccountsByType("com.google");
        if (list[0]!=null) {
            user = new User(list[0].name);
        }
        else {
            user = new User("" + Settings.Secure.getString(a.getContentResolver(), Settings.Secure.ANDROID_ID));
        }

        //Determine activeShoplist
    }



    @Override
    public ShopList newShopList(String name) {
       throw  new NotImplementedException(this.getClass() + "newShopList");
    }

    @Override
    public void setActiveShopList(ShopList shopList) {
        throw new NotImplementedException(this.getClass() + "setActiveShopList");
    }
    @Override
    public void testDB(String testString){
       fireBase.child("testMessage").setValue(testString);
    }

    //Low level DB access
    @Override
    public void setValueforKey(String key, Object object){
        fireBase.child(key).setValue(object);

    }

    @Override
    public void listenToKey(String key, ValueEventListener listener) {
        fireBase.child(key).addValueEventListener(listener);
    }



}
