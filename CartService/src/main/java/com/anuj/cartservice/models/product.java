package com.anuj.cartservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private category Category;
    private String imageUrl;
}
