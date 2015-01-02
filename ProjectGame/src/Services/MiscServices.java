/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author LanceDH
 */
public class MiscServices {
    public static ArrayList<DAL.Race> RaceList;
    public static ArrayList<DAL.Charclass> ClassList;
    
    
    public static void LoadRaceData(){
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
             
        Query q = session.createQuery("from Race");
        RaceList = (ArrayList<DAL.Race>) q.list();
        
        
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } catch(ExceptionInInitializerError e){
            System.err.println(e.getMessage());
        }
        finally{
            //session.close();
        }

    }
    
    public static void LoadClassData(){
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
             
        Query q = session.createQuery("from Charclass");
        ClassList = (ArrayList<DAL.Charclass>) q.list();
        
        
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } catch(ExceptionInInitializerError e){
            System.err.println(e.getMessage());
        }
        finally{
            //session.close();
        }

    }
}
