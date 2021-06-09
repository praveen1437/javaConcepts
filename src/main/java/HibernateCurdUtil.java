

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateCurdUtil<E> {
    private HibernateUtility hibernateUtility;
    private Session session;
    private Transaction transaction;

    /**
     * Creates an instance of HibernateCurdUtil class with info present in hiberntae.cfg.xml file
     *
     * @return an Instance of  HibernateCurdUtil class
     */
    public static HibernateCurdUtil getInstance() {
        HibernateCurdUtil hibernateCurdUtil = new HibernateCurdUtil();
        hibernateCurdUtil.hibernateUtility = HibernateUtility.getInstance();
        return hibernateCurdUtil;
    }

    /**
     * Creates an instance of HibernateCurdUtil class with info present in annotatedClass files
     *
     * @return an Instance of  HibernateCurdUtil class
     */
    public static HibernateCurdUtil getInstance(Class... persistantClasses) {
        HibernateCurdUtil hibernateCurdUtil = new HibernateCurdUtil();
        hibernateCurdUtil.hibernateUtility = HibernateUtility.getInstance(persistantClasses);
        return hibernateCurdUtil;
    }

    /**
     * Stores the object data into the data base table
     *
     * @param e Object which is to be stored in data base
     * @return generated id value of the record if generator is configured
     * otherwise the hardcoded id value(primary key) will be returned.
     */
    public Integer saveRecord(E e) {
        return saveRecords(e);
    }

    /**
     * saves the given object into data base
     * this method is used when multiple objects are to be stored into the table
     * under a single transaction management
     * can be used in inheritance mapping also
     *
     * @param e object which is to be stored in the database table
     * @return Id value of the object if it is successfully inserted otherwise returns null
     */
    public Integer saveRecords(E... e) {
        //get session object and store it into non -static variable
        int result = 0;
        if (session == null) {
            session = hibernateUtility.getSession();
        }
        //begin a transaction
        if (transaction == null) {
            transaction = session.beginTransaction();
        }
        //save the object into data base
        for (int i = 0; i < e.length; i++) {
            System.out.println("in for loop");
            result = (Integer) session.save(e[i]);
        }

        if (result != 0) {
            transaction.commit();
            session.close();
            return result;
        } else {
            transaction.rollback();
            session.close();
            return null;
        }


    }

    /**
     * retrieves the data from the data base it performs eager loading of the object
     *
     * @param id              Unique value and primary key coloumn value in the database table
     * @param persistentClass Class object of the object which is to be fetched from the database
     * @return object casted to generic type of the class
     */
    public Object getRecord(int id, Class persistentClass) {
        if (session == null) {
            this.session = hibernateUtility.getSession();
        }
        return session.get(persistentClass, id);
    }

    /**
     * retrieves the data from the data base it performs lazy loading of the object
     *
     * @param id              Unique value and primary key coloumn value in the database table
     * @param persistentClass Class object of the object which is to be fetched from the database
     * @return object casted to generic type of the class
     */
    public E loadRecord(int id, Class persistentClass) {
        if (session == null) {
            this.session = hibernateUtility.getSession();
        }
        return (E) session.load(persistentClass, id);
    }

    /**
     * Performs delete operation in the database table if the given object is present
     *
     * @param id              primary key value associated with the object to be deleted
     * @param persistentClass The Class object of the Entity class
     * @return true if removal takes place without any interruption
     * else returns false
     */
    public boolean removeRecord(int id, Class persistentClass) {
        //get the session object if it is not initialized
        if (session == null) session = hibernateUtility.getSession();
        //fetch the record from database
        Object object = getRecord(id, persistentClass);
        if (object != null) {
            session.delete(object);
            return true;
        }
        return false;
    }

}
