package service.impl;

import service.CountValue;

/**
 * Will write later......................
 */
public class SumString implements CountValue<String, String> {
    @Override
    public String count(String a, String b) {
        return a+b;
    }
}
