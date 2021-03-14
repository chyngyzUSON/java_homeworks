package com.wallet.dao;

import com.wallet.model.Category;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class CategoryDao {
    private static HashMap<Long, Category> categories = new HashMap<>();

    static {
        Category c1 = Category.builder()
                .id(1L)
                .name("Category-1")
                //.user(User.builder().build())
                .parentCategoryId("")
                .isActive(false)
                .createdDate(new Date())
                .build();
        Category c2 = Category.builder()
                .id(1L)
                .name("Category-2")
                //.user(User.builder().name("u2"))
                .parentCategoryId("")
                .isActive(false)
                .createdDate(new Date())
                .build();
        categories.put(1L, c1);
        categories.put(2L, c2);
    }

    public List<Category> getAllCategories(){
        return new ArrayList<>(categories.values());
    }
}









