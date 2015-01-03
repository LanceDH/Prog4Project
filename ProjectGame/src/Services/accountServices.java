/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Account;
import DAL.HibernateUtil;
import java.util.*;
import org.hibernate.*;

/**
 *
 * @author LanceDH
 */
public class accountServices {
    public static ArrayList<DAL.Account> GetAllAccounts(){
        ArrayList<DAL.Account> list = new ArrayList<DAL.Account>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
            
             
        Query q = session.createQuery("from Account");
        list = (ArrayList<DAL.Account>) q.list();
        
        
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }
        
        
        return list;
    }
    
    public static Account Login(String name, String pass) throws UIException{
        Account account = new Account();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
            
             
        Query q = session.createQuery("from Account where name = :login and password = :pass");
        q.setParameter("login", name);
        q.setParameter("pass", pass);
        
        if(q.list().size() == 0){
            Exception ex = new UIException("Account name or password is incorrect");
            throw ex;
            
        }
            
        account = (Account)q.list().get(0);
        } catch (UIException e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
            throw e;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }
        
        return account;
    }
}
