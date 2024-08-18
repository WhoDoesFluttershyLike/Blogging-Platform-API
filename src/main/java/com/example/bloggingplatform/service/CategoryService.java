package com.example.bloggingplatform.service;

import com.example.bloggingplatform.entity.Category;
import com.example.bloggingplatform.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepo repo;





    public Category findCategoryByName(String categoryName){
        List<Category> listOfCategory = repo.findAll();
        Category category = new Category();
        for (int i=0; i<listOfCategory.size(); i++){
            if (Objects.equals(listOfCategory.get(i).getName(), categoryName)){
                category = listOfCategory.get(i);
                break;
            }
        }
        return category;
    }
    public Category save( Category category){
        return repo.save(category);
    }
}
