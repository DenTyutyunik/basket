package org.tyutyunik.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tyutyunik.basket.service.BasketServiceImplementation;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketServiceImplementation basketService;

    public BasketController(BasketServiceImplementation basketService) {
        this.basketService = basketService;
    }

    @GetMapping("")
    public String standardAnswer() {
        return basketService.standardAnswer();
    }

    @GetMapping("/get")
    public List<Integer> getData() {
        return basketService.getItems();
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam ArrayList<Integer> items) {
        return basketService.addItems(items);
    }
}
