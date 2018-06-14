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
public class CuartelGuecha implements Construccion{
    private int vida;
    @Override
    public void labor(){
        System.out.println("Cuartel de guerreros Guecha en construcción.");
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
