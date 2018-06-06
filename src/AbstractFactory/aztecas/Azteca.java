/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas;

import AbstractFactory.aztecas.construcciones.Construccion;

/**
 *
 * @author fredy
 */
public interface Azteca{
    
    Construccion getConstruccion(String type);
}
