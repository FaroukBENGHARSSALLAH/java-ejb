package com.farouk.bengharssallah.java.ejb.v2.bean;

import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

        // stateless, and synchronized session Bean

public class EJBv2Bean implements SessionBean  {


        //	EJB-required methods. The following methods are called
        //    by the container, and never called by client code. You should implement them according
       //	to the project context.
    
	    public void  ejbCreate() {}
	
	    public void ejbActivate() { }    
	
	    public void ejbPassivate() {}
	
	    public void ejbRemove() {}

		@Override
		public void setSessionContext(SessionContext arg0) throws EJBException, RemoteException {}
		

		
		// EJB's business logic implementation defined in 
		 // "com.farouk.bengharssallah.java.ejb.v2.bean.object" with 
		//local 'EJBv2LocalObject' and remote 'EJBv2RemoteObject' interfaces
		
	    public String sayhello() {
	              return "Hello world !";
	       }
   
  }