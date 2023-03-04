package agarere.w003.logicaloperators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("[ 3 == 5 ] -> " + (3 == 5));
        System.out.println("[ 3 != 5 ] -> " + (3 != 5));
        System.out.println("[ 3 == 3 ] -> " + (3 == 3));
        System.out.println("[ 3 > 5 ] -> " + (3 > 5));
        System.out.println("[ 3 < 5 ] -> " + (3 < 5));
        System.out.println("[ hello == hello ] -> " + ("hello" == "hello"));

        System.out.println("[ (3 == 5) || (3 != 5) ] -> " + ((3 == 5) || (3 != 5)));
        System.out.println("[ (3 == 5) && (3 != 5) ] -> " + ((3 == 5) & (3 != 5)));
        System.out.println("[ !true ] -> " + !(true));
    }
}
