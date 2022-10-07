/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.rozkurt.coursesexample.dataAccess.abstracts;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public interface Dao<T, ID> {
    
    void add(T t);
    void update(T t, ID id);
    void delete(ID id);
    List<T> list();
    Optional<T> findById(ID id);
           
    
}
