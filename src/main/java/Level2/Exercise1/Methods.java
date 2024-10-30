package Level2.Exercise1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Methods {

    public ArrayList<String> ex1(ArrayList<String> list){
        return (ArrayList<String>) list.stream().filter(i -> i.startsWith("A")&&i.length()==3).collect(Collectors.toList());
    }



}
