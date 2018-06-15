/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.chinos.construcciones;

import AbstractFactory.chinos.personajes.Milicia;

/**
 *
 * @author fredy
 */
public interface Edificacion {
    void labor();
    String getNombre();
    void setFaseInicio(int numFase);
    int getFaseInicio();
    
    void setAlive(boolean estado);
    boolean getAlive();    
    
    int getVida();
    void setVida(int vida);
    
    void setUnidad(Milicia fighter);
    Milicia getUnidad();
    Milicia[] getUnidades();
}
