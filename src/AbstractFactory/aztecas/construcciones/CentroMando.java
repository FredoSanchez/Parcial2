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
public class CentroMando implements Construccion{
    @Override
    public void labor(){
        System.out.println("Centro de mando en construcción.");
    }
}
