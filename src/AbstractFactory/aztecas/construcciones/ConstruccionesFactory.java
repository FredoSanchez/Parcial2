/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas.construcciones;

import AbstractFactory.aztecas.Azteca;
import AbstractFactory.aztecas.personajes.Personaje;

/**
 *
 * @author fredy
 */
public class ConstruccionesFactory implements Azteca{    
    @Override
    public Construccion getConstruccion(String type){
        switch (type){
            case "Sacrificio":
                return new TemploSacrificios();
        }
        return null;
    }
    
    @Override
    public Personaje getPersonaje(String type){
        return null;
    }
    
}
