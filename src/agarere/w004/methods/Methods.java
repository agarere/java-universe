package agarere.w004.methods;

public class Methods {

    public static void sayHello() {
        System.out.println("[ sayHello() ] Hello !");
    }

    public static void saySomething(String message) {
        System.out.println("[ saySomething(String message) ] " + message);
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        sayHello();
        saySomething(String.valueOf(sum(5, 5)));
    }
}
