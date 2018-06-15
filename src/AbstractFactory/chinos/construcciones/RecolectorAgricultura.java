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
public class RecolectorAgricultura implements Edificacion{
    @Override
    public void labor(){
        System.out.println("Recolector de agricultura en construcción.");
    }
    @Override
    public String getNombre() {
        return "Recolector de Agricultura";
    }
}
