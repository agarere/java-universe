package oopWithNLayeredApp.bussiness;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {

    /* Buna loosely coupling -> gevşek bağlılık denir.
     * Classa bağımlılık ortadan kalkıyor.
     * Product managerı kim new yapacaksa, productDao impl o düşünecek.
     */
    private ProductDao productDao;
    private List<Logger> loggers;

    // Product managerı kim new yapacaksa, productDao impl o düşünecek.
    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add (Product product) throws Exception {
        // iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }

        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName() + " ürünü eklendi");
        }
    }

    // bir katman başka bir katmanın classını kullanması gerektiği zaman onun interfaceini kullanmalıdır classı değil !
}
