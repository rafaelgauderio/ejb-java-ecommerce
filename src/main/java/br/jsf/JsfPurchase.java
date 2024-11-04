
package br.jsf;

import br.data.model.ItemPurchase;
import br.data.model.Product;
import br.ejb.EjbPurchase;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;

/**
 *
 * @author Rafael de Luac
 */
@Named(value = "jsfPurchase")
@SessionScoped
public class JsfPurchase implements Serializable {

    @EJB
    private EjbPurchase ejbPurchase;    
    
    public JsfPurchase() {
                
    }
    
    public void addProduct(Product product) {
        ejbPurchase.addProduct(product);
    }
    
    public ArrayList<ItemPurchase> getAllProductsOnCart () {
        return ejbPurchase.getAllProductOnCart();
    }
    
    public void cleanCartList () {
        ejbPurchase.cleanCart();
    }
    
}
