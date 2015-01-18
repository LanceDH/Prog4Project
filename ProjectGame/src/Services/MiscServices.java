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
    private static ArrayList<DAL.Attribute> AttributeList;

    
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
    
    public static void LoadAttributeData(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
             
        Query q = session.createQuery("from Attribute");
        AttributeList = (ArrayList<DAL.Attribute>) q.list();
        
        
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
    
    public static String GetImagePath(String name){
        return GetImagePath(name, -1);
    }
    
    public static String GetImagePath(String name, int iconSize){
        String path = name;
        
        if (iconSize != -1) {
            path = path + "_" + iconSize;
        }
        
        path =  "Images/" + path + ".png";
        
        return path;
        /*
        try {
            lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + name + sizeString + ".png")));
        } catch (Exception e) {
            System.err.println("Could not find image: " + "/Images/" + name + sizeString + ".png");
            lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unknown.png")));
        }*/
    }

    public static ArrayList<DAL.Attribute> getAttributeList() {
        return AttributeList;
    }

    public static void setAttributeList(ArrayList<DAL.Attribute> aAttributeList) {
        AttributeList = aAttributeList;
    }
}
