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
public class ChozaGigante implements Building{
    @Override
    public void labor(){
        System.out.println("Choza de gigante en construcción.");
    }
    @Override
    public String getNombre() {
        return "Carniceria";
    }
}
