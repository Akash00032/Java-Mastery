package level01.basics;

public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // =========================
        // 1. Arithmetic Operators
        // =========================
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // =========================
        // 2. Assignment Operators
        // =========================
        System.out.println("\nAssignment Operators");

        int x = 10;

        x += 5;
        System.out.println("x += 5 : " + x);

        x -= 3;
        System.out.println("x -= 3 : " + x);

        x *= 2;
        System.out.println("x *= 2 : " + x);

        x /= 4;
        System.out.println("x /= 4 : " + x);

        x %= 2;
        System.out.println("x %= 2 : " + x);

        // =========================
        // 3. Relational Operators
        // =========================
        System.out.println("\nRelational Operators");

        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // =========================
        // 4. Logical Operators
        // =========================
        System.out.println("\nLogical Operators");

        boolean p = true;
        boolean q = false;

        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));

        // =========================
        // 5. Unary Operators
        // =========================
        System.out.println("\nUnary Operators");

        int count = 5;

        System.out.println("count     : " + count);
        System.out.println("++count   : " + (++count));
        System.out.println("--count   : " + (--count));
        System.out.println("count++   : " + (count++));
        System.out.println("After count++ : " + count);
        System.out.println("count--   : " + (count--));
        System.out.println("After count-- : " + count);

        // =========================
        // 6. Ternary Operator
        // =========================
        System.out.println("\nTernary Operator");

        int age = 23;

        String result = (age >= 18) ? "Adult" : "Minor";

        System.out.println(result);

        // =========================
        // 7. Bitwise Operators
        // =========================
        System.out.println("\nBitwise Operators");

        int m = 5; // 0101
        int n = 3; // 0011

        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("~m    = " + (~m));

        // =========================
        // 8. Shift Operators
        // =========================
        System.out.println("\nShift Operators");

        System.out.println("m << 1 = " + (m << 1));
        System.out.println("m >> 1 = " + (m >> 1));

        // =========================
        // 9. instanceof Operator
        // =========================
        System.out.println("\ninstanceof Operator");

        String name = "Akash";

        System.out.println(name instanceof String);
    }
}