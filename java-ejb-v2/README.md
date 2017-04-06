java-ejb-v2
==========================

This folder contains a set of JAVA EJBv2 APIs.

In 'EJB2' you have to hardcode your EJB's description using defined APIs and XML files.

- 'EJBLocalHome' in 'com.farouk.bengharssallah.java.ejb.v2.bean.home' to instantiate the bean in the same JVM
- 'EJBHome' in 'com.farouk.bengharssallah.java.ejb.v2.bean.home' to instantiate the bean from a remote endpoint

- 'EJBLocalObject' in 'com.farouk.bengharssallah.java.ejb.v2.bean.object' to define business logic accessed in the same JVM
- 'EJBObject' in 'com.farouk.bengharssallah.java.ejb.v2.bean.object' to to define business logic accessed  from a remote endpoint

- 'SessionBean' in 'com.farouk.bengharssallah.java.ejb.v2.bean' to implement the bean 's body

- 'ejb-jar.xml' in 'src\META-INF' contains basic bean dscription
- 'jboss.xml' in 'src\META-INF' contains basic bean deployment description for JBoss server