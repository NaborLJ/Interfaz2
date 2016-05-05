/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author Nabor
 */
public interface Respirable {
    default public void respirar(){
        System.out.println("Respiran desde la interfaz");
    }
}
