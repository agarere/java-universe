package agarere.w004.methods;

public class MethodOverloading {
    public static int sum(int a, int b) {
        return (a + b);
    }

    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        System.out.println("[ 1 + 2 ] " + sum(1, 2));
        System.out.println("[ 1 + 2 + 3 ] " + sum(1, 2, 3));
    }
}
