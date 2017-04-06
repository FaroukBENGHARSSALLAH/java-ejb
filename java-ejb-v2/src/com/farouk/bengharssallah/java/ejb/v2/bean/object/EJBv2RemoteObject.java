package com.farouk.bengharssallah.java.ejb.v2.bean.object;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

      //acces to business logic defined in the EJB by remote endpoint

public interface EJBv2RemoteObject extends EJBObject {
	  public String sayhello ()  throws RemoteException;
   }