package com.devsuperior.dscommerce.tests;

import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;

public class ProductFactory {

    public static Product createProduct() {
        Category category = CategoryFactory.createCategory();
        Product product = new Product(1L, "Console PS5", "Este é meu console Playstation 5", 4000.0, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZjLFU1f0Lo6N7ZtnRwZuYW1Hq8lTWKip8O8QTapgTZ77PoPwpahH7NyE&s=10");
        product.getCategories().add(category);
        return product;
    }

    public static Product createProduct(String name) {
        Product product = createProduct();
        product.setName(name);
        return product;
    }
}
