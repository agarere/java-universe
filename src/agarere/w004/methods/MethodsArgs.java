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
         *  primitive type olanlar??n value'su parametreye ge??er.
         *  non-primitive/reference type olanlar??n reference'?? parametreye ge??er.
         *  method arg??manlar?? o method i??inde kullan??lmak ??zere tan??mlan??r.
         *  method arg??manlar?? ??zerinde manip??lasyon yap??ld?????? zaman sadece o method i??inde ge??erli olacakt??r.
         *  methoda ge??ilen parametre de??i??meyecektir.
         *  Ama reference type olan arg??manlar??n kendi methodlar??na ula????labildi??i i??in,
         *  o referans??n i??indeki fieldlar?? set yapabilirsin.
         *  arg??mandaki reference type olan de??i??kene yeni bir referance new'lesen bile
         *  o sadece method i??inde de??i??ecektir. Method d??????ndan verilen parametre(reference type de??i??ken) de??i??meyecektir.
         *  ??zetle:
         *      - primitive -> value de??eri methodun arg??man??na verilir.
         *      - reference type -> reference/pointer'?? methodun arg??man??na verilir.
         *                          - ama method i??inde new'lenerek bu arg??man??n g??sterdi??i yer ezilemez.
         *                          - sadece o arg'n??n methodlar??na veya fieldlar??na eri??im sa??layarak de??i??iklik yap??labilir.
         *
         */
    }
}
