/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate;

import com.labti.springHibernate.view.ViewSiswa;
import org.springframework.context.ApplicationContext;
import com.labti.springHibernate.service.SiswaService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = newClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new ViewSiswa().setVisible(true);
    }
    
    public static SiswaService getSiswaService(){
        return(SiswaService)applicationContext.getBean("SiswaService");
    }
    
    
    
    
}
