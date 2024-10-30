package Level2.Exercise4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public List<String> orderAlphabetically(ArrayList<Object> list){
        return list.stream().map(Object::toString).sorted(String::compareTo).collect(Collectors.toList());
    }
    public List<String> eFirst(ArrayList<Object> list){
        return list.stream().map(Object::toString).sorted(Comparator.comparing((String i)->!i.startsWith("e")).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
    }
    public List<String> aSubstitution(ArrayList<Object> list){
        return list.stream().map(i->i.toString().replace("a","4")).sorted(String::compareTo).collect(Collectors.toList());
    }
    public List<Object> onlyNumeric(ArrayList<Object> list){
        return list.stream().filter(i->i instanceof Number).collect(Collectors.toList());
    }

}
