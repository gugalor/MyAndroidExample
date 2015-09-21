package com.strategy;

/**
 * Created by Administrator on 2015/5/22.
 */
public class StrategyTest {

void test() {
    String exp = "8+8";
    Icalculator cal = new Plus();
    int result = cal.calculate(exp);
    System.out.println(result);

}
}
