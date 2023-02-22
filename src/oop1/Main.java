package oop1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(3);
        product1.setImageUrl("blabla.png");

        Product product2 = new Product();
        product2.setName("Arçelik Kahve Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitInStock(3);
        product2.setImageUrl("blabla.png");

        Product[] products = {product1, product2};

        for (Product product : products) {
            System.out.println("product name: " + product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("5555555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Ediz");
        individualCustomer.setLastName("Agarer");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("1111111");
        corporateCustomer.setPhone("5555555");
        corporateCustomer.setCompanyName("abc");
        corporateCustomer.setTaxNumber("54123");

        Customer[] customers = {individualCustomer, corporateCustomer};

    }
}