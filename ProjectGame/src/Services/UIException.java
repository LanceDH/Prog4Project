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
public class UIException extends Exception{
    public UIException () {

    }

    public UIException (String message) {
        super (message);
    }

    public UIException (Throwable cause) {
        super (cause);
    }

    public UIException (String message, Throwable cause) {
        super (message, cause);
    }
}
