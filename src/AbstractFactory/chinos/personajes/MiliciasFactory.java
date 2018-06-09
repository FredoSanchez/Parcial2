/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.chinos.personajes;

import AbstractFactory.chinos.Chino;
import AbstractFactory.chinos.construcciones.Edificacion;
import AbstractFactory.chinos.vehiculos.Transporte;

/**
 *
 * @author fredy
 */
public class MiliciasFactory implements Chino {

    @Override
    public Edificacion getEdificacion(String type) {
        return null;
    }
    
    @Override
    public Milicia getMilicia(String type){
        switch(type){
            case "yaoguai":
                return new Yaoguai();
            case "terracota":
                return new SoldadoTerracota();
            case "leonFu":
                return new LeonFu();
        }
        return null;
    }
    
    @Override
    public Transporte getTransporte(String type){
        return null;
    }

}
