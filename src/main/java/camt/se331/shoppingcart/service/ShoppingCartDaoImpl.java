package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.dao.ShoppingCartDao;
import camt.se331.shoppingcart.entity.ShoppingCart;
import camt.se331.shoppingcart.repository.ShoppingCartRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by mohailing on 3/26/2016.
 */
@Repository
public class ShoppingCartDaoImpl implements ShoppingCartDao {
    @Autowired
    ShoppingCartRepositiry shoppingCartRepositiry;
    @Override
    public List<ShoppingCart> getShoppingCarts() {
        return null;
    }

    @Override
    public List<ShoppingCart> getShoppingCartBefore(Date stateDate) {
        return null;
    }

    @Override
    public List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate) {
        return null;
    }

    @Override
    public ShoppingCart addShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepositiry.save(shoppingCart);
    }

    @Override
    public ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public ShoppingCart findByld(Long id) {
        return shoppingCartRepositiry.findOne(id);
    }
}
