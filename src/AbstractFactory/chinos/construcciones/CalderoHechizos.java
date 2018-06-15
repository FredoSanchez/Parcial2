/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.chinos.construcciones;


/**
 *
 * @author fredy
 */
public class CalderoHechizos implements Edificacion{
    @Override
    public void labor(){
        System.out.println("Magia haciendose");
    }
    @Override
    public String getNombre() {
        return "Caldero de hechizos";
    }
}
