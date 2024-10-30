package Level1.Exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(List.of(156668,23,"on","two","three",3,"five"));
        System.out.println(list.stream().map(Object::toString).sorted((a,b)->Integer.compare(b.length(),a.length())).collect(Collectors.toList()));
    }
}
