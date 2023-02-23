package oopWithNLayeredApp;

import oopWithNLayeredApp.bussiness.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "IPhone X", 100);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), List.of(loggers));
        productManager.add(product1);
    }

}
