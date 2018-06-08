/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas.personajes;

/**
 *
 * @author fredy
 */
public class GuerreroGuecha implements Personaje{
    @Override
    public void atacar(){
        System.out.println("Guerrero Guecha defendiendo");
    }
}
