/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.vikingos.construcciones;

import AbstractFactory.vikingos.Vikingo;
import AbstractFactory.vikingos.personajes.Character;
import AbstractFactory.vikingos.vehiculos.Vehicle;

/**
 *
 * @author fredy
 */
public class BuildingsFactory implements Vikingo{    
    @Override
    public Building getBuilding(String type){
        switch (type){
            case "godhaus":
                return new Godhaus();
            case "mana":
                return new RecolectorMana();
            case "carne":
                return new Carniceria();
            case "herreria":
                return new Herreria();
            case "cuartelValquirias":
                return new CuartelValquirias();
            case "cuartelBarbaros":
                return new CuartelBarbaros();
            case "chozaGigante":
                return new ChozaGigante();
        }
        return null;
    }
    
    @Override
    public Character getCharacter(String type){
        return null;
    }
    
    @Override
    public Vehicle getVehicle(String type){
        return null;
    }
    
}
