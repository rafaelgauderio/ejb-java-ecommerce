package br.ejb;

import br.data.model.ItemPurchase;
import br.data.model.Product;
import java.util.ArrayList;
import javax.ejb.Stateful;

/**
 *
 * @author Rafael de Luca
 */
@Stateful
public class EjbPurchase {

    private ArrayList<ItemPurchase> productsList;

    public EjbPurchase() {
        productsList = new ArrayList<ItemPurchase>();
    }

    // if the item already exist on the list, just increment one,
    // else add the new Product on the list
    public void addProduct(Product product) {
        boolean findProduct = false;
        for (ItemPurchase nickname : productsList) {
            if (nickname.getProduct().getId() == product.getId()) {
                nickname.setQuantity(nickname.getQuantity() + 1);
                findProduct = true;
                return;
            }
        }
        // add one product to the cart
        if(findProduct==false) {
            productsList.add(new ItemPurchase(product,1));
        }

    }
    
    public ArrayList<ItemPurchase> getAllProductOnCart () {
        return productsList;
    }
    
    public void cleanCart () {
        productsList.clear();
    }

}
