/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.bean;

 
import ch.hearc.ig.odi.peoplelist.service.Services;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author zakariae.chentouf
 */
@RequestScoped
@Named(value="personListBen")
public class PersonListBean {
    
 @Inject Services services;

    public PersonListBean() {
    }
 
    public List getPeopleList(){
     return services.getPeopleList();
    }
   
}
