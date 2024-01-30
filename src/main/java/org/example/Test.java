package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);


        List<String> collect = arrayList.stream()
                .filter(s -> s > 1)
                .map(x -> x + " test")
                .map(x -> x +"s")
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
