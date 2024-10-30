package Level2.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Pep","Laura","Ana","Mateo","Noa","Alberto","Nicolás","Abe"));
        Methods methods = new Methods();
        System.out.println(methods.ex1(names));
    }
}
