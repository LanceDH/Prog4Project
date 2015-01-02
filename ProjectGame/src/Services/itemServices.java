/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.HibernateUtil;
import DAL.Item;
import java.util.*;
import org.hibernate.*;

/**
 *
 * @author LanceDH
 */
public class itemServices {
    public static ArrayList<DAL.Item> LootList;
    
    public static void LoadAllLoot(){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            
            session.beginTransaction();
             
        Query q = session.createQuery("from Item");
        LootList = (ArrayList<DAL.Item>) q.list();
        
        
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } catch(ExceptionInInitializerError e){
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }

    }
    
    public static Item GetItemById(int id){
        Item item = new Item();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            
            session.beginTransaction();
             
        Query q = session.createQuery("from Item where ID = '" + id + "'");
            
        item = (Item)q.list().get(0);
        
        } catch (Exception e) {
            throw e;
        } catch(ExceptionInInitializerError e){
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }
        
        return item;
    }
    
    
}
