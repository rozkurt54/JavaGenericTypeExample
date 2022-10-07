/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.rozkurt.coursesexample.entities.concretes;

import java.util.List;
import net.rozkurt.coursesexample.entities.abstracts.BaseEntity;

/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public class Category extends BaseEntity<Integer>{
    
    private String categoryName;
    private List<Course> courses;

    public Category(Integer id, String entityName) {
        super("category", id, entityName);
    }
    
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
