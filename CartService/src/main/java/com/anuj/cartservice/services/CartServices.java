package com.anuj.cartservice.services;

import com.anuj.cartservice.models.product;
import java.util.ArrayList;
public interface CartServices {

    ArrayList<product> getAllProduct();

    static void updateCart(product product) {

    }

    public static void deleteProduct(Long id) {

    }

    public static Long getSingleProduct(Long id){
        return id;
    }


}
