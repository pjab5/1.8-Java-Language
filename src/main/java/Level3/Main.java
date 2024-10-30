package Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John",9,"JAVA",8));
        students.add(new Student("anne",15,"PHP",7));
        students.add(new Student("Peter",11,"ANGULAR",6));
        students.add(new Student("Paul",32,"REACT",10));
        students.add(new Student("Mary",13,"ANGULAR",2));
        students.add(new Student("albert",34,"NODE",5));
        students.add(new Student("Saoirse",35,"JAVA",3));
        students.add(new Student("Fred",36,"ANGULAR",4));
        students.add(new Student("Trin",20,"PHP",7));
        students.add(new Student("Joseph",38,"NODE",8));

        students.forEach(i->System.out.println(i.toString()));
        System.out.println(students.stream().filter(i->i.getName().startsWith("a")).collect(Collectors.toList()));
        System.out.println(students.stream().filter(i->i.getGrade()>=5).collect(Collectors.toList()));
        System.out.println(students.stream().filter(i->i.getGrade()>=5&& !Objects.equals(i.getCourse(), "PHP")).collect(Collectors.toList()));
        System.out.println(students.stream().filter(i->i.getAge()>=18&& Objects.equals(i.getCourse(),"JAVA")).collect(Collectors.toList()));
    }
}
