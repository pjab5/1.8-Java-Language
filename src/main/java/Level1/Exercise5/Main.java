package Level1.Exercise5;

import Level1.Methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pi pi = (double x) -> x;
        System.out.println(pi.getPiValue(3.1415));
        ArrayList<Object> list1 = new ArrayList<>(List.of("abcde",2,"abc","ab",4,"abcd",5.5,"a"));
    }
}