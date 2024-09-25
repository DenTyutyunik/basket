package org.tyutyunik.basket.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> repository = new ArrayList<>();

    public List<Integer> addItems(List<Integer> items) {
        repository.addAll(items);
        return items;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(repository);
    }
}
