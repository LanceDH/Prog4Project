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
