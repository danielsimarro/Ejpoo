/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooC14;

/**
 *
 * @author NitroPc
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Persona defecto = new Persona();
        
        System.out.println(defecto);
        
        Persona maria = new Persona("María", "López", "Fernández",
                "34443322J", 20);
        
        System.out.println(maria);
        
        maria.setEdad(30);
        
        System.out.println(maria);
        
    }
    
    
}
