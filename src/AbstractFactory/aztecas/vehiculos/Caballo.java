/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas.vehiculos;

/**
 *
 * @author fredy
 */
public class Caballo implements Vehiculo{
    @Override
    public void transportar(){
        System.out.println("Transportando...");
    }
}
