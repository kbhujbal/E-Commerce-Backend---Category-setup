package com.ecommerce.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ecommerce.project.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
    private List<Category> categories = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }
 
    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);   
        categories.add(category);
    }

    @Override
    public String deleteCategory(Long categoryId){
        Category category = categories.stream()
                            .filter(c -> c.getCategoryId().equals(categoryId))
                            .findFirst()
                            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found!"));
            // ResponseStatusException is a class and it has constructors (constructor overloading), 
            // we can pass more than 1 parameter
            // HttpStatus is an enum, it implements HttpStatusCode
            // HttpStatus has constants like NOT_FOUND, OK, BAD_REQUEST, etc.
        categories.remove(category);
        return "Category with categoryId : " + categoryId + " deleted successfully!";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId){
        Optional<Category> optionalCategory = categories.stream()
                                    .filter(c -> c.getCategoryId().equals(categoryId))
                                    .findFirst();
                
        if(optionalCategory.isPresent()){
            Category existingCategrory = optionalCategory.get();
            existingCategrory.setCategoryName(category.getCategoryName());
            return existingCategrory;
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found!");
        }
    }

}