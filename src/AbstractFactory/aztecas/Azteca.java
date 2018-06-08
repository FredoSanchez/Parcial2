/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas;

import AbstractFactory.aztecas.construcciones.Construccion;
import AbstractFactory.aztecas.personajes.Personaje;
import AbstractFactory.aztecas.vehiculos.Vehiculo;

/**
 *
 * @author fredy
 */
public interface Azteca{
    
    Construccion getConstruccion(String type);
    Personaje getPersonaje(String type);
    Vehiculo getVehiculo(String type);
}
