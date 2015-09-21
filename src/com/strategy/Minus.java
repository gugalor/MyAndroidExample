package com.strategy;

/**
 * Created by Administrator on 2015/5/22.
 */
public class Minus extends ABstractCalculator implements Icalculator {
    public int calculates(String exp){
        int arrayInt[]=split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
    public int calculate(String exp){
        int arrayInt[] =split(exp,"\\-");
        return arrayInt[0]-arrayInt[1];
    }
}
