
package br.data.model;

import lombok.Data;

/**
 *
 * @author Rafael de Luca
 */

@Data 
public class Product {
    
    private int id;
    private String description;
    
    public Product () {
        
    }
    
    public Product (int id, String description) {
        this.id = id;
        this.description = description;
    }
    
}
