package com.springbootpracticeproject.sppj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public void addItems(@RequestParam Integer... ids) {
        // Ensure the set is collected as Set<Integer>
        Set<Integer> itemIds = Arrays.stream(ids)
                .collect(Collectors.toSet());
        cartService.addItems(itemIds);
    }

    @GetMapping("/get")
    public Set<Integer> getItems() {
        return cartService.getItems();
    }
}