package br.data.model;

import lombok.Data;

/**
 *
 * @author Rafael de Luca
 */
@Data
public class ItemPurchase {
    
    private Product product;
    private int quantity;
    
    public ItemPurchase () {
        
    }
    
    public ItemPurchase (Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;                
    }
}
