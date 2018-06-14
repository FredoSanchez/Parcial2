/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.aztecas;

import AbstractFactory.AbstractFactory;
import AbstractFactory.aztecas.construcciones.ConstruccionesFactory;
import AbstractFactory.aztecas.personajes.PersonajesFactory;
import AbstractFactory.aztecas.vehiculos.VehiculosFactory;
import AbstractFactory.chinos.Chino;
import AbstractFactory.vikingos.Vikingo;

/**
 *
 * @author fredy
 */
public class AztecasFactory implements AbstractFactory {

    @Override
    public Azteca getFromRazaAzteca(String type) {
       switch (type) {
            case "construccion":
                return new ConstruccionesFactory();
            case "personaje":
                return new PersonajesFactory();
            case "vehiculo":
                return new VehiculosFactory();
        }
        return null;
    }
    
    @Override
    public Chino getFromRazaChina(String type){
        return null;
    }
    
    @Override
    public Vikingo getFromRazaVikinga(String type){
        return null;
    }
}
