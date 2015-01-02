/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.HibernateUtil;
import java.util.*;
import org.hibernate.*;

/**
 *
 * @author LanceDH
 */
public class characterServices {
    
    public static int UpdateCharacter(DAL.Character character){
        int rows = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
             
             //AccountId 	Name 	RaceId 	ClassId 	ChestItemId 	LegsItemId 	BootsItemId 	WeaponItemId 
            
            String chestItemId = "null"; 
            String legsItemId = "null";
            String bootsItemId = "null";
            String weaponItemId = "null";
            if(character.getItemByChestItemId() != null){
                chestItemId = "'" + character.getItemByChestItemId().getId() + "'";
            }
            if(character.getItemByLegsItemId() != null){
                legsItemId = "'" + character.getItemByLegsItemId().getId() + "'";
            }
            if(character.getItemByBootsItemId() != null){
                bootsItemId = "'" + character.getItemByBootsItemId().getId() + "'";
            }
            if(character.getItemByWeaponItemId() != null){
                weaponItemId = "'" + character.getItemByWeaponItemId().getId() + "'";
            }
            
        Query q = session.createQuery("update Character set "
                + "AccountId = '" + character.getAccount().getId() +  "' "
                + ",Name = '" + character.getName() +  "' "
                + ",RaceId = '" + character.getRace().getId() +  "' "
                + ",ClassId = '" + character.getCharclass().getId() +  "' "
                + ",ChestItemId = " + chestItemId +  " "
                + ",LegsItemId = " + legsItemId +  " "
                + ",BootsItemId = " + bootsItemId +  " "
                + ",WeaponItemId = " + weaponItemId +  " "
                + "where ID = '" + character.getId() +  "' ");
        rows = q.executeUpdate();
        tx.commit();
        //session.close();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }
        
        return rows;
    }
    
    public static ArrayList<DAL.Character> GetAllChactersOfAccount(int accId){
        ArrayList<DAL.Character> list = new ArrayList<DAL.Character>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
             
            Query q = session.createQuery("from Character where AccountId = " + accId);
            list = (ArrayList<DAL.Character>) q.list();
        
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
    
    public static int InsertCharacter(DAL.Character character){
        int rows = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
                /*Query q = session.createQuery("insert into Character(AccountId, Name, RaceId, ClassId) values ("
                        + character.getAccount().getId()
                        + "," + character.getName()
                        + "," + character.getRace().getId()
                        + "," + character.getCharclass().getId()
                        + ")");
                rows = q.executeUpdate();*/
            session.save(character);
            tx.commit();
        //session.close();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }
        
        return rows;
    }
    
    public static int DeleteCharacter(DAL.Character character){
        int rows = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
            
                /*Query q = session.createQuery("insert into Character(AccountId, Name, RaceId, ClassId) values ("
                        + character.getAccount().getId()
                        + "," + character.getName()
                        + "," + character.getRace().getId()
                        + "," + character.getCharclass().getId()
                        + ")");
                rows = q.executeUpdate();*/
                session.delete(tx);
                tx.commit();
        //session.close();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }
        
        return rows;
    }
}
