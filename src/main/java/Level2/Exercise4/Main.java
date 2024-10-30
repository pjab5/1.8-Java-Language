package Level2.Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        ArrayList<Object> list = new ArrayList<>(List.of("Hello",74,"easports","How are you","energy",95.2,35,"zzza",1,"yeah","abcde","elliot"));
        System.out.println(methods.orderAlphabetically(list));
        System.out.println(methods.eFirst(list));
        System.out.println(methods.aSubstitution(list));
        System.out.println(methods.onlyNumeric(list));
    }
}
