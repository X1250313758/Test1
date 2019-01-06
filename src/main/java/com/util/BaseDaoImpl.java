package com.util;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public abstract class BaseDaoImpl<T>  {
	protected static Session session;
	protected static Transaction tx;
	public static void startTx(){
   	 session=new Configuration().configure().buildSessionFactory().openSession();

  	  tx=session.beginTransaction();
   }
        public static void commit(){
       	 tx.commit();
        }
        public static void rollback(){
       	 tx.rollback();
        }
        public static void close(){
       	 session.close();
        }
}
