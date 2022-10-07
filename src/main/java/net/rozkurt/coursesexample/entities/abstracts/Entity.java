/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.rozkurt.coursesexample.entities.abstracts;

/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public interface Entity<ID> {
    
    
    ID getId();
    
    void setId(ID id);
    
    String getTableName();
    
    void setTableName(String tableName);
    
    String getEntityName();
    
    void setEntityName(String entityName);
    
    @Override
    String toString();
    
    
    
}
