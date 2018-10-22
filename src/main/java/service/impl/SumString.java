package service.impl;

import service.CountValue;

public class SumString implements CountValue<String, String> {
    @Override
    public String count(String a, String b) {
        return a+b;
    }
}
