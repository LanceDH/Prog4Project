/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.Character;
import DAL.HibernateUtil;
import java.util.*;
import org.hibernate.*;

/**
 *
 * @author LanceDH
 */
public class CharacterServices {
    
    public static int UpdateCharacter(DAL.Character character){
        int rows = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            
            tx = session.beginTransaction();
            session.update(character);
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
            Query q = session.createQuery("from Character c left join fetch c.account left join fetch c.itemByBootsItemId left join fetch c.itemByWeaponItemId  left join fetch c.itemByChestItemId  left join fetch c.itemByLegsItemId left join fetch c.charclass  left join fetch c.race where AccountId = " + accId);
            list = (ArrayList<DAL.Character>) q.list();
            //because sort by is too mainstream
            Collections.sort(list, new Comparator<DAL.Character>() {
                @Override
                public int compare(Character t, Character t1) {
                    return t.getId().compareTo(t1.getId());
                }
            });
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
    
    public static int InsertCharacter(DAL.Character character) throws UIException{
        int rows = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            String name = character.getName();
            
            // http://www.leveluplunch.com/java/examples/capitalize-words-in-sentence/
            String[] exampleSplit = name.split(" ");
            StringBuffer sb = new StringBuffer();
            for (String word : exampleSplit) {
                sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));
                sb.append(" ");
            }
            name = sb.toString();
            character.setName(name.substring(0, name.length()-1));
            
            //character.getName()
            
            Query q = session.createQuery("from Character where name = :name");
            q.setParameter("name", character.getName());
            //rows = q.executeUpdate();
            //tx.commit();
            if (q.list().size() > 0) {
                throw new UIException("Character name is unavailable");
            }
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
        
        return rows;
    }
    
    public static int DeleteCharacter(DAL.Character character){
        int rows = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            
            tx = session.beginTransaction();

            session.delete(character);
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
    
    public static ArrayList<DAL.Character> GetCharactersLike(String search){
        return GetCharactersLike(search, -1);
    }
    
    public static ArrayList<DAL.Character> GetCharactersLike(String search, int accountId){
        ArrayList<DAL.Character> list = new ArrayList<DAL.Character>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            
            String sql = "from Character c left join fetch c.account left join fetch c.itemByBootsItemId i "
                    + "left join fetch c.itemByWeaponItemId  left join fetch c.itemByChestItemId  left join fetch c.itemByLegsItemId "
                    + "left join fetch c.charclass left join fetch c.race left join fetch i.slot where c.name like :search";
            if(accountId != -1){
                sql = "from Character c left join fetch c.account left join fetch c.itemByBootsItemId i "
                    + "left join fetch c.itemByWeaponItemId  left join fetch c.itemByChestItemId  left join fetch c.itemByLegsItemId "
                    + "left join fetch c.charclass left join fetch c.race left join fetch i.slot where c.name like :search and c.account.id = :id";
            } 
            
            
            Query q = session.createQuery(sql);
            q.setParameter("search", "%"+search+"%");
            if(accountId != -1){
                q.setParameter("id", accountId);
            } 
            list = (ArrayList<DAL.Character>) q.list();
            
            // alphabetical order
            Collections.sort(list, new Comparator<DAL.Character>() {
                @Override
                public int compare(Character t, Character t1) {
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
    
    public static DAL.Character GetChactersByName(String name){
        DAL.Character character = new DAL.Character();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            //Query q = session.createQuery("from Character c left join fetch c.account left join fetch c.itemByBootsItemId  left join fetch c.itemByWeaponItemId left join fetch c.itemByChestItemId left join fetch c.itemByLegsItemId left join fetch c.charclass left join fetch c.race where c.name like '" + name +"'");
            Query q = session.createQuery("from Character c left join fetch c.account left join fetch c.itemByBootsItemId  left join fetch c.itemByWeaponItemId left join fetch c.itemByChestItemId left join fetch c.itemByLegsItemId left join fetch c.charclass left join fetch c.race where c.name like :name");
            q.setParameter("name", name);
            System.out.println(q.list().size());
            character = (DAL.Character) q.list().get(0);
            //because sort by is too mainstream
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println(e.getMessage());
        }
        finally{
            session.close();
        }

        return character;
    }
}
