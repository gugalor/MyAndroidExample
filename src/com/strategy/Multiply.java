package com.strategy;

/**
 * Created by Administrator on 2015/8/31.
 */
public class Multiply extends ABstractCalculator implements Icalculator{
    public int calculate(String rap){
        int arrayint[]=split(rap,"x");
        return arrayint[0]*arrayint[1];
    }
}