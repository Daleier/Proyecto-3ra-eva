/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author dam110
 */
public class ISBNyaExisteException extends Exception{
    
    @Override
    public String getMessage() {
        return "Ya existe un libro con este ISBN.";
    }

    
}