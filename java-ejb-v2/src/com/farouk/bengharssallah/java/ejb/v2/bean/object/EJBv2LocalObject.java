package com.farouk.bengharssallah.java.ejb.v2.bean.object;

import javax.ejb.EJBLocalObject;

      // acces to business logic defined in the EJB in the same JVM

public interface EJBv2LocalObject extends EJBLocalObject {
       public String sayhello ();
   }