package level01.basics;

public class VariablesDemo {
    public static void main(String[] args) {

        // String
        String studentName = "Akash";
        String rollNumber = "A010145023241";
        String collegeName = "Amity University";
        String email = "aakashkumar572@gmail.com";

        // Integer Types
        byte age = 23;
        short graduationYear = 2026;
        int semester = 4;
        long mobileNumber = 9910360596L;

        // Decimal Types
        float percentage = 68.3f;
        double cgpa = 6.83;

        // Character Type
        char grade = 'A';

        // Boolean Type
        boolean isPlaced = false;

        // Print Values
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("College Name : " + collegeName);
        System.out.println("Email        : " + email);

        System.out.println("Age          : " + age);
        System.out.println("Graduation   : " + graduationYear);
        System.out.println("Semester     : " + semester);
        System.out.println("Mobile No    : " + mobileNumber);

        System.out.println("Percentage   : " + percentage);
        System.out.println("CGPA         : " + cgpa);

        System.out.println("Grade        : " + grade);
        System.out.println("Placed       : " + isPlaced);
    }
}