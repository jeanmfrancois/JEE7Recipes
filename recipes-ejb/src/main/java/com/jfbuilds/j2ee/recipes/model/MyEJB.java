package com.jfbuilds.j2ee.recipes.model;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class MyEJB
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class MyEJB {

    /**
     * Default constructor. 
     */
    public MyEJB() {
        // TODO Auto-generated constructor stub
    }

}
