/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.japtor.isman.model;

import eu.japtor.isman.rest.NameService;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Honza
 */
@Singleton
@Startup
public class StartupBean {
//    @PersistenceContext
//    EntityManager em;  
//
//    public StartupBean() {
//    }
//    
//    @EJB
//    private NameService nameService;
    
    @PostConstruct
    public void recreateDb() {
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("Tady bude inicializace DB");
        System.out.println("---------------------------------------------------");
        System.out.println();
        
//        em.clear();
//        em.persist(new Person("ABCDE", "Gusta"));
//        em.close();
    }
    
}
