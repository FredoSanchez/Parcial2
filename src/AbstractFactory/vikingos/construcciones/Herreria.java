/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.vikingos.construcciones;

/**
 *
 * @author fredy
 */
public class Herreria implements Building{
    @Override
    public void labor(){
        System.out.println("Herrera en construcción.");
    }
    @Override
    public String getNombre() {
        return "Herreria";
    }
}
