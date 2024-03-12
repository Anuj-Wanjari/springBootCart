package com.anuj.cartservice.controllers;

import com.anuj.cartservice.models.product;
import com.anuj.cartservice.services.CartServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class productController {

    @GetMapping("/product")
    public ArrayList<product> getAllProduct(){
        return new ArrayList<>();
    }

    //@GetMapping("/product/{id}")
    //public product getSingleProduct(@PathVariable("id") Long abc){
        //int id = abc.intValue();
        //return new product();
    //}
    @GetMapping("/product/{id}")
    public Long getSingleProduct(@PathVariable("id") Long id) {
        return CartServices.getSingleProduct(id);
    }

    @PutMapping("/product")
    public void updateCart(@RequestBody product k){
        CartServices.updateCart(k);
    }

    public void deleteProduct(@PathVariable("id") Long id){
        CartServices.deleteProduct(id);
    }

}
