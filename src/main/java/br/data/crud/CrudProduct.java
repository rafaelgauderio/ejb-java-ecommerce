package br.data.crud;

import br.data.model.Product;
import java.util.ArrayList;

/**
 *
 * @author rafael de Luca
 */
public class CrudProduct {
    
    public ArrayList <Product>  getAllProducts () {
        
        ArrayList productsList = new ArrayList<Product>();
        productsList.add(new Product(1, "8 gig ram memory"));
        productsList.add(new Product(2, "16 gig ram memory"));
        productsList.add(new Product(3, "hd ssd 120 gigabytes"));
        productsList.add(new Product(4, "core i5 processor"));
        productsList.add(new Product(5, "core i9 processor"));
        productsList.add(new Product(6, "inter motherboard"));
        
        return productsList;
    }
}
