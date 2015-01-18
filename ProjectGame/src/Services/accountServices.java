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
public class AccountServices {
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
    
    public static int InsertAccount(DAL.Account account) throws UIException{
        int row = 0;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            Query q = session.createQuery("from Account where name = :name");
            q.setParameter("name", account.getName());
            if (q.list().size() > 0) {
                throw new UIException("Account name is unavailable");
            }
            
            session.save(account);
            tx.commit();
        } catch (UIException e) {
            if (tx != null) tx.rollback();
            throw e;
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        } 
        finally{
            session.close();
        }
        
        
        return row;
    }
    
    public static ArrayList<DAL.Character> GetCharactersOfAccount(int id){
        DAL.Account acc = new Account();
        ArrayList<DAL.Character> list = new ArrayList<DAL.Character>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
            Query q = session.createQuery("from Account a left join fetch a.characters c left join fetch c.charclass left join fetch c.race where a.id = :id");
            q.setParameter("id", id);
            acc = (DAL.Account) q.list().get(0);
            list = new ArrayList<DAL.Character>(acc.getCharacters());

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }
        
        
        return list;
    }
}
