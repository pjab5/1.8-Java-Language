package Level1;

import Level1.Exercise5.Pi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> months = new ArrayList<>(List.of("January","February","March","April","May","June","July","August","September","October","November","December"));
        Methods method = new Methods();
        list.add("oneone");
        list.add("two");
        list.add("three");
        list.add("foura");
        list.add("five");
        list.add("six");
        list.add("seven");
        System.out.println(method.ex1(list));
        System.out.println(method.ex2(list));
        months.forEach(i -> System.out.println(i));
        System.out.println("\n");
        method.ex3(months);
    }
}