/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.rozkurt.coursesexample.core.utils.logger.abstracts;
import java.lang.String;

/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 * @param <T>
 * @param <S>
 */
public interface Logger<T, S> {
    
    void log(String message);
    
    void updateAndAddLog(T entity, S dao, String string);
    
    void logListMethod(T entity);
    
    void logDeleteMethod(T entity);
    
    
    
}
