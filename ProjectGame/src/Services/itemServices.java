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
public class ItemServices {
    private static ArrayList<DAL.Item> LootList;
    
    public static void LoadAllLoot(){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            
            session.beginTransaction();
             
        Query q = session.createQuery("from Item i left join fetch i.slot left join fetch i.attribute1 left join fetch i.attribute2");
            setLootList((ArrayList<DAL.Item>) q.list());
        
        Collections.sort(LootList, new Comparator<DAL.Item>() {
                @Override
                public int compare(DAL.Item t, DAL.Item t1) {
                    return t.getName().compareTo(t1.getName());
                }

            });
        
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
             
        Query q = session.createQuery("from Item i left join fetch i.slot left join fetch i.attribute1 left join fetch i.attribute2 where i.id = :id ");
        q.setParameter("id", id);
            
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
    
    public static ArrayList<DAL.Item> GetItemsBySlot(DAL.Slot slot){
        ArrayList<DAL.Item> list = new ArrayList<DAL.Item>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Item i left join fetch i.slot where i.slot.id = :id");
            q.setParameter("id", slot.getId());
            list = (ArrayList<DAL.Item>) q.list();
            
            // alphabetical order
            Collections.sort(list, new Comparator<DAL.Item>() {
                @Override
                public int compare(Item t, Item t1) {
                    return t.getName().compareTo(t1.getName());
                }
            });
            //because sort by is too mainstream
            /*Collections.sort(list, new Comparator<DAL.Character>() {
                @Override
                public int compare(Character t, Character t1) {
                    return t.getId().compareTo(t1.getId());
                }
            });*/
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }

        return list;
    }

    public static ArrayList<DAL.Item> getLootList() {
        if (LootList == null) {
            LoadAllLoot();
        }
        return LootList;
    }

    public static void setLootList(ArrayList<DAL.Item> aLootList) {
        LootList = aLootList;
    }
    
    
}
