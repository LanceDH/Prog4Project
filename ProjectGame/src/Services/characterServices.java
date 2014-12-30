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
        try {
            Transaction tx = session.beginTransaction();
             
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
            System.err.println(e.getMessage());
        }
        finally{
            
        }
        
        return rows;
    }
    
    public static ArrayList<DAL.Character> GetAllChactersOfAccount(int accId){
        ArrayList<DAL.Character> list = new ArrayList<DAL.Character>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
             
        Query q = session.createQuery("from Character where AccountId = " + accId);
        list = (ArrayList<DAL.Character>) q.list();
        } catch (Exception e) {
        }
        finally{
            //session.close();
        }

        return list;
    }
    
    
}
