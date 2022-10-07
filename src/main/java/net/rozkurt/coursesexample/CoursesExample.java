/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package net.rozkurt.coursesexample;

import net.rozkurt.coursesexample.business.concretes.ServiceManager;
import net.rozkurt.coursesexample.core.utils.logger.concretes.GenericLogger;
import net.rozkurt.coursesexample.dataAccess.concretes.HibernateDao;
import net.rozkurt.coursesexample.entities.concretes.Category;
import net.rozkurt.coursesexample.entities.concretes.Student;


/**
 *
 * @author Ramazan OZKURT <rozkurt@hotmail.com>
 */
public class CoursesExample {
    
    public static void main(String[] args) {
        
        Student student = new Student(1, "Ramazan");
        
        ServiceManager serviceManager = new ServiceManager(new HibernateDao("Hibernate"), new GenericLogger());
        
        serviceManager.add(student);
        
        Category category = new Category(1, "Java");
        serviceManager.add(category);
        
        
        
        
    }
}
