package Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public List<String> ex1(ArrayList<String> list){
        return list.stream().filter(i -> i.contains("o")).collect(Collectors.toList());
    }

    public List<String> ex2(ArrayList<String> list){
        return list.stream().filter(i -> i.length()>5&&i.contains("o")).collect(Collectors.toList());
    }

    public void ex3(ArrayList<String> list){
        list.forEach(i ->System.out.println(i));
    }
}
