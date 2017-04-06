package com.farouk.bengharssallah.java.ejb.v3.bean;

import javax.ejb.Local;

    // local interface to access to the business logic

@Local
public interface EJBv3Local {
              public String sayhello ();
   }