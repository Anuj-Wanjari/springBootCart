package com.anuj.cartservice.DTO;
import com.anuj.cartservice.models.category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String description;
    private double price;
    private category Category;
    private String imageUrl;

}
