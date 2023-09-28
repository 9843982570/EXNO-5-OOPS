package pack1;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
package pack2;

public class StringOperations {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
package pack3;

public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public String divide(int a, int b) {
        if (b == 0) {
            return "Cannot divide by zero.";
        }
        return String.valueOf((double) a / b);
    }
}
package mathematics;
import pack1.MathOperations;
import pack2.StringOperations;
import pack3.Calculator;
public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        StringOperations stringOps = new StringOperations();
        Calculator calculator = new Calculator();

        int result1 = math.add(10, 5);
        int result2 = math.subtract(10, 5);
        String result3 = stringOps.concatenate("Hello, ", "World!");
        String result4 = stringOps.reverse("OpenAI");
        int result5 = calculator.multiply(6, 7);
        String result6 = calculator.divide(10, 2);
        String result7 = calculator.divide(5, 0);

        System.out.println("Result of addition: " + result1);
        System.out.println("Result of subtraction: " + result2);
        System.out.println("Concatenated string: " + result3);
        System.out.println("Reversed string: " + result4);
        System.out.println("Result of multiplication: " + result5);
        System.out.println("Result of division (10 / 2): " + result6);
        System.out.println("Result of division (5 / 0): " + result7);
    }
}
