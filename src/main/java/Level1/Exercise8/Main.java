package Level1.Exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Reverse reverse = (s)-> Stream.of(s.split("")).reduce("",(a,b)->b+a);
        System.out.println(reverse.reverse("howareyoudoing"));
    }
}
