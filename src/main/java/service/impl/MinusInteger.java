package service.impl;

import service.CountValue;

public class MinusInteger implements CountValue<Integer, Integer> {

    @Override
    public Integer count(Integer a, Integer b) {
        return a-b;
    }
}
