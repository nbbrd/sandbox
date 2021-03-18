package nbbrd.sandbox.impl;

import nbbrd.sandbox.SomeService;

public class SomeServiceImpl implements SomeService {

    @Override
    public void say(String text) {
        System.out.println(text);
    }
}
