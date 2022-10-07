/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.rozkurt.coursesexample.business.concretes;

import java.util.List;
import java.util.Optional;
import net.rozkurt.coursesexample.business.abstracts.Service;
import net.rozkurt.coursesexample.core.utils.logger.abstracts.Logger;
import net.rozkurt.coursesexample.dataAccess.abstracts.Dao;
import net.rozkurt.coursesexample.entities.abstracts.Entity;

/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public class ServiceManager implements Service<Entity, Object>{
    
    
    private final Dao dao;
    private final Logger logger;

    public ServiceManager(Dao dao, Logger logger) {
        this.dao = dao;
        this.logger = logger;
    }

    @Override
    public List<Entity> getAll() {
        
        return this.dao.list();
    }

    @Override
    public Optional<Entity> getById(Object id) {
        return dao.findById(id);
    }

    @Override
    public void delete(Object id) {
        dao.delete(id);
    }

    @Override
    public void update(Entity c, Object id) {
        
        dao.update(c, id);
        logger.updateAndAddLog(c, dao, "update");
        
    }

    @Override
    public void add(Entity c) {
        
        if (isValidEntity(c)) {
            dao.add(c);
            logger.updateAndAddLog(c, dao, "update");
        }
        
    }

    @Override
    public Boolean isExistById(String tableName, Object id) {
        
        List<Entity> allEntities = this.getAll();
        
        Optional<Entity> entity = allEntities.stream().filter(item -> item.getId().equals(id)).filter(item -> item.getTableName().equals(tableName)).findFirst();
        
        return entity.isPresent();
        
    }

    @Override
    public Boolean isExistByName(String name, String tableName) {
        
        List<Entity> allEntities = this.getAll();
        
        Optional<Entity> entity = allEntities.stream().filter(item -> item.getEntityName().equals(name)).filter(item -> item.getTableName().equals(tableName)).findFirst();
        
        return entity.isPresent();
    }
    
    
    public Boolean isValidEntity(Entity entity) {
        
        return !isExistById(entity.getTableName(), (Integer) entity.getId()) && !isExistByName(entity.getEntityName(), entity.getTableName());
    
    }


    
    
    
}
