package nbbrd.sandbox.impl;

import lombok.Builder;

@lombok.Value
@lombok.Builder
public class SomeClass {

    @lombok.NonNull
    @Builder.Default
    String key = "123";

    public static void main(String[] args) {
        System.out.println(SomeClass.builder().key("abc").build());
    }
}
