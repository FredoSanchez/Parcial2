/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas.vehiculos;

import AbstractFactory.aztecas.Azteca;
import AbstractFactory.aztecas.construcciones.Construccion;
import AbstractFactory.aztecas.personajes.Personaje;

/**
 *
 * @author fredy
 */
public class VehiculosFactory implements Azteca {

    @Override
    public Construccion getConstruccion(String type) {
        return null;
    }
    
    @Override
    public Personaje getPersonaje(String type){
        return null;
    }
    
    @Override
    public Vehiculo getVehiculo(String type){
        switch(type){
            case "caballo":
                return new Caballo();
        }
        return null;
    }

}
