package camt.se331.shoppingcart.entity;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
@Entity
public class ShoppingCart {

    @OneToMany(fetch = FetchType.EAGER)

    @Id
            @GeneratedValue
            Long id;
    @OneToMany(fetch =FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    List<SelectedProduct> selectedProducts;
    @Temporal(TemporalType.TIMESTAMP)
    Date purchaseDate;

    public double getTotalProductPrice(){
        return 0.0;
    };

    public List<SelectedProduct> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<SelectedProduct> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public ShoppingCart(List<SelectedProduct> selectedProducts) {

        this.selectedProducts = selectedProducts;
    }

    public ShoppingCart() {

    }
}
