/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.vikingos.personajes;

import AbstractFactory.vikingos.Vikingo;
import AbstractFactory.vikingos.construcciones.Building;
import AbstractFactory.vikingos.vehiculos.Vehicle;

/**
 *
 * @author fredy
 */
public class CharactersFactory implements Vikingo {

    @Override
    public Building getBuilding(String type) {
        return null;
    }
    
    @Override
    public Character getCharacter(String type){
        switch(type){
            case "gigante":
                return new Gigante();
            case "barbaro":
                return new Barbaro();
            case "valquiria":
                return new Valquiria();
        }
        return null;
    }
    
    @Override
    public Vehicle getVehicle(String type){
        return null;
    }

}
