package com.springbootpracticeproject.sppj;

import java.util.Set;
import java.util.HashSet;

public class Cart {
    private Set<Integer> itemIds;

    public Cart() {
        this.itemIds = new HashSet<>();  // Ensure the set is of type <Integer>
    }

    public void addItem(Integer itemId) {
        itemIds.add(itemId);
    }

    public void addItems(Set<Integer> itemIds) {
        this.itemIds.addAll(itemIds);
    }

    public Set<Integer> getItemIds() {
        return itemIds;
    }
}