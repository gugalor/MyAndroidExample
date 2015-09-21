package com.strategy;

/**
 * Created by Administrator on 2015/5/22.
 */
public class Plus extends ABstractCalculator implements Icalculator {
    public int calculate(String exp){
        int arrayInt[]=split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
