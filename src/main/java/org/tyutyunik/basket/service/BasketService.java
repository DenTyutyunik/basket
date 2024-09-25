package org.tyutyunik.basket.service;

import java.util.List;

public interface BasketService {
    String standardAnswer();

    List<Integer> getItems();

    List<Integer> addItems(List<Integer> items);
}
