package com.example.mac.shopr2.dataModel;

/**
 * Created by Christian on 29-10-2015.
 */
public class NotImplementedException extends Error {

    public NotImplementedException(String msg){
        super("Not implemented: " + msg);
    }
}
