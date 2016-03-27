package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mohailing on 3/26/2016.
 */
public interface ShoppingCartRepositiry extends JpaRepository<ShoppingCart,Long> {
}
