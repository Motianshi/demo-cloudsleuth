package com.anqi.cart.controller;

import com.anqi.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("cart")
@RestController
public class CartController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CartService cartService;

    private static final String orderUrl = "http://localhost:8084/order/create";

    @GetMapping("/add/{cartId}")
    public String addToCart(@PathVariable("cartId") String cartId) {
        cartService.addProductToCart(cartId, "小米8");
        ResponseEntity<String> res = restTemplate.getForEntity(orderUrl, String.class);
        return res.getBody();
    }
}
