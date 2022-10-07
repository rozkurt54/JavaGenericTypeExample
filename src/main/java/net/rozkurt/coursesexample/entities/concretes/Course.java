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
public class Course extends BaseEntity<Integer>{

    
    private Category category;
    private List<Student> students;
    
    
    
    public Course(Integer id, String entityName) {
        super("courses", id, entityName);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

  
    
    
    
    
    
}
    
