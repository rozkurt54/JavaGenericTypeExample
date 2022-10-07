/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.rozkurt.coursesexample.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import net.rozkurt.coursesexample.dataAccess.abstracts.Dao;
import net.rozkurt.coursesexample.entities.abstracts.Entity;

/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public class JdbcDao implements Dao<Entity, Integer>{
    
    
    private final List<Entity> listOfEntity = new ArrayList<>();
    
    public final String daoName;

    public JdbcDao(String daoName) {
        this.daoName = daoName;
    }
    

    @Override
    public void add(Entity c) {
        listOfEntity.add(c);
        System.out.println(c.getTableName() + " added with " + daoName);
    }

    @Override
    public void update(Entity c, Integer i) throws IndexOutOfBoundsException{
        
        Optional<Entity> inDbCourse = listOfEntity.stream().filter(item -> item.getId().equals(i)).findFirst();
        
       
                Entity object = inDbCourse.get();
                Integer indexOfList = listOfEntity.indexOf(object);
                listOfEntity.set(indexOfList, c);
                System.out.println("item Updated with" + daoName);
       
        
    }


    @Override
    public List<Entity> list() {
        return listOfEntity;
    }

    @Override
    public void delete(Integer id) throws IndexOutOfBoundsException{
        
          Optional<Entity> inDbCourse = listOfEntity.stream().filter(item -> item.getId().equals(id)).findFirst();
        
        
                Entity object = inDbCourse.get();
                
                listOfEntity.remove(object);
                System.out.println(object.getId() + " item removed with " + this.daoName);
                
        
    }

    
    @Override
    public Optional<Entity> findById(Integer id) throws IndexOutOfBoundsException{
        
        listOfEntity.stream().filter(item -> item.getId().equals(id)).findFirst();
        
            return listOfEntity.stream().filter(item -> item.getId().equals(id)).findFirst();
        
            
        }

    }

