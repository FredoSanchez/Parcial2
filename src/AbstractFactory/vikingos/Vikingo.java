/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.vikingos;

import AbstractFactory.vikingos.construcciones.Building;
import AbstractFactory.vikingos.personajes.Character;
import AbstractFactory.vikingos.vehiculos.Vehicle;


public interface Vikingo {
    Building getBuilding(String type);
    Character getCharacter(String type);
    Vehicle getVehicle(String type);
}
