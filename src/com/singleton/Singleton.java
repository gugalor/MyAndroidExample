package com.singleton;

/**
 * Created by Administrator on 2015/8/29.
 */
public class Singleton {
    private Singleton(){};
    private static Singleton instance=null;
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
