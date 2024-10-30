package Level2.Exercise3;

public class Main {
    public static void main(String[] args) {
        Operation addition = (a,b) -> a + b;
        Operation subtraction = (a,b) -> a - b;
        Operation multiplication = (a,b) -> a * b;
        Operation division = (a,b) -> a/b;
        System.out.println(addition.operation(158,68));
        System.out.println(subtraction.operation(333,77));
        System.out.println(multiplication.operation(64,25));
        System.out.println(division.operation(864,3));
        }
    }

