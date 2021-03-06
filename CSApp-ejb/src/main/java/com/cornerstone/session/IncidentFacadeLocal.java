/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cornerstone.session;

import com.cornerstone.entity.Employee;
import com.cornerstone.entity.Incident;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kornel
 */
@Local
public interface IncidentFacadeLocal {

    void create(Incident incident);

    void edit(Incident incident);

    void remove(Incident incident);

    Incident find(Object id);

    List<Incident> findAll();
    
    List<Incident> findByOwnerID(Employee id);
    
    List<Incident> findByOwnerID(Integer id);
    
    List<Incident> findAllInEmployeesGroups(Integer id);
    
    List<Incident> findRange(int[] range);

    int count();
    
}
