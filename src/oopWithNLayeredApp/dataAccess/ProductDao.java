package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// interfaceler sadece method imzasını bulundurabilir
public interface ProductDao {
    void add(Product product);
}

// ProductDao için birden fazla alternatif olduğu durumda interface kullanırsın
//
