/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.vikingos;

import AbstractFactory.AbstractFactory;
import AbstractFactory.vikingos.construcciones.ConstruccionesFactory;
import AbstractFactory.vikingos.personajes.PersonajesFactory;
import AbstractFactory.vikingos.vehiculos.VehiculosFactory;
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
            case "edificacion":
                return new ConstruccionesFactory();
            case "milicia":
                return new PersonajesFactory();
            case "transporte":
                return new VehiculosFactory();
        }
        return null;
    }
}
