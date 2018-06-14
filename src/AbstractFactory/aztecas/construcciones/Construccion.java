/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas.construcciones;

import AbstractFactory.aztecas.personajes.Personaje;

/**
 *
 * @author fredy
 */
public interface Construccion {
    void setFaseInicio(int numFase);
    int getFaseInicio();
    
    void setAlive(boolean estado);
    boolean getAlive();    
    
    void labor();
    
    String getNombre();
    
    int getVida();
    void setVida(int vida);
    void setUnidad(Personaje fighter);
    Personaje getUnidad();
    Personaje[] getUnidades();
}
