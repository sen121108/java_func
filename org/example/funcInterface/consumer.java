package org.example.funcInterface;

import java.util.*;
import java.util.function.Consumer;

public class consumer {
    // リストの作成
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    // Consumerの作成
    Consumer<Integer> square = n -> System.out.println(n * n);

    // リストの各要素に対して、Consumerを適用する
//    numbers.forEach(square);
}
