/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author LanceDH
 */
public class Validators {
    
    public static final int ACCNAME_MINLENGTH = 5;
    public static final int ACCNAME_MAXLENGTH = 25;
    public static final int PASSWORD_MINLENGTH = 5;
    public static final int PASSWORD_MAXLENGTH = 25;
    public static final int CHARACTER_MINLENGTH = 3;
    public static final int CHARACTER_MAXLENGTH = 25;
    
    
    public static boolean IsValidAccountName(String name) throws UIException{
        
        if (!name.matches("^[a-zA-Z]*$")) {
            throw new UIException("Name can only contain letters.");
        }
        
        if(name.length() < ACCNAME_MINLENGTH){
            throw new UIException("Name has to be at least "+ ACCNAME_MINLENGTH +" letters.");
        }
        
        if(name.length() > ACCNAME_MAXLENGTH){
            throw new UIException("Name must be less than "+ ACCNAME_MAXLENGTH +" letters.");
        }
        
        
        
        return true;
    }
    
    public static boolean IsValidPassword(String pass) throws UIException{
        
        if (!pass.matches("^[a-zA-Z0-9]*$")) {
            throw new UIException("Password can only contain letters and numbers.");
        }
        
        if(pass.length() < PASSWORD_MINLENGTH){
            throw new UIException("Password has to be at least "+ ACCNAME_MINLENGTH +" letters.");
        }
        
        if(pass.length() > PASSWORD_MAXLENGTH){
            throw new UIException("Password must be less than "+ ACCNAME_MAXLENGTH +" letters.");
        }
        
        return true;
    }
    
    public static boolean IsValidCharacterName(String name) throws UIException{
        
        if (!name.matches("^[a-zA-Z ]*$")) {
            throw new UIException("Name can only contain letters and spaces.");
        }
        
        if (!name.matches("^[[\\p{Alpha}]]+( [[\\p{Alpha}}]]+)*$")) {
            throw new UIException("Name has invalid use of spaces.");
        }
        
        if(name.length() < CHARACTER_MINLENGTH){
            throw new UIException("Name has to be at least "+ CHARACTER_MINLENGTH +" letters.");
        }
        
        if(name.length() > CHARACTER_MAXLENGTH){
            throw new UIException("Name must be less than "+ CHARACTER_MAXLENGTH +" letters.");
        }
        
        return true;
    }
}
