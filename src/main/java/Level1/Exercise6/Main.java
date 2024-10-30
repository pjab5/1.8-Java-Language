package Level1.Exercise6;

import Level2.Exercise4.Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(List.of(156668,2,"one","two","four","three",3,4,5,"five"));
        System.out.println(list.stream().map(Object::toString).sorted((a,b)->Integer.compare(a.length(),b.length())).collect(Collectors.toList()));
    }
}
