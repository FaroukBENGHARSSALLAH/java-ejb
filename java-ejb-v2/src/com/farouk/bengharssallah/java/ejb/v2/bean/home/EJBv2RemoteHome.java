package com.farouk.bengharssallah.java.ejb.v2.bean.home;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

import com.farouk.bengharssallah.java.ejb.v2.bean.object.EJBv2RemoteObject;

      //instantiate an EJB from a remote endpoint

public interface EJBv2RemoteHome extends EJBHome {
	EJBv2RemoteObject create(String user) throws CreateException, RemoteException;
}