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
public class ChozaYaogai implements Edificacion{
    @Override
    public void labor(){
        System.out.println("Choza de Yaogai en construcción.");
    }
    @Override
    public String getNombre() {
        return "Choza Yaogai";
    }
}
