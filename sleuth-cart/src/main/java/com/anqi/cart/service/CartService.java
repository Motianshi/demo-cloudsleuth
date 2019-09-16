package com.anqi.cart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CartService.class);

    public void addProductToCart() {
        String cartId = "a12";
        LOGGER.info("add product to cat catid:{}",cartId);
    }
}
