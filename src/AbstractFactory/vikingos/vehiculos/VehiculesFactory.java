/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.vikingos.vehiculos;

import AbstractFactory.vikingos.Vikingo;
import AbstractFactory.vikingos.construcciones.Building;
import AbstractFactory.vikingos.personajes.Character;

/**
 *
 * @author fredy
 */
public class VehiculesFactory implements Vikingo {

    @Override
    public Building getBuilding(String type) {
        return null;
    }
    
    @Override
    public Character getCharacter(String type){
        return null;
    }
    
    @Override
    public Vehicle getVehicle(String type){
        switch(type){
            case "bifrost":
                return new Bifrost();
            case "barco":
                return new Barco();
        }
        return null;
    }

}
