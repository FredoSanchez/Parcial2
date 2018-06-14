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
    private int vida;
    public void getNombre(){
        System.out.println("Centro de mando");
    }
    @Override
    public void labor(){
        System.out.println("Centro de mando en construcción.");
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }
}
