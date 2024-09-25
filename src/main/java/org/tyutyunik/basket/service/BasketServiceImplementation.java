package org.tyutyunik.basket.service;

import org.springframework.stereotype.Service;
import org.tyutyunik.basket.repository.Basket;

import java.util.List;

@Service
public class BasketServiceImplementation {
    private final Basket basket;

    public BasketServiceImplementation(Basket basket) {
        this.basket = basket;
    }

    public String standardAnswer() {
        return "Basket";
    }

    public List<Integer> getItems() {
        return basket.getItems();
    }

    public List<Integer> addItems(List<Integer> items) {
        return basket.addItems(items);
    }
}
