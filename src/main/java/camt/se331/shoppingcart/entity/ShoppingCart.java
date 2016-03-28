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
    @Id
    @GeneratedValue
    Long id;
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    List<SelectedProduct> selectedProducts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingCart)) return false;

        ShoppingCart that = (ShoppingCart) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (getSelectedProducts() != null ? !getSelectedProducts().equals(that.getSelectedProducts()) : that.getSelectedProducts() != null)
            return false;
        return getPurchaseDate() != null ? getPurchaseDate().equals(that.getPurchaseDate()) : that.getPurchaseDate() == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (getSelectedProducts() != null ? getSelectedProducts().hashCode() : 0);
        result = 31 * result + (getPurchaseDate() != null ? getPurchaseDate().hashCode() : 0);
        return result;
    }

    @Temporal(TemporalType.TIMESTAMP)

    Date purchaseDate;

    public double getTotalProductPrice() {
        return 0.0;
    }

    ;

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
