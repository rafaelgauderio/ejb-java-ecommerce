package br.jsf;

import br.data.model.Product;
import br.ejb.ebjProduct;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

// cdi bean make de connection between java and client javaServerFaces(xhtml)
/**
 *
 * @author rafael de Luca
 */
@Named(value = "jsfProduct")
@RequestScoped
public class jsfProduct {

    @EJB
    private ebjProduct ebjProduct;    
   
    public jsfProduct() {
        
    }
    
    public ArrayList <Product> getAllProducts () {
        
        return ebjProduct.getAllProducts();
    }
}
