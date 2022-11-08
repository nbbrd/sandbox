package nbbrd.sandbox.impl;

@lombok.Value
@lombok.Builder
public class SomeClass {

    @lombok.NonNull
    String key;

    public static void main(String[] args) {
        System.out.println(SomeClass.builder().key("abc").build());
    }
}
