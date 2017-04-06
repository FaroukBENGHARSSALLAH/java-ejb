java-ejb-v3
==========================

This folder contains a set of JAVA EJBv2 APIs.

In 'EJB3' you have to code your EJB's description using only annotation, more simplified approach than EJBv2.

- 'EJBv3Local' in 'com.farouk.bengharssallah.java.ejb.v3.bean' to define business logic accessed in the same JVM
- 'EJBv3Remote' in 'com.farouk.bengharssallah.java.ejb.v3.bean' to to define business logic accessed  from a remote endpoint

- 'EJBv3BeanImplementation' in 'com.farouk.bengharssallah.java.ejb.v3.bean.implementation' to implement the bean 's body

You don't need XML files decriptors, the annotations will handle that