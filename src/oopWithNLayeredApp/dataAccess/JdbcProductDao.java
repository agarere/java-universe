package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// sadece db erişim kodları buraya yazılır
// aslında ProdcutDao nun kurallarına uymak zorundasın
public class JdbcProductDao implements ProductDao {
    public void add (Product product) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
