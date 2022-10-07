/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.rozkurt.coursesexample.entities.abstracts;


/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public abstract class BaseEntity<T> implements Entity<T>{
    
    

    private T id;
    private String tableName;
    private String entityName;

    public BaseEntity(String tableName, T id, String entityName) {
        
        this.id = id;
        this.entityName = entityName;
        this.tableName = tableName;
        
    }
   
    
    
    @Override
    public String toString() {
        return "id:" + this.getId() + ", name:" + this.getTableName();
    }

    @Override
    public T getId() {
        return this.id;
    }

    @Override
    public void setId(T id) {
       this.id = id;
    }

    @Override
    public String getTableName() {
        return this.tableName;
                
    }

    @Override
    public void setTableName(String tableName) {
      this.tableName = tableName;
    }

    @Override
    public String getEntityName() {
        return this.entityName;
    }

    @Override
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    
    

    
    
        
}
