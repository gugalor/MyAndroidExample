package com.Iterator;

/**
 * Created by Administrator on 2015/5/22.
 */
public class MyCollection implements Collection {
    public String string[]={"A","B","C","D","E"};
    @Override
    public Iterator iterator(){
        return new MyIterator(this);
    }
    public Object get(int i){
        return string[i];
    }
    public int size(){
        return string.length;
    }
}
