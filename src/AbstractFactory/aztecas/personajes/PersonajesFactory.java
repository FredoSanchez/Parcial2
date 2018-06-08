/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas.personajes;

import AbstractFactory.aztecas.Azteca;
import AbstractFactory.aztecas.construcciones.Construccion;
import AbstractFactory.aztecas.vehiculos.Vehiculo;

/**
 *
 * @author fredy
 */
public class PersonajesFactory implements Azteca {

    @Override
    public Construccion getConstruccion(String type) {
        return null;
    }
    
    @Override
    public Personaje getPersonaje(String type){
        switch(type){
            case "aguila":
                return new GuerreroAguila();
            case "jaguar":
                return new GuerreroJaguar();
            case "guecha":
                return new GuerreroGuecha();
        }
        return null;
    }
    
    @Override
    public Vehiculo getVehiculo(String type){
        return null;
    }

}
