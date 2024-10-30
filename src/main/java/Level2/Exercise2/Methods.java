package Level2.Exercise2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Methods {


    public String ex2(ArrayList<Integer> list){
        return list.stream().map(i->i%2==0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
    }


}
