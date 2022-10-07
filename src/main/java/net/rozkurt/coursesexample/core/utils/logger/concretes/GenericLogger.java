/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.rozkurt.coursesexample.core.utils.logger.concretes;

import net.rozkurt.coursesexample.core.utils.logger.abstracts.Logger;
import net.rozkurt.coursesexample.dataAccess.abstracts.Dao;
import net.rozkurt.coursesexample.entities.abstracts.Entity;
import java.lang.String;

/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public class GenericLogger  implements Logger<Entity, Dao>{
    

    @Override
    public void log(String message) {
        
    }
    
    @Override
    public void updateAndAddLog(Entity entity, Dao dao, String operation) {
          System.out.println(String.format("Logged %s, Operation %s, (Table %s, Name %s, id %s, with dao %s)",
                this.getClass().getSimpleName(), operation, entity.getTableName(),
                entity.getEntityName(), entity.getId(), dao.getClass().getSimpleName()));
    }
    
    @Override
    public void logListMethod(Entity entity) {
        System.out.println(String.format("%s are listed", entity.getTableName()));
    }
    
    @Override
    public void logDeleteMethod(Entity entity) {
        System.out.println(String.format("Deleted. %s", entity.getId() + 
                "-" + entity.getEntityName()  + "from " + entity.getTableName()));
    }
    

    
    
    
     
    
    
}
