package br.ejb;

import br.data.crud.CrudProduct;
import br.data.model.Product;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author rafael de Luca
 */
@Stateless
public class EbjProduct {
    
    public ArrayList<Product> getAllProducts () {
        return new CrudProduct().getAllProducts();
    }
    
}
