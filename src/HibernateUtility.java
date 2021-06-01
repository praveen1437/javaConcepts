package org.ie.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtility {
    private SessionFactory sessionFactory;
    private Configuration configuration;

    /**
     * Creates Hibernate utility class object
     * with the details present in th hibernate.cfg.hbm.xml file in class path
     *
     * @return An instance of HibernateUtil class holding the
     * SessionFactory object based on the data passed in hibernate.cfg.hbm.xml file in class path
     */
    public static HibernateUtility getInstance() {
        HibernateUtility hibernateUtility = new HibernateUtility();
        hibernateUtility.configuration = new Configuration();
        hibernateUtility.configuration = hibernateUtility.configuration.configure();
        hibernateUtility.sessionFactory = hibernateUtility.configuration.buildSessionFactory();
        return hibernateUtility;

    }

    /**
     * Creates HibernateUtility class with the information present in the AnnotatedClasses
     * loads the configuration and builds the SessionFactory Object
     *
     * @param persistentClasses The annotatedClass containing mapping information
     * @return an instance of HibernateUtility class
     */
    public static HibernateUtility getInstance(Class... persistentClasses) {
        HibernateUtility hibernateUtility = new HibernateUtility();

        hibernateUtility.configuration = new Configuration();
        for (int i = 0; i < persistentClasses.length; i++) {
            System.out.println(persistentClasses[i]);
            hibernateUtility.configuration.addAnnotatedClass(persistentClasses[i]);
        }
        hibernateUtility.sessionFactory = hibernateUtility.configuration.buildSessionFactory();
        return hibernateUtility;


    }

    public Session getSession() {
        Session session = null;
        if (sessionFactory != null) {
            session = sessionFactory.openSession();
        }
        return session;
    }

    public boolean closeSession(Session session) {
        if (session != null) {
            if (sessionFactory != null) {
                session.close();
                return true;
            }
        }
        return false;
    }

    public boolean closeSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
            return true;
        }
        return false;
    }
}
