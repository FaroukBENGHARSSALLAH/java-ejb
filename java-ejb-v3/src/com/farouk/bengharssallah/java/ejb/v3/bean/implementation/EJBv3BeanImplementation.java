package com.farouk.bengharssallah.java.ejb.v3.bean.implementation;

import javax.ejb.Stateless;

import com.farouk.bengharssallah.java.ejb.v3.bean.EJBv3Local;
import com.farouk.bengharssallah.java.ejb.v3.bean.EJBv3Remote;

         // bean 's implementation
         // In EJBv3, you don't have to implement life cycle and required methods

@Stateless(name="ejb/eJBv3Bean")
public class EJBv3BeanImplementation implements EJBv3Remote, EJBv3Local  {

	    public String sayhello() {
	        return "Hello world !";
	    }
   
  }