package level01.basics;

public class TypeCastingDemo {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int num = 100;
        double d = num;

        System.out.println("Implicit Type Casting");
        System.out.println("int -> double : " + d);

        // Explicit Type Casting (Narrowing)
        double cgpa = 6.83;
        int cgpaInt = (int) cgpa;

        System.out.println("\nExplicit Type Casting");
        System.out.println("double -> int : " + cgpaInt);

        // char -> int
        char grade = 'A';
        int ascii = grade;
        System.out.println("char -> int : " + ascii);

        // int -> char
        int code = 66;
        char letter = (char) code;
        System.out.println("int -> char : " + letter);

        // float -> int
        float percentage = 69.5f;
        int perInt = (int) percentage;
        System.out.println("float -> int : " + perInt);

        // long -> int
        long mobile = 9910360596L;
        int mobileInt = (int) mobile;
        System.out.println("long -> int : " + mobileInt);
    }
}