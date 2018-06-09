/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.vikingos;

import AbstractFactory.vikingos.construcciones.Construccion;
import AbstractFactory.vikingos.personajes.Personaje;
import AbstractFactory.vikingos.vehiculos.Vehiculo;


public interface Vikingo {
    Construccion getConstruccion(String type);
    Personaje getPersonaje(String type);
    Vehiculo getVehiculo(String type);
}
