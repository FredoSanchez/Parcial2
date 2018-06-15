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
public interface Building {
    void labor();
    public String getNombre();
    void setFaseInicio(int numFase);
    int getFaseInicio();
    
    void setAlive(boolean estado);
    boolean getAlive();    
    
    int getVida();
    void setVida(int vida);
    
    void setUnidad(Character fighter);
    Character getUnidad();
    Character[] getUnidades();
}
