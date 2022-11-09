package nbbrd.sandbox.impl;

import lombok.AccessLevel;
import lombok.Builder;

import java.util.List;

@lombok.Value
@lombok.Builder
public class SomeClass {

    @lombok.NonNull
    @Builder.Default
    String key = "123";

    @lombok.Singular
    List<Item> items;

    public static void main(String[] args) {
        System.out.println(
                SomeClass
                        .builder()
                        .key("abc")
                        .item(new Item(1, 3))
                        .item(new Item(3, 1))
                        .build()
        );
    }

    @lombok.AllArgsConstructor(access = AccessLevel.PRIVATE)
    @lombok.EqualsAndHashCode
    public static class Item {
        final int x;
        final int y;
    }
}
