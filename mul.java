import java.util.*;

interface one {
    int add(int a, int b);
}

interface two {
    int multiply(int a, int b);
}

class three implements one, two {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class mul {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        three obj = new three();

        System.out.print("Enter first number: ");
        int x = s.nextInt();

        System.out.print("Enter second number: ");
        int y = s.nextInt();

        System.out.println("--------------------------------------------------");
        System.out.println("Addition: " + obj.add(x, y));
        System.out.println("Multiplication: " + obj.multiply(x, y));

        s.close();
    }
}
