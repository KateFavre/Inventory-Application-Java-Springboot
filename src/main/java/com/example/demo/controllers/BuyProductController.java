package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theID, Model theModel) {
        Optional<Product> productToBuy = productRepository.findById(theID);

        if (productToBuy.isPresent()) {
         Product product = productToBuy.get();
            if (product.getInv() > 0){
            product.setInv(product.getInv() - 1);
            productRepository.save(product);
            return "/buyNowSuccess";
            }
            else {
                return "/buyNowFailure";
            }
        }
        else{
            return "/buyNowFailure";
        }
    }
}
