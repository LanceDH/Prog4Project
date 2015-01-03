/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.*;

/**
 *
 * @author LanceDH
 */
public class MiscServices {
    private static ArrayList<DAL.Race> RaceList;
    private static ArrayList<DAL.Charclass> ClassList;

    
    public static void LoadRaceData(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
             
        Query q = session.createQuery("from Race");
        RaceList = (ArrayList<DAL.Race>) q.list();
        
        
        tx.commit();
        //session.close();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }

    }
    
    public static void LoadClassData(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
             
        Query q = session.createQuery("from Charclass");
        ClassList = (ArrayList<DAL.Charclass>) q.list();
        
        
        tx.commit();
        //session.close();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }

    }

    public static ArrayList<DAL.Race> getRaceList() {
        return RaceList;
    }

    public static ArrayList<DAL.Charclass> getClassList() {
        return ClassList;
    }
}
