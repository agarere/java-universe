package agarere.w004.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsArgs {
    public static void doSomething(Product product, StringBuilder s, String name, int value, int[] myArray, ArrayList<String> cars) {
        System.out.println("[ doSomething ][ s ]: " + s);
        System.out.println("[ doSomething ][ name ]: " + name);
        System.out.println("[ doSomething ][ value ]: " + value);
        System.out.println("[ doSomething ][ product.name ]: " + product.name);
        System.out.println("[ doSomething ][ product.value ]: " + product.value);
        System.out.println("[ doSomething ][ myArray ]: " + Arrays.toString(myArray));
        System.out.println("[ doSomething ][ cars ]: " + cars.toString());
        s.append("xxxxx");
        name = new String("xxxxx");
        name = name.replace("o", "a");
        value = 0;
        product.name = "xxxxx";
        product.value = 0;
        product = new Product("araba", 999);
        System.out.println("[ doSomething ][ new ][ product.name ]: " + product.name);
        System.out.println("[ doSomething ][ new ][ product.value ]: " + product.value);
        myArray = new int[]{0, 0, 0};
        cars.add("xxxxx");
    }

    public static void main(String[] args) {
        Product product = new Product("phone", 100);

        StringBuilder s = new StringBuilder("Hello");
        String name = "foo";
        int value = 5;
        int[] myArray = new int[]{1, 2, 3};
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");

        System.out.println("[ before ][ s ]: " + s);
        System.out.println("[ before ][ name ]: " + name);
        System.out.println("[ before ][ value ]: " + value);
        System.out.println("[ before ][ product.name ]: " + product.name);
        System.out.println("[ before ][ product.value ]: " + product.value);
        System.out.println("[ before ][ myArray ]: " + Arrays.toString(myArray));
        System.out.println("[ before ][ cars ]: " + cars.toString());

        System.out.println("*****************");

        doSomething(product, s, name, value, myArray, cars);

        System.out.println("*****************");

        System.out.println("[ after ][ s ]: " + s);
        System.out.println("[ after ][ name ]: " + name);
        System.out.println("[ after ][ value ]: " + value);
        System.out.println("[ after ][ product.name ]: " + product.name);
        System.out.println("[ after ][ product.value ]: " + product.value);
        System.out.println("[ after ][ myArray ]: " + Arrays.toString(myArray));
        System.out.println("[ after ][ cars ]: " + cars.toString());

        /** notes:
         *  primitive type olanların value'su parametreye geçer.
         *  non-primitive/reference type olanların reference'ı parametreye geçer.
         *  method argümanları o method içinde kullanılmak üzere tanımlanır.
         *  method argümanları üzerinde manipülasyon yapıldığı zaman sadece o method içinde geçerli olacaktır.
         *  methoda geçilen parametre değişmeyecektir.
         *  Ama reference type olan argümanların kendi methodlarına ulaşılabildiği için,
         *  o referansın içindeki fieldları set yapabilirsin.
         *  argümandaki reference type olan değişkene yeni bir referance new'lesen bile
         *  o sadece method içinde değişecektir. Method dışından verilen parametre(reference type değişken) değişmeyecektir.
         *  Özetle:
         *      - primitive -> value değeri methodun argümanına verilir.
         *      - reference type -> reference/pointer'ı methodun argümanına verilir.
         *                          - ama method içinde new'lenerek bu argümanın gösterdiği yer ezilemez.
         *                          - sadece o arg'nın methodlarına veya fieldlarına erişim sağlayarak değişiklik yapılabilir.
         *
         */
    }
}
