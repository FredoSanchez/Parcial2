/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas.construcciones;

/**
 *
 * @author fredy
 */
public class RecolectorPesca implements Construccion{
    @Override
    public void labor(){
        System.out.println("Recolector de pesca en construcción.");
    }
}
