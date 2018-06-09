/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.vikingos;

import AbstractFactory.AbstractFactory;
import AbstractFactory.vikingos.construcciones.BuildingsFactory;
import AbstractFactory.vikingos.personajes.CharactersFactory;
import AbstractFactory.vikingos.vehiculos.VehiculesFactory;
import AbstractFactory.aztecas.Azteca;
import AbstractFactory.chinos.Chino;
/**
 *
 * @author fredy
 */
public class VikingosFactory implements AbstractFactory{
    @Override
    public Azteca getRazaAzteca(String type){
        return null;
    }

    @Override
    public Chino getRazaChina(String type) {
       
        return null;
    }
    
    @Override
    public Vikingo getRazaVikinga(String type){
        switch (type) {
            case "building":
                return new BuildingsFactory();
            case "character":
                return new CharactersFactory();
            case "vehicle":
                return new VehiculesFactory();
        }
        return null;
    }
}
