/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.bean;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author zakariae.chentouf
 */
@RequestScoped
@Named(value="person")
public class PersonBean extends Person {

    @Inject Services services;

    public PersonBean() {
       super();
    }
    
    public String save(){
       services.savePerson(getGender(), getFirstName(), getLastName(), getMarried(), getBirthDate());
       return "index";
    }
    
  
}
