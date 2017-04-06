package com.farouk.bengharssallah.java.ejb.v3.bean;

import javax.ejb.Remote;

  // remote interface to access to the business logic


@Remote
public interface EJBv3Remote {
      public String sayhello ();
   }