/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.rozkurt.coursesexample.business.abstracts;

import java.util.List;
import java.util.Optional;
import net.rozkurt.coursesexample.entities.concretes.Category;
import net.rozkurt.coursesexample.entities.concretes.Course;

/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public interface Service<T, ID> {
    
    List<T> getAll();
    
    Optional<T> getById(ID id);
    
    void delete(ID id);
    
    void update(T c, ID id);
    
    void add(T c);
    
    Boolean isExistById(String tableName, ID id);
    
    Boolean isExistByName(String name, String tableName);
    
}
