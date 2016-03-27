package camt.se331.shoppingcart.config;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.entity.SelectedProduct;
import camt.se331.shoppingcart.entity.ShoppingCart;
import camt.se331.shoppingcart.repository.ShoppingCartRepositiry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * Created by mohailing on 3/27/2016.
 */
public class DatabaseInitializationBean {
    @Autowired
    ShoppingCartRepository shoppingCartRepository;
    ShoppingCart shoppingCart =new ShoppingCart();
    List<SelectedProduct> selectedProducts=new ArrayList<>();
    private Product[] initProduct;
    SelectedProduct[] initSelectedProduct={
            new SelectedProduct(initProduct[2],5),
            new SelectedProduct(initProduct[4],2),
            new SelectedProduct(initProduct[1],1),

    };

    public SelectedProduct[] getInitSelectedProduct() {
        return initSelectedProduct;
    }

    selectedProducts.addAll(Arrays.asList(initSelectedProduc));
    Calendar calendar = new GregorianCalendar(2015,4,7);
            shoppingCart.setSelectedProducts(selectedProducts);
            shoppingCart.setPurchaseDate(calendar.getTime());
            shoppingCart.setId(1L);
            shoppingCartRepository.save(shoppingCart);

}
