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
        session.beginTransaction();
             
        Query q = session.createQuery("from Account");
        list = (ArrayList<DAL.Account>) q.list();
                
        session.close();
        
        return list;
    }
}
