/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author LanceDH
 */
public class Password {
    public static final int MINLENGTH = 5;
    public static final int MAXLENGTH = 25;
    private static String error;
    
    private String pass;

    public Password(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean IsValid(){
        
        if (!pass.matches("^[a-zA-Z0-9]*$")) {
            error = "Password can only contain letters and numbers.";
            return false;
        }
        
        if(pass.length() < MINLENGTH){
            error = "Password has to be at least "+ MINLENGTH +" letters.";
            return false;
        }
        
        if(pass.length() > MAXLENGTH){
            error = "Password must be less than "+ MAXLENGTH +" letters.";
            return false;
        }
        
        return true;
    }
    
    public String getError() {
        return error;
    }
    
    
}
