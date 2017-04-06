package com.farouk.bengharssallah.java.ejb.v2.bean.home;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

import com.farouk.bengharssallah.java.ejb.v2.bean.object.EJBv2LocalObject;

      // instantiate an EJB in the same JVM

public interface EJBv2LocalHome extends EJBLocalHome {
	EJBv2LocalObject create(String user) throws CreateException;
}