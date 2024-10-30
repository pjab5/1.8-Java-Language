package Level3;

public class Student {
    private String name;
    private int age;
    private String course;
    private int grade;

    public Student(String name, int age, String course, int grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name +
                " (" + age +
                ")";
    }
}
