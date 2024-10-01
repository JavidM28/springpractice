package com.springbootpracticeproject.sppj;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Service
@SessionScope
public class CartService {

    private final Cart cart;

    public CartService() {
        this.cart = new Cart();
    }

    public void addItems(Set<Integer> itemIds) {
        cart.addItems(itemIds);
    }

    public Set<Integer> getItems() {
        return cart.getItemIds();
    }
}