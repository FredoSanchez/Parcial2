/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.chinos.vehiculos;

import AbstractFactory.chinos.Chino;
import AbstractFactory.chinos.construcciones.Edificacion;
import AbstractFactory.chinos.personajes.Milicia;

/**
 *
 * @author fredy
 */
public class TransportesFactory implements Chino {

    @Override
    public Edificacion getEdificacion(String type) {
        return null;
    }
    
    @Override
    public Milicia getMilicia(String type){
        return null;
    }
    
    @Override
    public Transporte getTransporte(String type){
        switch(type){
            case "zhao":
                return new Zhao();
            case "carruaje":
                return new Carruaje();
        }
        return null;
    }

}
