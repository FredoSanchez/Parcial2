/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.chinos;

import AbstractFactory.AbstractFactory;
import AbstractFactory.aztecas.Azteca;
import AbstractFactory.chinos.construcciones.EdificacionesFactory;
import AbstractFactory.chinos.personajes.MiliciasFactory;
import AbstractFactory.chinos.vehiculos.TransportesFactory;
import AbstractFactory.vikingos.Vikingo;

/**
 *
 * @author fredy
 */
public class ChinosFactory implements AbstractFactory {
    @Override
    public Azteca getFromRazaAzteca(String type){
        return null;
    }

    @Override
    public Chino getFromRazaChina(String type) {
       switch (type) {
            case "edificacion":
                return new EdificacionesFactory();
            case "milicia":
                return new MiliciasFactory();
            case "transporte":
                return new TransportesFactory();
        }
        return null;
    }
    
    @Override
    public Vikingo getFromRazaVikinga(String type){
        return null;
    }
}
