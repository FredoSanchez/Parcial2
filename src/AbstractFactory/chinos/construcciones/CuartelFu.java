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
public class CuartelFu implements Edificacion{
    @Override
    public void labor(){
        System.out.println("Cuartel de LeonesFu en construcción.");
    }
    @Override
    public String getNombre() {
        return "Cuartel de leones Fu";
    }
}
